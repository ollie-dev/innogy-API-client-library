/**
 *
 */
package in.ollie.innogysmarthome.exception;

/**
 * @author oliverkuhl
 *
 */
public class InnogyClientException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = -2612741351143735933L;

    /**
     *
     */
    public InnogyClientException() {
    }

    /**
     * @param message
     */
    public InnogyClientException(String message) {
        super(message);
    }

    /**
     * @param cause
     */
    public InnogyClientException(Throwable cause) {
        super(cause);
    }

    /**
     * @param message
     * @param cause
     */
    public InnogyClientException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @param message
     * @param cause
     * @param enableSuppression
     * @param writableStackTrace
     */
    public InnogyClientException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
