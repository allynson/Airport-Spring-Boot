package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.persistence.model.Airport;
import com.example.demo.persistence.repository.AirportRepo;

import java.util.List;

@Service
public class OpenFlightService implements FlightService{
    @Autowired
    private AirportRepo airportRepository;

    @Override
    public List<Airport> airportsByCity(String city) {
        return airportRepository.findByCityIgnoreCase(city);
    }

    @Override
    public List<Airport> airportsByCountry(String country) {
        return airportRepository.findByCountryIgnoreCase(country);
    }

    @Override
    public Airport airportByIataCode(String iataCode) {
        return airportRepository.findByIataCodeIgnoreCase(iataCode);
    }
}
