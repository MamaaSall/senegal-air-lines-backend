package com.sn.senegalairlines.service;

import com.sn.senegalairlines.domain.Vol;
import com.sn.senegalairlines.dto.VolDTO;
import com.sn.senegalairlines.repositories.VolRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Service Implementation for managing Vol.
 */
@Service
public class VolServiceImpl implements VolService{


    private final VolRepository volRepository;

    public VolServiceImpl(VolRepository volRepository) {
        this.volRepository = volRepository;
    }

    /**
     * Get Vol by number.
     *
     * @param number the number of the entity
     * @return the entity
     */
    @Override
    public Optional<VolDTO> findVolByNumber(String number) {
        return volRepository.findByNumber(number).map(this::getVolDTO);
    }


    public VolDTO getVolDTO(Vol vol){
        VolDTO volDTO = new VolDTO();
        volDTO.setId(vol.getId());
        volDTO.setCreatedAt(vol.getCreatedAt());
        volDTO.setNumber(vol.getNumber());
        volDTO.setDateAndTimeOfArrival(vol.getDateAndTimeOfArrival());
        volDTO.setDateAndTimeOfDeparture(vol.getDateAndTimeOfDeparture());
        volDTO.setCompagny(vol.getCompagny());
        volDTO.setCountryArrival(vol.getCountryArrival());
        volDTO.setCountryDeparture(vol.getCountryDeparture());
        volDTO.setPrice(vol.getPrice());
        return volDTO;
    }



    /**
     * GET  /vols/:countryArrival/:countryDeparture : get the vols.
     *
     * @param countryArrival the  of the entity
     * @return the entity
     */
    @Override
    public List<VolDTO> findAllByCountryArrivalAndCountryDeparture(String countryArrival, String countryDeparture){
        return volRepository.findAllByCountryArrivalAndCountryDeparture(countryArrival, countryDeparture)
                .stream()
                .map(this::getVolDTO)
                .collect(Collectors.toList());
    }


}
