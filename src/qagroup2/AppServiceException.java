package qagroup2;

public class AppServiceException extends Exception {

    public AppServiceException() {
    }

    public AppServiceException(String message) {
        super(message);
    }

    public AppServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public AppServiceException(Throwable cause) {
        super(cause);
    }

    public AppServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
