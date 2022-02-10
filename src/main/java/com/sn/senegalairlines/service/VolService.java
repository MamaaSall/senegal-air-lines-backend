package com.sn.senegalairlines.service;

import com.sn.senegalairlines.dto.VolDTO;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing Vol.
 */
public interface VolService {


    /**
     * Get the "number" vol.
     *
     * @param number the number of the entity
     * @return the entity
     */
    Optional<VolDTO> findVolByNumber(String number);



    /**
     * GET  /vols/:countryArrival/:countryDeparture : get the vols.
     *
     * @param countryArrival the countryArrival of the entity
     * @param countryDeparture the countryDeparture of the entity
     * @return the entity
     */
    List<VolDTO> findAllByCountryArrivalAndCountryDeparture(String countryArrival, String countryDeparture);



}
