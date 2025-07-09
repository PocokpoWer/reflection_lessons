import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    public void shouldCalculateRentalCost() {
        Car car = new Car("asd-123", 4.2, Brand.BMW, "i5");
        double expected = 12.60;
        assertEquals(expected, car.calculateRentalCost(3),0.01);
    }
}
