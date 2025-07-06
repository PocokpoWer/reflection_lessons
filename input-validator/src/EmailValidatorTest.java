import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EmailValidatorTest {
    @Test
    public void shouldReturnTrueWhenEmailIsValid(){
        EmailValidator emailValidator = new EmailValidator();
        assertTrue(emailValidator.isValid("asd@asd.com"));
    }
    @Test
    public void shouldReturnFalseWhenEmailIsNotValid(){
        EmailValidator emailValidator = new EmailValidator();
        assertFalse(emailValidator.isValid("a.asd@com"));
    }
    @Test
    public void shouldReturnFalseWhenEmailIsNotValid2(){
        EmailValidator emailValidator = new EmailValidator();
        assertFalse(emailValidator.isValid("a.a:)sd@com"));
    }
}
