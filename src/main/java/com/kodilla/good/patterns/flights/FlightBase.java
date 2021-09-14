package com.kodilla.good.patterns.flights;

import java.util.*;
import java.util.stream.Collectors;

public class FlightBase {

    private final List<Flight> base = new ArrayList<>();

    public FlightBase() {
        addFlightsToBase();
    }

    private List<Flight> addFlightsToBase() {
        base.add(new Flight("Athens", "Rome"));
        base.add(new Flight("Warsaw", "Moscow"));
        base.add(new Flight("Warsaw", "Paris"));
        base.add(new Flight("Paris", "Washington"));
        base.add(new Flight("Warsaw", "Chicago"));
        base.add(new Flight("Chicago", "San Francisco"));
        base.add(new Flight("Chicago", "Washington"));
        base.add(new Flight("Rome", "Skopje"));
        base.add(new Flight("Paris", "Moscow"));
        return base;
    }

    public Set<Flight> findConnectingFlight(String departureAirport, String arrivalAirport) {
        Set<Flight> results = new HashSet<>();
        List<Flight> flightsWithAMatchingDepartureAirport = base.stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toList());

        List<Flight> flightsWithAMatchingArrivalAirport = base.stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());

        for (Flight flight1 : flightsWithAMatchingDepartureAirport) {
            for (Flight flight2 : flightsWithAMatchingArrivalAirport) {
                if (flight1.getArrivalAirport().equals(flight2.getDepartureAirport())) {
                    results.add(flight1);
                    results.add(flight2);
                }
            }
        }
        return results;
    }

    public Set<Flight> findAllFlightsToThisCity(String city) {
        return base.stream()
                .filter(flight -> flight.getArrivalAirport().equals(city))
                .collect(Collectors.toSet());
    }

    public Set<Flight> findAllFlightsFromThisCity(String city) {
        return base.stream()
                .filter(flight -> flight.getDepartureAirport().equals(city))
                .collect(Collectors.toSet());
    }

    @Override
    public String toString() {
        return "FlightBase{" +
                "base=" + base +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightBase that = (FlightBase) o;
        return Objects.equals(base, that.base);
    }

    @Override
    public int hashCode() {
        return Objects.hash(base);
    }
}