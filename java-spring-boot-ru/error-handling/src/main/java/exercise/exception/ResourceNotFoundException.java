package exercise.exception;

// BEGIN
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String format) {
        super(format);
    }
}
// END
