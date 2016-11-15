package in.ollie.innogysmarthome.exception;

/**
 * Thrown, when the authorization is missing.
 *
 * @author Oliver Kuhl - Initial contribution
 *
 */
@SuppressWarnings("serial")
public class UnauthorizedException extends ApiException {

    public UnauthorizedException() {
    }

    public UnauthorizedException(String message) {
        super(message);
    }

}
