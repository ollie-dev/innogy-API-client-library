package in.ollie.innogysmarthome.exception;

import java.io.IOException;

/**
 * Thrown, if the innogy SmartHome controller (SHC) is offline.
 *
 * @author Oliver Kuhl - Initial contribution
 *
 */
@SuppressWarnings("serial")
public class ControllerOfflineException extends IOException {

    public ControllerOfflineException() {
    }

    public ControllerOfflineException(String message) {
        super(message);
    }

}
