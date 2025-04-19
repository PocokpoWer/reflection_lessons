import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    void shouldCountLetterB() {
        assertEquals(4, Main.countLetterB("sdasakBiudaiuBeeaBasdaB"));
    }

    @Test
    void shouldCounterText() {
        assertEquals(4, Main.counterText("asdadshelloashelloadfdfkdfksbhelloadgjavsdahello"));
    }
}
