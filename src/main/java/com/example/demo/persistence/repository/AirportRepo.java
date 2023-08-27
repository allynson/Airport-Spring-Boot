package com.example.demo.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.persistence.model.Airport;

import java.util.List;

public interface AirportRepo extends JpaRepository<Airport, Long> {
    List<Airport> findByCityIgnoreCase(String city);
    List<Airport> findByCountryIgnoreCase(String country);
    Airport findByIataCodeIgnoreCase(String iataCode);
}
