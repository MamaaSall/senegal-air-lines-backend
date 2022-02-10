package com.sn.senegalairlines.repositories;


import com.sn.senegalairlines.domain.Vol;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


/**
 * Spring Data  repository for the Vol entity.
 */
public interface VolRepository extends JpaRepository<Vol, Long> {

    Optional<Vol> findByNumber(String number);

    List<Vol> findAllByCountryArrivalAndCountryDeparture(String countryArrival, String countryDeparture);
}
