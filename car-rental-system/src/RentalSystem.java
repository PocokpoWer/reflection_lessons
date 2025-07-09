import java.util.ArrayList;
import java.util.List;

public class RentalSystem {
    List<Car> availableCars = new ArrayList<>();

    public void addCar(Car car) {
        availableCars.add(car);
    }

    void displayAvailableCars() {
        for (Car cars : availableCars) {
            System.out.println(cars);
        }
    }

    Car findCarByPlateNumber(String plateNumber) {
        Car foundCar = null;
        for (Car cars : availableCars) {
            if (cars.plateNumber.equals(plateNumber)) {
                foundCar = cars;
            }
        }
        return foundCar;
    }

    void rentCar(Car car, int days) {
        double totalPrice = car.calculateRentalCost(days);
        System.out.printf("You can rent %s for %s day. Total price: %.2f EUR", car, days, totalPrice);
    }
}
