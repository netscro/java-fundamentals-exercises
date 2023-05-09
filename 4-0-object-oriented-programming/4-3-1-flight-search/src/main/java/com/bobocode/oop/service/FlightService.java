package com.bobocode.oop.service;

import com.bobocode.oop.interfaces.Flights;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link FlightService} provides an API that allows to manage flight numbers
 * <p>
 * todo: 1. Using {@link com.bobocode.oop.data.FlightDao} implement method {@link FlightService#registerFlight(String)}
 * todo: 2. Using {@link com.bobocode.oop.data.FlightDao} implement method {@link FlightService#searchFlights(String)}
 */
public class FlightService {

    private Flights flights;

    public FlightService(Flights flights){
        this.flights = flights;
    }

    /**
     * Adds a new flight number
     *
     * @param flightNumber a flight number to add
     * @return {@code true} if a flight number was added, {@code false} otherwise
     */
    public boolean registerFlight(String flightNumber) {
        return flights.register(flightNumber);
    }

    /**
     * Returns all flight numbers that contains a provided key.
     *
     * @param query a search query
     * @return a list of found flight numbers
     */
    public List<String> searchFlights(String query) {

        List<String> queryFlights = new ArrayList<>();

       for (String flight: flights.findAll()){
           if(flight.contains(query)){
               queryFlights.add(flight);
           }
       }
       return queryFlights;
    }
}
