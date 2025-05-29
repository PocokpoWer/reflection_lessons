import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {
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
}
