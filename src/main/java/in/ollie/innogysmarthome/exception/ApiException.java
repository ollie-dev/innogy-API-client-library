package in.ollie.innogysmarthome.exception;

/**
 * Thrown, when the innogy SmartHome Client API returns an unknown error.
 *
 * @author Oliver Kuhl - Initial contribution
 */
@SuppressWarnings("serial")
public class ApiException extends Exception {

    public ApiException() {
    }

    public ApiException(String message) {
        super(message);
    }

}
