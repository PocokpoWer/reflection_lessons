import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class CommentValidatorTest {
    @Test
    public void shouldIsValidTrue(){
        CommentValidator commentValidator = new CommentValidator();
        assertTrue(commentValidator.isValid("asd123"));
    }
    @Test
    public void shouldIsValidFalse(){
        CommentValidator commentValidator = new CommentValidator();
        assertFalse(commentValidator.isValid("<something text>"));
    }

}
