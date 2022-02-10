package com.sn.senegalairlines.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

/**
 * A DTO for the Vol entity.
 */

public class VolDTO implements Serializable {

    private Long id;

    private String number;

    private Instant dateAndTimeOfDeparture;

    private Instant dateAndTimeOfArrival;

    private String countryDeparture;

    private String countryArrival;

    private String compagny;

    private BigDecimal price;

    private Instant createdAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Instant getDateAndTimeOfDeparture() {
        return dateAndTimeOfDeparture;
    }

    public void setDateAndTimeOfDeparture(Instant dateAndTimeOfDeparture) {
        this.dateAndTimeOfDeparture = dateAndTimeOfDeparture;
    }

    public Instant getDateAndTimeOfArrival() {
        return dateAndTimeOfArrival;
    }

    public void setDateAndTimeOfArrival(Instant dateAndTimeOfArrival) {
        this.dateAndTimeOfArrival = dateAndTimeOfArrival;
    }

    public String getCountryDeparture() {
        return countryDeparture;
    }

    public void setCountryDeparture(String countryDeparture) {
        this.countryDeparture = countryDeparture;
    }

    public String getCountryArrival() {
        return countryArrival;
    }

    public void setCountryArrival(String countryArrival) {
        this.countryArrival = countryArrival;
    }

    public String getCompagny() {
        return compagny;
    }

    public void setCompagny(String compagny) {
        this.compagny = compagny;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "VolDTO{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", dateAndTimeOfDeparture=" + dateAndTimeOfDeparture +
                ", dateAndTimeOfArrival=" + dateAndTimeOfArrival +
                ", countryDeparture='" + countryDeparture + '\'' +
                ", countryArrival='" + countryArrival + '\'' +
                ", compagny='" + compagny + '\'' +
                ", price=" + price +
                ", createdAt=" + createdAt +
                '}';
    }
}
