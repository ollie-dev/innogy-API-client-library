package in.ollie.innogysmarthome.exception;

/**
 * Thrown, if the session is not initialized or disconnected.
 *
 * @author Oliver Kuhl - Initial contribution
 *
 */
@SuppressWarnings("serial")
public class SessionNotFoundException extends ApiException {

    public SessionNotFoundException() {
        super();
    }

    public SessionNotFoundException(String message) {
        super(message);
    }

}
