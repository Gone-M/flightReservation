
// Civan Metin - 101441732
// Maggie Hall - 101447078
// Tomer Edelman - 101400506

package com.example.groupassign2;

public class Flight {
    private final String flightNumber;
    private final String source;
    private final String destination;
    private final double fare;

    public Flight(String flightNumber, String source, String destination, double fare) {
        this.flightNumber = flightNumber;
        this.source = source;
        this.destination = destination;
        this.fare = fare;
    }
    
    public String getFlightNumber() {
        return flightNumber;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public double getFare() {
        return fare;
    }
}
