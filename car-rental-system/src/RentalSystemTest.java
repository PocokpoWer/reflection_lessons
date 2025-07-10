import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RentalSystemTest {
    private RentalSystem rentalSystem;
    private Car car1, car2;

    @BeforeEach
    public void setUp() {
        rentalSystem = new RentalSystem();
        car1 = new Car("aaa111", 12.0, Brand.TRABANT, "601");
        car2 = new Car("bbb222", 18.5, Brand.BMW, "i8");
        rentalSystem.addCar(car1);
        rentalSystem.addCar(car2);
    }

    @Test
    public void shouldAddCar() {
        assertEquals(2, rentalSystem.getAvailableCars().size());
    }

    @Test
    public void shouldFindCarByPlateNumberFound() {
        Car found = rentalSystem.findCarByPlateNumber("bbb222");
        assertNotNull(found);
        assertEquals("bbb222", found.getPlateNumber());
    }

    @Test
    public void testRentCarCalculation() {
        double expected = 12.0 * 4;
        double actual = car1.calculateRentalCost(4);
        assertEquals(expected, actual, 0.001);
    }
}
