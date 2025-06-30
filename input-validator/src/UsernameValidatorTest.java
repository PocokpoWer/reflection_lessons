import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UsernameValidatorTest {
    @Test
    public void shouldIsValidTrue(){
        UsernameValidator usernameValidator = new UsernameValidator();
        assertTrue(usernameValidator.isValid("hottentotta123"));
    }
    @Test
    public void shouldIsValidFalse(){
        UsernameValidator usernameValidator = new UsernameValidator();
        assertFalse(usernameValidator.isValid("hottentotta</text>"));
    }
}
