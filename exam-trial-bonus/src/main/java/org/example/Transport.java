package org.example;

public abstract class Transport implements EcoFriendly {
    private int capacity;
    private FuelTypes fuelTypes;
    private Location location;

    public Transport(int capacity, FuelTypes fuelTypes, Location location) {
        this.capacity = capacity;
        this.fuelTypes = fuelTypes;
        this.location = location;
    }

    public int getCapacity() {
        return capacity;
    }

    public FuelTypes getFuelTypes() {
        return fuelTypes;
    }

    public Location getLocation() {
        return location;
    }

    @Override
    public boolean isEcoFriendly() {
        return fuelTypes.equals(FuelTypes.ELECTRIC) || fuelTypes.equals(FuelTypes.HYBRID);
    }

    public abstract double calculateFare(double kilometers);

    public abstract String typeName();

    @Override
    public String toString() {
        return typeName() + " capacity=" + ", fuel=" + fuelTypes + ")";
    }
}
