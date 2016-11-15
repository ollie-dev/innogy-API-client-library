package in.ollie.innogysmarthome.exception;

/**
 * Thrown, if an error occurs fetching the access tokens.
 *
 * @author Oliver Kuhl - Initial contribution
 *
 */
@SuppressWarnings("serial")
public class InvalidAuthCodeException extends ApiException {

    public InvalidAuthCodeException() {
    }

    public InvalidAuthCodeException(String message) {
        super(message);
    }

}
