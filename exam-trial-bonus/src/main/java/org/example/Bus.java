package org.example;

public class Bus extends PublicTransport {
    public Bus(int capacity, FuelTypes fuelTypes, Location location) {
        super(capacity, fuelTypes, location);
    }

    @Override
    public String typeName() {
        return "Bus";
    }

    @Override
    public double calculateFare(double kilometers) {
        return 1.5 + (0.2 * kilometers);
    }
}
