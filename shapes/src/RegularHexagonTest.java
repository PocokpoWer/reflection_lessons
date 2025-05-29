import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RegularHexagonTest {
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
