package com.bobocode.oop.interfaces;

import java.util.Set;

public interface Flights {

    boolean register(String flightNumber);
    Set<String> findAll();


}
