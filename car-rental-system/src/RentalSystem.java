import java.util.ArrayList;
import java.util.List;

public class RentalSystem {
    private List<Car> availableCars = new ArrayList<>();

    public List<Car> getAvailableCars() {
        return availableCars;
    }

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
            if (cars.getPlateNumber().equals(plateNumber)) {
                foundCar = cars;
            }
        }
        return foundCar;
    }

    void rentCar(Car car, int days) {
        double totalPrice = car.calculateRentalCost(days);
        System.out.printf("You can rent %s for %s day. Total price: %.2f EUR%n", car, days, totalPrice);
    }
}
