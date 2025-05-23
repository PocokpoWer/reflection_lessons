import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ChefTest {
    @Test
    void shouldCook() {
        Chef chef = new Chef("John", 45, Gender.MAN);
        assertEquals("John has cooked some pizza", chef.cook("pizza"));
    }
}
