package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Location downtown = new Location("Countryside");
        Transport bus = new Bus(50, FuelTypes.ELECTRIC, downtown);
        Transport taxi = new Taxi(4, FuelTypes.PETROL, downtown);
        Transport tram = new Tram(150, FuelTypes.ELECTRIC, downtown);
        List<Transport> list = List.of(bus, taxi, tram);
        double fixedDistance = 5.0;
        for (Transport t : list) {
            double calculateFare = t.calculateFare(fixedDistance);
            System.out.printf("Type: %s | Capacity: %d | Eco-friendly: %s | Fare for %.0f km: %.2f\n", t.typeName(), t.getCapacity(), t.ecoFriendlyLabel(), fixedDistance, calculateFare);
        }
    }
}