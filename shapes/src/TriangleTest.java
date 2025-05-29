import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {
    @Test
    void shouldTrianglePeriMeter() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(12, triangle.getPerimeter());
    }

    @Test
    void shouldTriangleArea() {
        Triangle triangle = new Triangle(6, 4, 5);
        assertEquals(9.92, triangle.getArea(), 0.01);
    }
}
