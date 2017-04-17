package in.ollie.innogysmarthome.entity;

import java.util.ArrayList;
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
    protected static final String CONFIG_PROPERTY_PROTOCOL_ID = "ProtocolId";
    protected static final String CONFIG_PROPERTY_TIME_OF_ACCEPTANCE = "TimeOfAcceptance";
    protected static final String CONFIG_PROPERTY_TIME_OF_DISCOVERY = "TimeOfDiscovery";
    protected final static String CONFIG_PROPERTY_HARDWARE_VERSION = "HardwareVersion";
    protected final static String CONFIG_PROPERTY_SOFTWARE_VERSION = "SoftwareVersion";
    protected final static String CONFIG_PROPERTY_FIRMWARE_VERSION = "FirmwareVersion";
    protected final static String CONFIG_PROPERTY_HOSTNAME = "HostName";
    protected final static String CONFIG_PROPERTY_ACTIVITY_LOG_ENABLED = "ActivityLogEnabled";
    protected final static String CONFIG_PROPERTY_CONFIGURATION_STATE = "ConfigurationState";
    protected final static String CONFIG_PROPERTY_GEOLOCATION = "GeoLocation";
    protected final static String CONFIG_PROPERTY_TIMEZONE = "TimeZone";
    protected final static String CONFIG_PROPERTY_CURRENT_UTC_OFFSET = "CurrentUTCOffset";
    protected final static String CONFIG_PROPERTY_IP_ADDRESS = "IPAddress";
    protected final static String CONFIG_PROPERTY_MAC_ADDRESS = "MACAddress";
    protected final static String CONFIG_PROPERTY_SHC_TYPE = "ShcType";
    protected final static String CONFIG_PROPERTY_BACKEND_CONNECTION_MONITORED = "BackendConnectionMonitored";
    protected final static String CONFIG_PROPERTY_RFCOM_FAILURE_NOTIFICATION = "RFCommFailureNotification";
    protected final static String CONFIG_PROPERTY_POSTCODE = "PostCode";
    protected final static String CONFIG_PROPERTY_CITY = "City";
    protected final static String CONFIG_PROPERTY_STREET = "Street";
    protected final static String CONFIG_PROPERTY_HOUSENUMBER = "HouseNumber";
    protected final static String CONFIG_PROPERTY_COUNTRY = "Country";
    protected final static String CONFIG_PROPERTY_HOUSEHOLD_TYPE = "HouseholdType";
    protected final static String CONFIG_PROPERTY_NUMBER_OF_PERSONS = "NumberOfPersons";
    protected final static String CONFIG_PROPERTY_NUMBER_OF_FLOORS = "NumberOfFloors";
    protected final static String CONFIG_PROPERTY_LIVINGAREA = "LivingArea";
    protected final static String CONFIG_PROPERTY_REGISTRATION_TIME = "RegistrationTime";
    protected final static String CONFIG_PROPERTY_DISPLAY_CURRENT_TEMPERATURE = "DisplayCurrentTemperature";
    protected final static String CONFIG_PROPERTY_UNDERLYING_DEVICE_IDS = "UnderlyingDeviceIds";

    protected final static String PROTOCOL_ID_COSIP = "Cosip";
    protected final static String PROTOCOL_ID_VIRTUAL = "Virtual";

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
            configMap = PropertyList.getHashMap(configList);
        }

        return configMap;
    }

    /*
     * (non-Javadoc)
     * 
     * @see in.ollie.innogysmarthome.entity.PropertyList#getPropertyList()
     */
    @Override
    protected List<Property> getPropertyList() {
        if (configList == null) {
            configList = new ArrayList<Property>();
        }

        return configList;
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

    public String getProtocolId() {
        return getPropertyValueAsString(CONFIG_PROPERTY_PROTOCOL_ID);
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

    public Boolean getActivityLogEnabled() {
        return getPropertyValueAsBoolean(CONFIG_PROPERTY_ACTIVITY_LOG_ENABLED);
    }

    public String getConfigurationState() {
        return getPropertyValueAsString(CONFIG_PROPERTY_CONFIGURATION_STATE);
    }

    public String getGeoLocation() {
        return getPropertyValueAsString(CONFIG_PROPERTY_GEOLOCATION);
    }

    public String getTimeZone() {
        return getPropertyValueAsString(CONFIG_PROPERTY_TIMEZONE);
    }

    public Integer getCurrentUTCOffset() {
        return getPropertyValueAsInteger(CONFIG_PROPERTY_CURRENT_UTC_OFFSET);
    }

    public String getIpAddress() {
        return getPropertyValueAsString(CONFIG_PROPERTY_IP_ADDRESS);
    }

    public String getMacAddress() {
        return getPropertyValueAsString(CONFIG_PROPERTY_MAC_ADDRESS);
    }

    public String getSHCType() {
        return getPropertyValueAsString(CONFIG_PROPERTY_SHC_TYPE);
    }

    public Boolean getBackendConnectionMonitored() {
        return getPropertyValueAsBoolean(CONFIG_PROPERTY_BACKEND_CONNECTION_MONITORED);
    }

    public Boolean getRFCommFailureNotification() {
        return getPropertyValueAsBoolean(CONFIG_PROPERTY_RFCOM_FAILURE_NOTIFICATION);
    }

    public String getPostCode() {
        return getPropertyValueAsString(CONFIG_PROPERTY_POSTCODE);
    }

    public String getCity() {
        return getPropertyValueAsString(CONFIG_PROPERTY_CITY);
    }

    public String getStreet() {
        return getPropertyValueAsString(CONFIG_PROPERTY_STREET);
    }

    public String getHouseNumber() {
        return getPropertyValueAsString(CONFIG_PROPERTY_HOUSENUMBER);
    }

    public String getCountry() {
        return getPropertyValueAsString(CONFIG_PROPERTY_COUNTRY);
    }

    public String getHouseHoldType() {
        return getPropertyValueAsString(CONFIG_PROPERTY_HOUSEHOLD_TYPE);
    }

    public Integer getNumberOfPersons() {
        return getPropertyValueAsInteger(CONFIG_PROPERTY_NUMBER_OF_PERSONS);
    }

    public Integer getNumberOfFloors() {
        return getPropertyValueAsInteger(CONFIG_PROPERTY_NUMBER_OF_FLOORS);
    }

    public Integer getLivingArea() {
        return getPropertyValueAsInteger(CONFIG_PROPERTY_LIVINGAREA);
    }

    public DateTime getRegistrationTime() {
        return Util.convertZuluTimeStringToDate(getPropertyValueAsString(CONFIG_PROPERTY_REGISTRATION_TIME));
    }

    public String getRegistrationTimeFormattedString() {
        return Util.convertZuluTimeStringToDate(getPropertyValueAsString(CONFIG_PROPERTY_REGISTRATION_TIME))
                .toString(Constants.FORMAT_DATETIME);
    }

    public String getDisplayCurrentTemperature() {
        return getPropertyValueAsString(CONFIG_PROPERTY_DISPLAY_CURRENT_TEMPERATURE);
    }

    public String getUnderLyingDeviceIds() {
        return getPropertyValueAsString(CONFIG_PROPERTY_UNDERLYING_DEVICE_IDS);
    }
}
