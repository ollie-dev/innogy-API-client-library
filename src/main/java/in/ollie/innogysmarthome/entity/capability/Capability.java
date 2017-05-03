package in.ollie.innogysmarthome.entity.capability;

import java.util.List;

import com.google.api.client.util.Key;

import in.ollie.innogysmarthome.entity.ConfigPropertyList;
import in.ollie.innogysmarthome.entity.link.Link;
import in.ollie.innogysmarthome.entity.state.CapabilityState;

public class Capability extends ConfigPropertyList {

    private final static String CONFIG_PROPERTY_ACTIVITY_LOG_ACTIVE = "ActivityLogActive";
    private final static String CONFIG_PROPERTY_PUSH_BUTTONS = "PushButtons";

    /** capability types */
    public final static String TYPE_SWITCHACTUATOR = "SwitchActuator";
    public final static String TYPE_VARIABLEACTUATOR = "BooleanStateActuator";
    public final static String TYPE_THERMOSTATACTUATOR = "ThermostatActuator";
    public final static String TYPE_TEMPERATURESENSOR = "TemperatureSensor";
    public final static String TYPE_HUMIDITYSENSOR = "HumiditySensor";
    public final static String TYPE_WINDOWDOORSENSOR = "WindowDoorSensor";
    public final static String TYPE_SMOKEDETECTORSENSOR = "SmokeDetectorSensor";
    public final static String TYPE_ALARMACTUATOR = "AlarmActuator";
    public final static String TYPE_MOTIONDETECTIONSENSOR = "MotionDetectionSensor";
    public final static String TYPE_LUMINANCESENSOR = "LuminanceSensor";
    public final static String TYPE_PUSHBUTTONSENSOR = "PushButtonSensor";
    public final static String TYPE_DIMMERACTUATOR = "DimmerActuator";
    public final static String TYPE_ROLLERSHUTTERACTUATOR = "RollerShutterActuator";

    /**
     * Unique id for the Capability.
     */
    @Key("id")
    private String id;

    /**
     * Type of the capability – must be unique per device, since the device links to the capability via the type.
     */
    @Key("type")
    private String type;

    /**
     * Link to the metadata of that specific capability. The link should be complete and can be followed without further
     * additions. In the instance of a capability, the Link will point to the actual instance of the underlying device.
     *
     * Optional.
     */
    @Key("desc")
    private String desc;

    /**
     * Contain the link to the parent device, which offers the capability.
     */
    @Key("Device")
    private List<Link> deviceLink;

    private CapabilityState capabilityState;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return
     */
    public List<Link> getDeviceLink() {
        return deviceLink;
    }

    /**
     * @param deviceLink
     */
    public void setDeviceLink(List<Link> deviceLink) {
        this.deviceLink = deviceLink;
    }

    /**
     * Returns the {@link CapabilityState}. Only available, if capability has a state. Better check with
     * {@link Capability#hasState()} first!
     *
     * @return the capabilityState or null
     */
    public CapabilityState getCapabilityState() {
        return capabilityState;
    }

    /**
     * @param capabilityState the capabilityState to set
     */
    public void setCapabilityState(CapabilityState capabilityState) {
        this.capabilityState = capabilityState;
    }

    /**
     * Returns, if the capability has a state. Not all capabilities have a state.
     *
     * @return
     */
    public boolean hasState() {
        return capabilityState != null;
    }

    /**
     * Returns the name of the {@link Capability}.
     *
     * @return
     */
    @Override
    public String getName() {
        return getPropertyValueAsString(CONFIG_PROPERTY_NAME);
    }

    /**
     * Returns, if the activity log is active for the {@link Capability}.
     *
     * @return boolean or null, if the {@link Capability} does not have this property.
     */
    public boolean getActivityLogActive() {
        return getPropertyValueAsBoolean(CONFIG_PROPERTY_ACTIVITY_LOG_ACTIVE);
    }

    /**
     * Returns the number of pushbuttons for the {@link Capability}.
     *
     * @return int or null, if the {@link Capability} does not have this property.
     */
    public int getPushButtons() {
        return getPropertyValueAsInteger(CONFIG_PROPERTY_PUSH_BUTTONS);
    }

    /**
     * Returns true, if the {@link Capability} is of type VariableActuator.
     *
     * @return
     */
    public boolean isTypeVariableActuator() {
        return getType().equals(TYPE_VARIABLEACTUATOR);
    }

    /**
     * Returns true, if the {@link Capability} is of type SwitchActuator.
     *
     * @return
     */
    public boolean isTypeSwitchActuator() {
        return getType().equals(TYPE_SWITCHACTUATOR);
    }

    /**
     * Returns true, if the {@link Capability} is of type ThermostatActuator.
     *
     * @return
     */
    public boolean isTypeThermostatActuator() {
        return getType().equals(TYPE_THERMOSTATACTUATOR);
    }

    /**
     * Returns true, if the {@link Capability} is of type TemperatureSensor.
     *
     * @return
     */
    public boolean isTypeTemperatureSensor() {
        return getType().equals(TYPE_TEMPERATURESENSOR);
    }

    /**
     * Returns true, if the {@link Capability} is of type HumiditySensor.
     *
     * @return
     */
    public boolean isTypeHumiditySensor() {
        return getType().equals(TYPE_HUMIDITYSENSOR);
    }

    /**
     * Returns true, if the {@link Capability} is of type WindowDoorSensor.
     *
     * @return
     */
    public boolean isTypeWindowDoorSensor() {
        return getType().equals(TYPE_WINDOWDOORSENSOR);
    }

    /**
     * Returns true, if the {@link Capability} is of type SmokeDetectorSensor.
     *
     * @return
     */
    public boolean isTypeSmokeDetectorSensor() {
        return getType().equals(TYPE_SMOKEDETECTORSENSOR);
    }

    /**
     * Returns true, if the {@link Capability} is of type AlarmActuator.
     *
     * @return
     */
    public boolean isTypeAlarmActuator() {
        return getType().equals(TYPE_ALARMACTUATOR);
    }

    /**
     * Returns true, if the {@link Capability} is of type MotionDetectionSensor.
     *
     * @return
     */
    public boolean isTypeMotionDetectionSensor() {
        return getType().equals(TYPE_MOTIONDETECTIONSENSOR);
    }

    /**
     * Returns true, if the {@link Capability} is of type LuminanceSensor.
     *
     * @return
     */
    public boolean isTypeLuminanceSensor() {
        return getType().equals(TYPE_LUMINANCESENSOR);
    }

    /**
     * Returns true, if the {@link Capability} is of type PushButtonSensor.
     *
     * @return
     */
    public boolean isTypePushButtonSensor() {
        return getType().equals(TYPE_PUSHBUTTONSENSOR);
    }

    /**
     * Returns true, if the {@link Capability} is of type DimmerActuator.
     *
     * @return
     */
    public boolean isTypeDimmerActuator() {
        return getType().equals(TYPE_DIMMERACTUATOR);
    }

    /**
     * Returns true, if the {@link Capability} is of type RollerShutterActuator.
     *
     * @return
     */
    public boolean isTypeRollerShutterActuator() {
        return getType().equals(TYPE_ROLLERSHUTTERACTUATOR);
    }
}
