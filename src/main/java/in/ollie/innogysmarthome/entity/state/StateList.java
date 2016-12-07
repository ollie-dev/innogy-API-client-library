package in.ollie.innogysmarthome.entity.state;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.joda.time.DateTime;

import com.google.api.client.util.Key;

import in.ollie.innogysmarthome.Util;
import in.ollie.innogysmarthome.entity.Property;
import in.ollie.innogysmarthome.entity.PropertyList;
import in.ollie.innogysmarthome.entity.device.Device;

public abstract class StateList extends PropertyList {

    /** state property field names */
    protected static final String STATE_PROPERTY_NAME = "name";
    protected static final String STATE_PROPERTY_VALUE = "value";
    protected static final String STATE_PROPERTY_LASTCHANGED = "lastchanged";

    /** state name list */
    protected static final String STATE_NAME_ISREACHABLE = "IsReachable";
    protected static final String STATE_NAME_DEVICECONFIGURATIONSTATE = "DeviceConfigurationState";
    protected static final String STATE_NAME_DEVICEINCLUSIONSTATE = "DeviceInclusionState";
    protected static final String STATE_NAME_UPDATESTATE = "UpdateState";
    protected static final String STATE_NAME_FIRMWAREVERSION = "FirmwareVersion";

    /** state name list - SHC specials */
    protected static final String STATE_NAME_UPDATEAVAILABLE = "UpdateAvailable";
    protected static final String STATE_NAME_LASTREBOOT = "LastReboot";
    protected static final String STATE_NAME_MBUSDONGLEATTACHED = "MBusDongleAttached";
    protected static final String STATE_NAME_LBDONGLEATTACHED = "LBDongleAttached";
    protected static final String STATE_NAME_CONFIGVERSION = "ConfigVersion";
    protected static final String STATE_NAME_OSSTATE = "OSState";
    protected static final String STATE_NAME_MEMORYLOAD = "MemoryLoad";
    protected static final String STATE_NAME_CPULOAD = "CPULoad";

    /**
     * This represents a container of all configuration properties.
     *
     * Optional.
     */
    @Key("State")
    protected List<Property> stateList;

    protected HashMap<String, Property> stateMap;

    /**
     * @return the stateList
     */
    public List<Property> getStateList() {
        return stateList;
    }

    /**
     * @param stateList the stateList to set
     */
    public void setStateList(List<Property> stateList) {
        this.stateList = stateList;
    }

    /*
     * (non-Javadoc)
     *
     * @see in.ollie.innogysmarthome.entity.PropertyList#getPropertyMap()
     */
    @Override
    protected Map<String, Property> getPropertyMap() {
        if (stateMap == null) {
            stateMap = Property.getHashMap(stateList);
        }

        return stateMap;
    }

    /**
     * @return
     */
    public Map<String, Property> getStateMap() {
        return getPropertyMap();
    }

    /**
     * Returns the name of the state.
     *
     * @return
     */
    public String getName() {
        return getPropertyValueAsString(STATE_PROPERTY_NAME);
    }

    /**
     * Returns the value of the state.
     *
     * @return
     */
    public Object getValue() {
        return getPropertyValue(STATE_PROPERTY_VALUE);
    }

    /**
     * Returns the {@link DateTime}, when the last state change occurred.
     *
     * @return
     */
    public DateTime getLastChanged() {
        String time = getPropertyValueAsString(STATE_PROPERTY_LASTCHANGED);
        if (time == null) {
            return null;
        } else {
            return Util.convertZuluTimeStringToDate(time);
        }
    }

    /**
     * Returns, if the value of the state "IsReachable" is true.
     *
     * @return true or false for "reachable" {@link Device}s, else null.
     */
    public Boolean getIsReachable() {
        return getPropertyValueAsBoolean(STATE_NAME_ISREACHABLE);
    }
}