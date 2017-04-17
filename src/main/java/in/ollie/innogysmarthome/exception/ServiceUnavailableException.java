package in.ollie.innogysmarthome.exception;

/**
 * Thrown, if the innogy service is unavailable (HTTP response 503).
 *
 * @author Oliver Kuhl - Initial contribution
 *
 */
public class ServiceUnavailableException extends ApiException {

    /**
     *
     */
    private static final long serialVersionUID = -9148687420729079329L;

    public ServiceUnavailableException(String message) {
        super(message);
    }
}
