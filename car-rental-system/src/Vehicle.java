public abstract class Vehicle {
    private String plateNumber;
    private double rentPrice;

    public Vehicle(String plateNumber, double rentPrice) {
        this.plateNumber = plateNumber;
        this.rentPrice = rentPrice;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public double getRentPrice() {
        return rentPrice;
    }

    public abstract double calculateRentalCost(int days);

    abstract void displayInfo();
}
