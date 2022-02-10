package com.sn.senegalairlines.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;


/**
 * A Vol.
 */

@Entity
@Table
public class Vol {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String number;

    @Column(name="date_departure")
    private Instant dateAndTimeOfDeparture;

    @Column(name="date_arrival")
    private Instant dateAndTimeOfArrival;

    @Column(name="country_departure")
    private String countryDeparture;

    @Column(name="country_arrival")
    private String countryArrival;

    @Column(name = "price", precision = 21, scale = 2)
    private BigDecimal price;

    private String compagny;

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

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vol{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", dateAndTimeOfDeparture=" + dateAndTimeOfDeparture +
                ", dateAndTimeOfArrival=" + dateAndTimeOfArrival +
                ", countryDeparture='" + countryDeparture + '\'' +
                ", countryArrival='" + countryArrival + '\'' +
                ", price=" + price +
                ", compagny='" + compagny + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
