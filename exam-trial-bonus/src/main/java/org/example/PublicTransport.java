package org.example;

public abstract class PublicTransport extends Transport {
    public PublicTransport(int capacity, FuelTypes fuelTypes, Location location) {
        super(capacity, fuelTypes, location);
    }
}
