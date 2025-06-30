public class EmailValidator implements Validator<String> {
    @Override
    public boolean isValid(String input) {
        return input.contains("@") && input.contains(".") && input.indexOf("@") < input.lastIndexOf(".");
    }
}
