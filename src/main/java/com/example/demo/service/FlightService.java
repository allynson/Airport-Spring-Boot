package com.example.demo.service;

import java.util.List;
import com.example.demo.persistence.model.Airport;

public interface FlightService {
    List<Airport> airportsByCity(String city);

    List<Airport> airportsByCountry(String country);

    Airport airportByIataCode(String iataCode);
}
