

// Civan Metin - 101441732
// Maggie Hall - 101447078
// Tomer Edelman - 101400506


package com.example.groupassign2;

import java.time.LocalDate;

public class TomerEdelman3 {
    private final Flight flight;
    private final Passenger passenger;
    private final LocalDate travelDate;

    public TomerEdelman3(Flight flight, Passenger passenger, LocalDate travelDate) {
        this.flight = flight;
        this.passenger = passenger;
        this.travelDate = travelDate;
    }

    public Flight getFlight() {
        return flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public LocalDate getTravelDate() {
        return travelDate;
    }

    public double calculateTotalFare() {
        return flight.getFare();
    }

    @Override
    public String toString() {
        return String.format("TomerEdelman3 [Flight: %s, Passenger: %s, TravelDate: %s]", flight, passenger, travelDate);
    }
}
