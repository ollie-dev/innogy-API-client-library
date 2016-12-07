package in.ollie.innogysmarthome.entity.capability;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SwitchActuator extends Capability {

    private Logger logger = LoggerFactory.getLogger(SwitchActuator.class);
    // public final static String ACTION_SET_STATE = "";

    private boolean onState;

    /**
     * @return the onState
     */
    public boolean isOnState() {
        return onState;
    }

    /**
     * @param onState the onState to set
     */
    public void setOnState(boolean onState) {
        this.onState = onState;
    }

}
