package com.example.demo.web.control;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.persistence.model.Airport;
import com.example.demo.service.FlightService;

import java.util.List;


@RestController
@RequestMapping(value="/city")
public class CitySearch {
    private static final Logger logger = (Logger) LoggerFactory.getLogger(CitySearch.class);

    @Autowired
    private FlightService flightService;

    @RequestMapping(value="/{cityName}", method= RequestMethod.GET)
    public List<Airport> search(@PathVariable String cityName) {
        List<Airport> retval = flightService.airportsByCity(cityName);
        if(retval != null) {
            logger.info("Aeroportos para a cidade {}: {}", cityName, retval.size());
        } else {
            logger.info("Aeroportos para a cidade {}: 0", cityName);
        }
        return retval;
    }
}
