package exceptions;

public class StudentAlreadyExistHandleException extends RuntimeException {
    public StudentAlreadyExistHandleException(String message) {
        super(message);
    }
}
