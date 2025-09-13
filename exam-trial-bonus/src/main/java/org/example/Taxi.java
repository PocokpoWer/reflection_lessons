package org.example;

public class Taxi extends Transport {
    public Taxi(int capacity, FuelTypes fuelTypes, Location location) {
        super(capacity, fuelTypes, location);
    }

    @Override
    public double calculateFare(double kilometers) {
        return 3.0 + (1.1 * kilometers);
    }

    @Override
    public String typeName() {
        return "Taxi";
    }
}
