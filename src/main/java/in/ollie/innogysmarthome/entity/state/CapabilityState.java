package in.ollie.innogysmarthome.entity.state;

public class CapabilityState extends EntityState {
    public final static String STATE_NAME_VARIABLE_ACTUATOR = "Value";
    public final static String STATE_NAME_SWITCH_ACTUATOR = "OnState";
    public final static String STATE_NAME_TEMPERATURE_SENSOR_TEMPERATURE = "Temperature";
    public final static String STATE_NAME_TEMPERATURE_SENSOR_FROST_WARNING = "FrostWarning";
    public final static String STATE_NAME_THERMOSTAT_ACTUATOR_POINT_TEMPERATURE = "PointTemperature";
    public final static String STATE_NAME_THERMOSTAT_ACTUATOR_OPERATION_MODE = "OperationMode";
    public final static String STATE_NAME_THERMOSTAT_ACTUATOR_WINDOW_REDUCTION_ACTIVE = "WindowReductionActive";
    public final static String STATE_NAME_HUMIDITY_SENSOR_HUMIDITY = "Humidity";
    public final static String STATE_NAME_HUMIDITY_SENSOR_MOLD_WARNING = "MoldWarning";
    public final static String STATE_NAME_WINDOW_DOOR_SENSOR = "IsOpen";
    public final static String STATE_NAME_SMOKE_DETECTOR_SENSOR = "IsSmokeAlarm";
    public final static String STATE_NAME_ALARM_ACTUATOR = "OnState";
    public final static String STATE_NAME_MOTION_DETECTION_SENSOR = "MotionDetectedCount";
    public final static String STATE_NAME_LUMINANCE_SENSOR = "Luminance";
    public final static String STATE_NAME_PUSH_BUTTON_SENSOR_COUNTER = "LastKeyPressCounter";
    public final static String STATE_NAME_PUSH_BUTTON_SENSOR_BUTTON_INDEX = "LastPressedButtonIndex";

    public final static String STATE_VALUE_OPERATION_MODE_AUTO = "Auto";
    public final static String STATE_VALUE_OPERATION_MODE_MANUAL = "Manu";

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

    public Double getTemperatureSensorTemperatureState() {
        return getPropertyValueAsDouble(STATE_NAME_TEMPERATURE_SENSOR_TEMPERATURE);
    }

    public void setTemperatureSensorTemperatureState(double temperature) {
        setPropertyValueAsDouble(STATE_NAME_TEMPERATURE_SENSOR_TEMPERATURE, temperature);
    }

    public Boolean getTemperatureSensorFrostWarningState() {
        return getPropertyValueAsBoolean(STATE_NAME_TEMPERATURE_SENSOR_FROST_WARNING);
    }

    public void setTemperatureSensorFrostWarningState(boolean frostWarning) {
        setPropertyValueAsBoolean(STATE_NAME_TEMPERATURE_SENSOR_FROST_WARNING, frostWarning);
    }

    public Double getThermostatActuatorPointTemperatureState() {
        return getPropertyValueAsDouble(STATE_NAME_THERMOSTAT_ACTUATOR_POINT_TEMPERATURE);
    }

    public void setThermostatActuatorPointTemperatureState(double pointTemperature) {
        setPropertyValueAsDouble(STATE_NAME_THERMOSTAT_ACTUATOR_POINT_TEMPERATURE, pointTemperature);
    }

    public String getThermostatActuatorOperationModeState() {
        return getPropertyValueAsString(STATE_NAME_THERMOSTAT_ACTUATOR_OPERATION_MODE);
    }

    public void setThermostatActuatorOperationModeState(String operationMode) {
        if (operationMode.equals(STATE_VALUE_OPERATION_MODE_MANUAL)) {
            setPropertyValueAsString(STATE_NAME_THERMOSTAT_ACTUATOR_OPERATION_MODE, STATE_VALUE_OPERATION_MODE_MANUAL);
        } else {
            setPropertyValueAsString(STATE_NAME_THERMOSTAT_ACTUATOR_OPERATION_MODE, STATE_VALUE_OPERATION_MODE_AUTO);
        }
    }

    public Boolean getThermostatActuatorWindowReductionActiveState() {
        return getPropertyValueAsBoolean(STATE_NAME_THERMOSTAT_ACTUATOR_WINDOW_REDUCTION_ACTIVE);
    }

    public void setThermostatActuatorWindowReductionActiveState(boolean windowReductionActive) {
        setPropertyValueAsBoolean(STATE_NAME_THERMOSTAT_ACTUATOR_WINDOW_REDUCTION_ACTIVE, windowReductionActive);
    }

    public Double getHumiditySensorHumidityState() {
        return getPropertyValueAsDouble(STATE_NAME_HUMIDITY_SENSOR_HUMIDITY);
    }

    public void setHumiditySensorHumidityState(double humidity) {
        setPropertyValueAsDouble(STATE_NAME_HUMIDITY_SENSOR_HUMIDITY, humidity);
    }

    public Boolean getHumiditySensorMoldWarningState() {
        return getPropertyValueAsBoolean(STATE_NAME_HUMIDITY_SENSOR_MOLD_WARNING);
    }

    public void setHumiditySensorMoldWarningState(boolean moldWarning) {
        setPropertyValueAsBoolean(STATE_NAME_HUMIDITY_SENSOR_MOLD_WARNING, moldWarning);
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

    public Double getPushButtonSensorCounterState() {
        return getPropertyValueAsDouble(STATE_NAME_PUSH_BUTTON_SENSOR_COUNTER);
    }

    public void setPushButtonSensorCounterState(double numberOfPresses) {
        setPropertyValueAsDouble(STATE_NAME_PUSH_BUTTON_SENSOR_COUNTER, numberOfPresses);
    }

    public Double getPushButtonSensorButtonIndexState() {
        return getPropertyValueAsDouble(STATE_NAME_PUSH_BUTTON_SENSOR_BUTTON_INDEX);
    }

    public void setPushButtonSensorButtonIndexState(double buttonIndex) {
        setPropertyValueAsDouble(STATE_NAME_PUSH_BUTTON_SENSOR_BUTTON_INDEX, buttonIndex);
    }

}
