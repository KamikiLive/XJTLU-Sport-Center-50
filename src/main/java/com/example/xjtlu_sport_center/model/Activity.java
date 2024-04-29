package com.example.xjtlu_sport_center.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "activities")
public class Activity {
    @Id
    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "price_per_hour", nullable = false)
    private double pricePerHour;

    @Column(name = "description")
    private String description;

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
