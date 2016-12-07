package in.ollie.innogysmarthome.exception;

/**
 * Thrown, if the {@Link Configuration} is not complete
 *
 * @author Oliver Kuhl - Initial contribution
 *
 */
@SuppressWarnings("serial")
public class ConfigurationException extends Exception {

    public ConfigurationException() {
    }

    public ConfigurationException(String message) {
        super(message);
    }

}
