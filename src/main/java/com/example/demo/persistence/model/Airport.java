package com.example.demo.persistence.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name="airport")
public class Airport {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String city;
    private String country;
    @Column(name="iatacode")
    private String iataCode;
    @Column(name="icaocode")
    private String icaoCode;
    private double latitude;
    private double longitude;
    private double altitude;
    @Column(name="offsetutc")
    private double offsetFromUTC;
    private String timezone;
}
