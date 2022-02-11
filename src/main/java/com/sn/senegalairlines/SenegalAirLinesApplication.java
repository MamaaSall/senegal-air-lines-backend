package com.sn.senegalairlines;

import com.sn.senegalairlines.domain.Vol;
import com.sn.senegalairlines.repositories.VolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.Instant;

/**
 * @author Mama Sall.
 */
@SpringBootApplication
public class SenegalAirLinesApplication implements CommandLineRunner {

	@Autowired
	private VolRepository volRepository;

	public static void main(String[] args) {
		SpringApplication.run(SenegalAirLinesApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {

		Vol vol = new Vol();
		vol.setNumber("9874563210");
		vol.setDateAndTimeOfDeparture(Instant.now());
		vol.setDateAndTimeOfArrival(Instant.now());
		vol.setCountryArrival("France");
		vol.setCountryDeparture("Sénégal");
		vol.setPrice(new BigDecimal(2000));
		vol.setCompagny("Air France");
		vol.setCreatedAt(Instant.now());
		volRepository.save(vol);
	}

}
