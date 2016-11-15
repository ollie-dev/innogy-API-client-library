/**
 *
 */
package in.ollie.innogysmarthome.exception;

/**
 * Thrown, when a session already exists while initializing a new session.
 *
 * @author Oliver Kuhl - Initial contribution
 *
 */
@SuppressWarnings("serial")
public class SessionExistsException extends ApiException {

    public SessionExistsException() {
    }

    /**
     * @param message
     */
    public SessionExistsException(String message) {
        super(message);
    }
}
