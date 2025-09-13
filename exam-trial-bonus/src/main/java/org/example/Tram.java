package org.example;

public class Tram extends Transport {
    public Tram(int capacity, FuelTypes fuelTypes, Location location) {
        super(capacity, fuelTypes, location);
    }

    @Override
    public double calculateFare(double kilometers) {
        return 1.0 + (0.15 * kilometers);
    }

    @Override
    public String typeName() {
        return "Tram";
    }
}
