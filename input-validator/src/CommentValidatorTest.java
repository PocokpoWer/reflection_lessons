import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class CommentValidatorTest {
    @Test
    public void shouldReturnTrueWhenCommentIsValid(){
        CommentValidator commentValidator = new CommentValidator();
        assertTrue(commentValidator.isValid("asd123"));
    }
    @Test
    public void shouldReturnFalseWhenCommentIsNotValid(){
        CommentValidator commentValidator = new CommentValidator();
        assertFalse(commentValidator.isValid("<something text>"));
    }

}
