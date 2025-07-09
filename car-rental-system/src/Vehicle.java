public abstract class Vehicle {
    String plateNumber;
    double rentPrice;

    public Vehicle(String plateNumber, double rentPrice) {
        this.plateNumber = plateNumber;
        this.rentPrice = rentPrice;
    }

    public Vehicle() {
    }

    public abstract double calculateRentalCost(int days);

    abstract void displayInfo();
}
