package com.kodilla.good.patterns.flights;

public class FlightRunner {

    public static void main(String[] args) {

        FlightBase flightBase = new FlightBase();
        Flight flight = new Flight("Rome", "Warsaw");

        System.out.println(flightBase.findConnectingFlight("Warsaw", "Moscow"));
        System.out.println(flightBase.findAllFlightsToThisCity("Chicago"));
        System.out.println(flightBase.findAllFlightsFromThisCity("Athens"));
    }
}