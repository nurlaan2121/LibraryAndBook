public class NOTFOUNDEXCEPTION extends RuntimeException {
    public NOTFOUNDEXCEPTION() {
    }

    public NOTFOUNDEXCEPTION(String message) {
        super(message);
    }

    public NOTFOUNDEXCEPTION(String message, Throwable cause) {
        super(message, cause);
    }

    public NOTFOUNDEXCEPTION(Throwable cause) {
        super(cause);
    }

    public NOTFOUNDEXCEPTION(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
