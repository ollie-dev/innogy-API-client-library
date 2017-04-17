package in.ollie.innogysmarthome.entity.state;

import in.ollie.innogysmarthome.Util;
import in.ollie.innogysmarthome.entity.device.Device;

public class DeviceState extends EntityState {

    /**
     * Returns, if the value of the state "IsReachable" is true.
     *
     * @return true or false for "reachable" {@link Device}s, else null.
     */
    public Boolean getIsReachable() {
        return getPropertyValueAsBoolean(STATE_NAME_ISREACHABLE);
    }

    public void setIsReachable(boolean isReachable) {
        setPropertyValueAsBoolean(STATE_NAME_ISREACHABLE, isReachable);
    }

    /**
     * Returns the configuration state of the device.
     *
     * @return
     */
    public String getDeviceConfigurationState() {
        return getPropertyValueAsString(STATE_NAME_DEVICECONFIGURATIONSTATE);
    }

    /**
     * Returns the device inclusion state.
     *
     * @return
     */
    public String getDeviceInclusionState() {
        return getPropertyValueAsString(STATE_NAME_DEVICEINCLUSIONSTATE);
    }

    /**
     * Returns true, if the device is included.
     *
     * @return
     */
    public Boolean deviceIsIncluded() {
        return Util.equalsIfPresent(getDeviceInclusionState(), DEVICE_INCLUSION_STATE_INCLUDED);
    }

    /**
     * Returns true, if the device inclusion state is "pending".
     *
     * @return
     */
    public Boolean deviceInclusionIsPending() {
        return Util.equalsIfPresent(getDeviceInclusionState(), DEVICE_INCLUSION_STATE_PENDING);
    }

    /**
     * Return the update state of the {@link Device}.
     *
     * @return
     */
    public String getDeviceUpdateState() {
        return getPropertyValueAsString(STATE_NAME_UPDATESTATE);
    }

    /**
     * Returns true if the {@link Device} is up to date.
     *
     * @return
     */
    public Boolean deviceIsUpToDate() {
        return Util.equalsIfPresent(getDeviceUpdateState(), DEVICE_UPDATE_STATE_UPTODATE);
    }

    /**
     * Returns the firmware version of the {@link Device}.
     *
     * @return
     */
    public String getFirmwareVersion() {
        return getPropertyValueAsString(STATE_NAME_FIRMWAREVERSION);
    }
}
