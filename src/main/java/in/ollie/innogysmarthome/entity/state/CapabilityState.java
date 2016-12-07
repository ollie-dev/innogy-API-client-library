package in.ollie.innogysmarthome.entity.state;

public class CapabilityState extends EntityState {
    public final static String STATE_NAME_VARIABLE_ACTUATOR = "Value";
    public final static String STATE_NAME_SWITCH_ACTUATOR = "OnState";
    public final static String STATE_NAME_TEMPERATURE_SENSOR = "Temperature";
    public final static String STATE_NAME_THERMOSTAT_ACTUATOR = "PointTemperature";
    public final static String STATE_NAME_HUMIDITY_SENSOR = "Humidity";
    public final static String STATE_NAME_WINDOW_REDUCTION_ACTIVE = "WindowReductionActive";
    public final static String STATE_NAME_OPERATION_MODE = "OperationMode";
    public final static String STATE_NAME_WINDOW_DOOR_SENSOR = "IsOpen";
    public final static String STATE_NAME_SMOKE_DETECTOR_SENSOR = "IsSmokeAlarm";
    public final static String STATE_NAME_ALARM_ACTUATOR = "OnState";
    public final static String STATE_NAME_MOTION_DETECTION_SENSOR = "MotionDetectedCount";
    public final static String STATE_NAME_LUMINANCE_SENSOR = "Luminance";

    public Boolean getVariableActuatorState() {
        return getPropertyValueAsBoolean(STATE_NAME_VARIABLE_ACTUATOR);
    }

    public void setVariableActuatorState(boolean on) {
        setPropertyValueAsBoolean(STATE_NAME_VARIABLE_ACTUATOR, on);
    }

    public Boolean getSwitchActuatorState() {
        return getPropertyValueAsBoolean(STATE_NAME_SWITCH_ACTUATOR);
    }

    public void setSwitchActuatorState(boolean on) {
        setPropertyValueAsBoolean(STATE_NAME_SWITCH_ACTUATOR, on);
    }

    public Double getTemperatureSensorState() {
        return getPropertyValueAsDouble(STATE_NAME_TEMPERATURE_SENSOR);
    }

    public void setTemperatureSensorState(double temperature) {
        setPropertyValueAsDouble(STATE_NAME_TEMPERATURE_SENSOR, temperature);
    }

    public Double getThermostatActuatorState() {
        return getPropertyValueAsDouble(STATE_NAME_THERMOSTAT_ACTUATOR);
    }

    public void setThermostatActuatorState(double pointTemperature) {
        setPropertyValueAsDouble(STATE_NAME_THERMOSTAT_ACTUATOR, pointTemperature);
    }

    public Double getHumiditySensorState() {
        return getPropertyValueAsDouble(STATE_NAME_HUMIDITY_SENSOR);
    }

    public void setHumiditySensorState(double humidity) {
        setPropertyValueAsDouble(STATE_NAME_HUMIDITY_SENSOR, humidity);
    }

    public Boolean getWindowDoorSensorState() {
        return getPropertyValueAsBoolean(STATE_NAME_WINDOW_DOOR_SENSOR);
    }

    public void setWindowDoorSensorState(boolean open) {
        setPropertyValueAsBoolean(STATE_NAME_WINDOW_DOOR_SENSOR, open);
    }

    public Boolean getSmokeDetectorSensorState() {
        return getPropertyValueAsBoolean(STATE_NAME_SMOKE_DETECTOR_SENSOR);
    }

    public void setSmokeDetectorSensorState(boolean on) {
        setPropertyValueAsBoolean(STATE_NAME_SMOKE_DETECTOR_SENSOR, on);
    }

    public Boolean getAlarmActuatorState() {
        return getPropertyValueAsBoolean(STATE_NAME_ALARM_ACTUATOR);
    }

    public void setAlarmActuatorState(boolean on) {
        setPropertyValueAsBoolean(STATE_NAME_ALARM_ACTUATOR, on);
    }

    public Double getMotionDetectionSensorState() {
        return getPropertyValueAsDouble(STATE_NAME_MOTION_DETECTION_SENSOR);
    }

    public void setMotionDetectionSensorState(double numberOfMotions) {
        setPropertyValueAsDouble(STATE_NAME_MOTION_DETECTION_SENSOR, numberOfMotions);
    }

    public Double getLuminanceSensorState() {
        return getPropertyValueAsDouble(STATE_NAME_LUMINANCE_SENSOR);
    }

    public void setLuminanceSensorState(double luminance) {
        setPropertyValueAsDouble(STATE_NAME_LUMINANCE_SENSOR, luminance);
    }

}
