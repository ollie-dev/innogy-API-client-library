package in.ollie.innogysmarthome.exception;

/**
 * Thrown, if an action was called with invalid parameters.
 *
 * @author Oliver Kuhl - Initial contribution
 *
 */
@SuppressWarnings("serial")
public class InvalidActionTriggeredException extends ApiException {
    public InvalidActionTriggeredException() {
    }

    public InvalidActionTriggeredException(String message) {
        super(message);
    }
}
