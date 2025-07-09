public class Main {
    public static void main(String[] args) {
        RentalSystem rentalSystem = new RentalSystem();
        rentalSystem.addCar(new Car("rbc-234", 23.3, Brand.BMW, "i5"));
        rentalSystem.addCar(new Car("kju-219", 15.2, Brand.MERCEDES, "Connecto"));
        rentalSystem.addCar(new Car("aqw-253", 10.2, Brand.TRABANT, "601"));

        rentalSystem.displayAvailableCars();
        rentalSystem.rentCar(rentalSystem.findCarByPlateNumber("kju-219"), 4);

    }
}