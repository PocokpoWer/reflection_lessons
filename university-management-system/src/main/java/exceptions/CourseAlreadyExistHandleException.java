package exceptions;

public class CourseAlreadyExistHandleException extends RuntimeException {
    public CourseAlreadyExistHandleException(String message) {
        super(message);
    }
}
