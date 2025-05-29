import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {
    @Test
    void shouldCirclePeriMeter() {
        Circle circle = new Circle(7);
        assertEquals(43.98, circle.getPerimeter(), 0.01);
    }

    @Test
    void shouldCircleArea() {
        Circle circle = new Circle(7);
        assertEquals(153.94, circle.getArea(), 0.01);
    }
}
