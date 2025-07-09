public class Car extends Vehicle {
    Brand brand;
    String model;

    public Car(String plateNumber, double rentPrice, Brand brand, String model) {
        super(plateNumber, rentPrice);
        this.brand = brand;
        this.model = model;
    }

    @Override
    void displayInfo() {
        System.out.printf("Brand: %s Model: %s Plate number: %s Rent price: %.2f\n", brand, model, plateNumber, rentPrice);
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentPrice * days;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %.2f EUR", brand, model, plateNumber, rentPrice);
    }
}
