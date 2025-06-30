public class CommentValidator implements Validator<String> {
    @Override
    public boolean isValid(String input) {
        return input.matches("[a-zA-Z0-9 _!?\\.\\$\\-]*");
    }
}
