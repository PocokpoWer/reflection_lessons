public class UsernameValidator implements Validator<String> {
    @Override
    public boolean isValid(String input) {
        return input.matches("^[A-Za-z0-9 _]+$");
    }
}
