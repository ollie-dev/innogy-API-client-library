package in.ollie.innogysmarthome.entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.joda.time.DateTime;

import com.google.api.client.util.Key;

import in.ollie.innogysmarthome.Constants;
import in.ollie.innogysmarthome.Util;
import in.ollie.innogysmarthome.entity.device.Device;

public abstract class ConfigPropertyList extends PropertyList {

    /** config property names */
    protected static final String CONFIG_PROPERTY_NAME = "Name";
    protected static final String CONFIG_PROPERTY_TIME_OF_ACCEPTANCE = "TimeOfAcceptance";
    protected static final String CONFIG_PROPERTY_TIME_OF_DISCOVERY = "TimeOfDiscovery";
    protected final static String CONFIG_PROPERTY_HARDWARE_VERSION = "HardwareVersion";
    protected final static String CONFIG_PROPERTY_SOFTWARE_VERSION = "SoftwareVersion";
    protected final static String CONFIG_PROPERTY_FIRMWARE_VERSION = "FirmwareVersion";
    protected final static String CONFIG_PROPERTY_HOSTNAME = "HostName";
    protected final static String CONFIG_PROPERTY_IP_ADDRESS = "IPAddress";
    protected final static String CONFIG_PROPERTY_MAC_ADDRESS = "MACAddress";
    protected final static String CONFIG_PROPERTY_REGISTRATION_TIME = "RegistrationTime";

    /**
     * This represents a container of all configuration properties.
     *
     * Optional.
     */
    @Key("Config")
    protected List<Property> configList;
    protected HashMap<String, Property> configMap;

    /**
     * @return the configList
     */
    public List<Property> getConfigList() {
        return configList;
    }

    /**
     * @param configList the configList to set
     */
    public void setConfigList(List<Property> configList) {
        this.configList = configList;
    }

    /**
     * Returns true, if config properties are available.
     *
     * @return
     */
    public boolean hasConfigProperties() {
        if (configList != null && !configList.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see in.ollie.innogysmarthome.entity.PropertyList#getPropertyMap()
     */
    @Override
    protected Map<String, Property> getPropertyMap() {
        if (configMap == null) {
            configMap = Property.getHashMap(configList);
        }

        return configMap;
    }

    /**
     * @return
     */
    public Map<String, Property> getConfigMap() {
        return getPropertyMap();
    }

    /**
     * Returns the name of the {@link Device}.
     *
     * @return
     */
    public String getName() {
        return getPropertyValueAsString(CONFIG_PROPERTY_NAME);
    }

    /**
     * Returns the time, when the {@link Device} was added to the SHC configuration.
     *
     * @return
     */
    public DateTime getTimeOfAcceptance() {
        String time = getPropertyValueAsString(CONFIG_PROPERTY_TIME_OF_ACCEPTANCE);
        if (time == null) {
            return null;
        } else {
            return Util.convertZuluTimeStringToDate(time);
        }
    }

    /**
     * Returns the time, when the {@link Device} was discovered by the SHC.
     *
     * @return
     */
    public DateTime getTimeOfDiscovery() {
        String time = getPropertyValueAsString(CONFIG_PROPERTY_TIME_OF_DISCOVERY);
        if (time == null) {
            return null;
        } else {
            return Util.convertZuluTimeStringToDate(time);
        }
    }

    public String getHardwareVersion() {
        return getPropertyValueAsString(CONFIG_PROPERTY_HARDWARE_VERSION);
    }

    public String getSoftwareVersion() {
        return getPropertyValueAsString(CONFIG_PROPERTY_SOFTWARE_VERSION);
    }

    public String getFirmwareVersion() {
        return getPropertyValueAsString(CONFIG_PROPERTY_FIRMWARE_VERSION);
    }

    public String getHostName() {
        return getPropertyValueAsString(CONFIG_PROPERTY_HOSTNAME);
    }

    public String getIpAddress() {
        return getPropertyValueAsString(CONFIG_PROPERTY_IP_ADDRESS);
    }

    public String getMacAddress() {
        return getPropertyValueAsString(CONFIG_PROPERTY_MAC_ADDRESS);
    }

    public DateTime getRegistrationTime() {
        return Util.convertZuluTimeStringToDate(getPropertyValueAsString(CONFIG_PROPERTY_REGISTRATION_TIME));
    }

    public String getRegistrationTimeFormattedString() {
        return Util.convertZuluTimeStringToDate(getPropertyValueAsString(CONFIG_PROPERTY_REGISTRATION_TIME))
                .toString(Constants.FORMAT_DATETIME);
    }
}
