import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EmailValidatorTest {
    @Test
    public void shouldIsValidTrue(){
        EmailValidator emailValidator = new EmailValidator();
        assertTrue(emailValidator.isValid("asd@asd.com"));
    }
    @Test
    public void shouldIsValidFalse(){
        EmailValidator emailValidator = new EmailValidator();
        assertFalse(emailValidator.isValid("a.asd@com"));
    }
}
