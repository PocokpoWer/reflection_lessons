import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    void shouldCountLetterB() {
        assertEquals(4, Main.countLetterB("sdasakBiudaiuBeeaBasdaB"));
    }

    @Test
    void shouldCountLetterBZero() {
        assertEquals(0, Main.countLetterB("sdasakiudaiueeaasda"));
    }

    @Test
    void shouldCountHellos() {
        assertEquals(4, Main.countHellos("asdadshelloashelloadfdfkdfksbhelloadgjavsdahello"));
    }

    @Test
    void shouldCountHellosZero() {
        assertEquals(0, Main.countHellos("asdadslloaslloadfdfkdfksbadgjavsdlo"));
    }
}
