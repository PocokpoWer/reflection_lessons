import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MainTest {
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

    @Test
    void shouldRectanglePeriMeter() {
        Rectangle rectangle = new Rectangle(5, 8);
        assertEquals(40, rectangle.getArea());
    }

    @Test
    void shouldRectangleArea() {
        Rectangle rectangle = new Rectangle(8, 5);
        assertEquals(26, rectangle.getPerimeter());
    }

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

    @Test
    void shouldRegularHexagonPerimeter() {
        RegularHexagon regularHexagon = new RegularHexagon(4);
        assertEquals(24, regularHexagon.getPerimeter());
    }

    @Test
    void shouldRegularHexagonArea() {
        RegularHexagon regularhexagon = new RegularHexagon(4);
        assertEquals(41.57, regularhexagon.getArea(), 0.01);
    }
}
