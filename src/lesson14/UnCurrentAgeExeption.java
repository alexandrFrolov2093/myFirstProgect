package lesson14;

public class UnCurrentAgeExeption extends Exception {

    public UnCurrentAgeExeption() {
    }

    public UnCurrentAgeExeption(String message) {
        super(message);
    }

    public UnCurrentAgeExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public UnCurrentAgeExeption(Throwable cause) {
        super(cause);
    }

    public UnCurrentAgeExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
