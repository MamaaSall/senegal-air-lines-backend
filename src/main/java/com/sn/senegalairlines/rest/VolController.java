package com.sn.senegalairlines.rest;

import com.sn.senegalairlines.dto.VolDTO;
import com.sn.senegalairlines.service.VolService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.Optional;


/**
 * REST controller for managing Vol.
 */
@RestController
@RequestMapping("/api")
public class VolController {

    private final Logger log = LoggerFactory.getLogger(VolController.class);

    private final VolService volService;

    public VolController(VolService volServices) {
        this.volService = volServices;
    }


    /**
     * GET  /vol/:number : get the vol.
     *
     * @param number the number of the VolDTO
     * @return the ResponseEntity with status 200 (OK) and with body the VolDTO, or with status 404 (Not Found)
     */
    @GetMapping("/vol/{number}")
    public ResponseEntity<Optional<VolDTO>> getVolByNumber(@PathVariable String number) {
        log.debug("REST request to get Vol : {}", number);
        return ResponseEntity.ok().body(volService.findVolByNumber(number));
    }


    /**
     * GET  /vols/:countryArrival/:countryDeparture : get the vols.
     *
     * @param countryArrival the countryArrival of the VolDTO
     * @param countryDeparture the countryDeparture of the VolDTO
     * @return the ResponseEntity with status 200 (OK) and with body the VolDTO, or with status 404 (Not Found)
     */
    @GetMapping("/vols/{countryArrival}/{countryDeparture}")
    public ResponseEntity<List<VolDTO>> getVolByNumber(@PathVariable String countryArrival,
                                                       @PathVariable String countryDeparture) {
        log.debug("REST request to get Vols : {}, {}", countryArrival, countryDeparture);
        return ResponseEntity.ok().body(volService.findAllByCountryArrivalAndCountryDeparture(countryArrival, countryDeparture));
    }
}
