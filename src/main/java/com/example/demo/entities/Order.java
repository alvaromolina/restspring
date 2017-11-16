package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "orden")
public class Order {

    private Long id;

    private Double latitude;
    private Double longitude;


    private Double latitudeDest;
    private Double longitudeDest;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLatitudeDest() {
        return latitudeDest;
    }

    public void setLatitudeDest(Double latitudeDest) {
        this.latitudeDest = latitudeDest;
    }

    public Double getLongitudeDest() {
        return longitudeDest;
    }

    public void setLongitudeDest(Double longitudeDest) {
        this.longitudeDest = longitudeDest;
    }
}
