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
    public final static String STATE_NAME_DIMMER_ACTUATOR = "DimLevel";
    public final static String STATE_NAME_ROLLERSHUTTER_ACTUATOR = "ShutterLevel";

    // ENERGY CONSUMPTION SENSOR
    public final static String STATE_NAME_ENERGY_CONSUMPTION_SENSOR_ENERGY_CONSUMPTION_MONTH_KWH = "EnergyConsumptionMonthKWh";
    public final static String STATE_NAME_ENERGY_CONSUMPTION_SENSOR_ABSOLUTE_ENERGY_CONSUMPTION = "AbsoluteEnergyConsumption";
    public final static String STATE_NAME_ENERGY_CONSUMPTION_SENSOR_ENERGY_CONSUMPTION_MONTH_EURO = "EnergyConsumptionMonthEuro";
    public final static String STATE_NAME_ENERGY_CONSUMPTION_SENSOR_ENERGY_CONSUMPTION_DAY_EURO = "EnergyConsumptionDayEuro";
    public final static String STATE_NAME_ENERGY_CONSUMPTION_SENSOR_ENERGY_CONSUMPTION_DAY_KWH = "EnergyConsumptionDayKWh";
    // POWER CONSUMPTION SENSOR
    public final static String STATE_NAME_POWER_CONSUMPTION_SENSOR_POWER_CONSUMPTION_WATT = "PowerConsumptionWatt";
    // GENERATION METER ENERGY SENSOR
    public final static String STATE_NAME_GENERATION_METER_ENERGY_SENSOR_ENERGY_PER_MONTH_IN_KWH = "EnergyPerMonthInKWh";
    public final static String STATE_NAME_GENERATION_METER_ENERGY_SENSOR_TOTAL_ENERGY = "TotalEnergy";
    public final static String STATE_NAME_GENERATION_METER_ENERGY_SENSOR_ENERGY_PER_MONTH_IN_EURO = "EnergyPerMonthInEuro";
    public final static String STATE_NAME_GENERATION_METER_ENERGY_SENSOR_ENERGY_PER_DAY_IN_EURO = "EnergyPerDayInEuro";
    public final static String STATE_NAME_GENERATION_METER_ENERGY_SENSOR_ENERGY_PER_DAY_IN_KWH = "EnergyPerDayInKWh";
    // GENERATION METER POWER CONSUMPTION SENSOR
    public final static String STATE_NAME_GENERATION_METER_POWER_CONSUMPTION_SENSOR_POWER_IN_WATT = "PowerInWatt";
    // TWO WAY METER ENERGY CONSUMPTION SENSOR
    public final static String STATE_NAME_TWO_WAY_METER_ENERGY_CONSUMPTION_SENSOR_ENERGY_PER_MONTH_IN_KWH = "EnergyPerMonthInKWh";
    public final static String STATE_NAME_TWO_WAY_METER_ENERGY_CONSUMPTION_SENSOR_TOTAL_ENERGY = "TotalEnergy";
    public final static String STATE_NAME_TWO_WAY_METER_ENERGY_CONSUMPTION_SENSOR_ENERGY_PER_MONTH_IN_EURO = "EnergyPerMonthInEuro";
    public final static String STATE_NAME_TWO_WAY_METER_ENERGY_CONSUMPTION_SENSOR_ENERGY_PER_DAY_IN_EURO = "EnergyPerDayInEuro";
    public final static String STATE_NAME_TWO_WAY_METER_ENERGY_CONSUMPTION_SENSOR_ENERGY_PER_DAY_IN_KWH = "EnergyPerDayInKWh";
    // TWO WAY METER ENERGY FEED SENSOR
    public final static String STATE_NAME_TWO_WAY_METER_ENERGY_FEED_SENSOR_ENERGY_PER_MONTH_IN_KWH = "EnergyPerMonthInKWh";
    public final static String STATE_NAME_TWO_WAY_METER_ENERGY_FEED_SENSOR_TOTAL_ENERGY = "TotalEnergy";
    public final static String STATE_NAME_TWO_WAY_METER_ENERGY_FEED_SENSOR_ENERGY_PER_MONTH_IN_EURO = "EnergyPerMonthInEuro";
    public final static String STATE_NAME_TWO_WAY_METER_ENERGY_FEED_SENSOR_ENERGY_PER_DAY_IN_EURO = "EnergyPerDayInEuro";
    public final static String STATE_NAME_TWO_WAY_METER_ENERGY_FEED_SENSOR_ENERGY_PER_DAY_IN_KWH = "EnergyPerDayInKWh";
    // TWO WAY METER POWER CONSUMPTION SENSOR
    public final static String STATE_NAME_TWO_WAY_METER_POWER_CONSUMPTION_SENSOR_POWER_IN_WATT = "PowerInWatt";

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

    public Double getDimmerActuatorState() {
        return getPropertyValueAsDouble(STATE_NAME_DIMMER_ACTUATOR);
    }

    public void setDimmerActuatorState(double DimLevel) {
        setPropertyValueAsDouble(STATE_NAME_DIMMER_ACTUATOR, DimLevel);
    }

    public Double getRollerShutterActuatorState() {
        return getPropertyValueAsDouble(STATE_NAME_ROLLERSHUTTER_ACTUATOR);
    }

    public void setRollerShutterActuatorState(double rollerShutterLevel) {
        setPropertyValueAsDouble(STATE_NAME_ROLLERSHUTTER_ACTUATOR, rollerShutterLevel);
    }

    // ENERGY CONSUMPTION SENSOR
    public Double getEnergyConsumptionSensorEnergyConsumptionMonthKWhState() {
        return getPropertyValueAsDouble(STATE_NAME_ENERGY_CONSUMPTION_SENSOR_ENERGY_CONSUMPTION_MONTH_KWH);
    }

    public void setEnergyConsumptionSensorEnergyConsumptionMonthKWhState(double state) {
        setPropertyValueAsDouble(STATE_NAME_ENERGY_CONSUMPTION_SENSOR_ENERGY_CONSUMPTION_MONTH_KWH, state);
    }

    public Double getEnergyConsumptionSensorAbsoluteEnergyConsumptionState() {
        return getPropertyValueAsDouble(STATE_NAME_ENERGY_CONSUMPTION_SENSOR_ABSOLUTE_ENERGY_CONSUMPTION);
    }

    public void setEnergyConsumptionSensorAbsoluteEnergyConsumptionState(double state) {
        setPropertyValueAsDouble(STATE_NAME_ENERGY_CONSUMPTION_SENSOR_ABSOLUTE_ENERGY_CONSUMPTION, state);
    }

    public Double getEnergyConsumptionSensorEnergyConsumptionMonthEuroState() {
        return getPropertyValueAsDouble(STATE_NAME_ENERGY_CONSUMPTION_SENSOR_ENERGY_CONSUMPTION_MONTH_EURO);
    }

    public void setEnergyConsumptionSensorEnergyConsumptionMonthEuroState(double state) {
        setPropertyValueAsDouble(STATE_NAME_ENERGY_CONSUMPTION_SENSOR_ENERGY_CONSUMPTION_MONTH_EURO, state);
    }

    public Double getEnergyConsumptionSensorEnergyConsumptionDayEuroState() {
        return getPropertyValueAsDouble(STATE_NAME_ENERGY_CONSUMPTION_SENSOR_ENERGY_CONSUMPTION_DAY_EURO);
    }

    public void setEnergyConsumptionSensorEnergyConsumptionDayEuroState(double state) {
        setPropertyValueAsDouble(STATE_NAME_ENERGY_CONSUMPTION_SENSOR_ENERGY_CONSUMPTION_DAY_EURO, state);
    }

    public Double getEnergyConsumptionSensorEnergyConsumptionDayKWhState() {
        return getPropertyValueAsDouble(STATE_NAME_ENERGY_CONSUMPTION_SENSOR_ENERGY_CONSUMPTION_DAY_KWH);
    }

    public void setEnergyConsumptionSensorEnergyConsumptionDayKWhState(double state) {
        setPropertyValueAsDouble(STATE_NAME_ENERGY_CONSUMPTION_SENSOR_ENERGY_CONSUMPTION_DAY_KWH, state);
    }

    // POWER CONSUMPTION SENSOR
    public Double getPowerConsumptionSensorPowerConsumptionWattState() {
        return getPropertyValueAsDouble(STATE_NAME_POWER_CONSUMPTION_SENSOR_POWER_CONSUMPTION_WATT);
    }

    public void setPowerConsumptionSensorPowerConsumptionWattState(double state) {
        setPropertyValueAsDouble(STATE_NAME_POWER_CONSUMPTION_SENSOR_POWER_CONSUMPTION_WATT, state);
    }

    // GENERATION METER ENGERY SENSOR
    public Double getGenerationMeterEnergySensorEnergyPerMonthInKWhState() {
        return getPropertyValueAsDouble(STATE_NAME_GENERATION_METER_ENERGY_SENSOR_ENERGY_PER_MONTH_IN_KWH);
    }

    public void setGenerationMeterEnergySensorEnergyPerMonthInKWhState(double state) {
        setPropertyValueAsDouble(STATE_NAME_GENERATION_METER_ENERGY_SENSOR_ENERGY_PER_MONTH_IN_KWH, state);
    }

    public Double getGenerationMeterEnergySensorTotalEnergyState() {
        return getPropertyValueAsDouble(STATE_NAME_GENERATION_METER_ENERGY_SENSOR_TOTAL_ENERGY);
    }

    public void setGenerationMeterEnergySensorTotalEnergyState(double state) {
        setPropertyValueAsDouble(STATE_NAME_GENERATION_METER_ENERGY_SENSOR_TOTAL_ENERGY, state);
    }

    public Double getGenerationMeterEnergySensorEnergyPerMonthInEuroState() {
        return getPropertyValueAsDouble(STATE_NAME_GENERATION_METER_ENERGY_SENSOR_ENERGY_PER_MONTH_IN_EURO);
    }

    public void setGenerationMeterEnergySensorEnergyPerMonthInEuroState(double state) {
        setPropertyValueAsDouble(STATE_NAME_GENERATION_METER_ENERGY_SENSOR_ENERGY_PER_MONTH_IN_EURO, state);
    }

    public Double getGenerationMeterEnergySensorEnergyPerDayInEuroState() {
        return getPropertyValueAsDouble(STATE_NAME_GENERATION_METER_ENERGY_SENSOR_ENERGY_PER_DAY_IN_EURO);
    }

    public void setGenerationMeterEnergySensorEnergyPerDayInEuroState(double state) {
        setPropertyValueAsDouble(STATE_NAME_GENERATION_METER_ENERGY_SENSOR_ENERGY_PER_DAY_IN_EURO, state);
    }

    public Double getGenerationMeterEnergySensorEnergyPerDayInKWhState() {
        return getPropertyValueAsDouble(STATE_NAME_GENERATION_METER_ENERGY_SENSOR_ENERGY_PER_DAY_IN_KWH);
    }

    public void setGenerationMeterEnergySensorEnergyPerDayInKWhState(double state) {
        setPropertyValueAsDouble(STATE_NAME_GENERATION_METER_ENERGY_SENSOR_ENERGY_PER_DAY_IN_KWH, state);
    }

    // GENERATION METER POWER CONSUMPTION SENSOR
    public Double getGenerationMeterPowerConsumptionSensorPowerInWattState() {
        return getPropertyValueAsDouble(STATE_NAME_GENERATION_METER_POWER_CONSUMPTION_SENSOR_POWER_IN_WATT);
    }

    public void setGenerationMeterPowerConsumptionSensorPowerInWattState(double state) {
        setPropertyValueAsDouble(STATE_NAME_GENERATION_METER_POWER_CONSUMPTION_SENSOR_POWER_IN_WATT, state);
    }

    // TWO WAY METER ENERGY CONSUMPTION SENSOR
    public Double getTwoWayMeterEnergyConsumptionSensorEnergyPerMonthInKWhState() {
        return getPropertyValueAsDouble(STATE_NAME_TWO_WAY_METER_ENERGY_CONSUMPTION_SENSOR_ENERGY_PER_MONTH_IN_KWH);
    }

    public void setTwoWayMeterEnergyConsumptionSensorEnergyPerMonthInKWhState(double state) {
        setPropertyValueAsDouble(STATE_NAME_TWO_WAY_METER_ENERGY_CONSUMPTION_SENSOR_ENERGY_PER_MONTH_IN_KWH, state);
    }

    public Double getTwoWayMeterEnergyConsumptionSensorTotalEnergyState() {
        return getPropertyValueAsDouble(STATE_NAME_TWO_WAY_METER_ENERGY_CONSUMPTION_SENSOR_TOTAL_ENERGY);
    }

    public void setTwoWayMeterEnergyConsumptionSensorTotalEnergyState(double state) {
        setPropertyValueAsDouble(STATE_NAME_TWO_WAY_METER_ENERGY_CONSUMPTION_SENSOR_TOTAL_ENERGY, state);
    }

    public Double getTwoWayMeterEnergyConsumptionSensorEnergyPerMonthInEuroState() {
        return getPropertyValueAsDouble(STATE_NAME_TWO_WAY_METER_ENERGY_CONSUMPTION_SENSOR_ENERGY_PER_MONTH_IN_EURO);
    }

    public void setTwoWayMeterEnergyConsumptionSensorEnergyPerMonthInEuroState(double state) {
        setPropertyValueAsDouble(STATE_NAME_TWO_WAY_METER_ENERGY_CONSUMPTION_SENSOR_ENERGY_PER_MONTH_IN_EURO, state);
    }

    public Double getTwoWayMeterEnergyConsumptionSensorEnergyPerDayInEuroState() {
        return getPropertyValueAsDouble(STATE_NAME_TWO_WAY_METER_ENERGY_CONSUMPTION_SENSOR_ENERGY_PER_DAY_IN_EURO);
    }

    public void setTwoWayMeterEnergyConsumptionSensorEnergyPerDayInEuroState(double state) {
        setPropertyValueAsDouble(STATE_NAME_TWO_WAY_METER_ENERGY_CONSUMPTION_SENSOR_ENERGY_PER_DAY_IN_EURO, state);
    }

    public Double getTwoWayMeterEnergyConsumptionSensorEnergyPerDayInKWhState() {
        return getPropertyValueAsDouble(STATE_NAME_TWO_WAY_METER_ENERGY_CONSUMPTION_SENSOR_ENERGY_PER_DAY_IN_KWH);
    }

    public void setTwoWayMeterEnergyConsumptionSensorEnergyPerDayInKWhState(double state) {
        setPropertyValueAsDouble(STATE_NAME_TWO_WAY_METER_ENERGY_CONSUMPTION_SENSOR_ENERGY_PER_DAY_IN_KWH, state);
    }

    // TWO WAY METER ENERGY FEED SENSOR
    public Double getTwoWayMeterEnergyFeedSensorEnergyPerMonthInKWhState() {
        return getPropertyValueAsDouble(STATE_NAME_TWO_WAY_METER_ENERGY_FEED_SENSOR_ENERGY_PER_MONTH_IN_KWH);
    }

    public void setTwoWayMeterEnergyFeedSensorEnergyPerMonthInKWhState(double state) {
        setPropertyValueAsDouble(STATE_NAME_TWO_WAY_METER_ENERGY_FEED_SENSOR_ENERGY_PER_MONTH_IN_KWH, state);
    }

    public Double getTwoWayMeterEnergyFeedSensorTotalEnergyState() {
        return getPropertyValueAsDouble(STATE_NAME_TWO_WAY_METER_ENERGY_FEED_SENSOR_TOTAL_ENERGY);
    }

    public void setTwoWayMeterEnergyFeedSensorTotalEnergyState(double state) {
        setPropertyValueAsDouble(STATE_NAME_TWO_WAY_METER_ENERGY_FEED_SENSOR_TOTAL_ENERGY, state);
    }

    public Double getTwoWayMeterEnergyFeedSensorEnergyPerMonthInEuroState() {
        return getPropertyValueAsDouble(STATE_NAME_TWO_WAY_METER_ENERGY_FEED_SENSOR_ENERGY_PER_MONTH_IN_EURO);
    }

    public void setTwoWayMeterEnergyFeedSensorEnergyPerMonthInEuroState(double state) {
        setPropertyValueAsDouble(STATE_NAME_TWO_WAY_METER_ENERGY_FEED_SENSOR_ENERGY_PER_MONTH_IN_EURO, state);
    }

    public Double getTwoWayMeterEnergyFeedSensorEnergyPerDayInEuroState() {
        return getPropertyValueAsDouble(STATE_NAME_TWO_WAY_METER_ENERGY_FEED_SENSOR_ENERGY_PER_DAY_IN_EURO);
    }

    public void setTwoWayMeterEnergyFeedSensorEnergyPerDayInEuroState(double state) {
        setPropertyValueAsDouble(STATE_NAME_TWO_WAY_METER_ENERGY_FEED_SENSOR_ENERGY_PER_DAY_IN_EURO, state);
    }

    public Double getTwoWayMeterEnergyFeedSensorEnergyPerDayInKWhState() {
        return getPropertyValueAsDouble(STATE_NAME_TWO_WAY_METER_ENERGY_FEED_SENSOR_ENERGY_PER_DAY_IN_KWH);
    }

    public void setTwoWayMeterEnergyFeedSensorEnergyPerDayInKWhState(double state) {
        setPropertyValueAsDouble(STATE_NAME_TWO_WAY_METER_ENERGY_FEED_SENSOR_ENERGY_PER_DAY_IN_KWH, state);
    }

    // TWO WAY METER POWER CONSUMPTION SENSOR
    public Double getTwoWayMeterPowerConsumptionSensorPowerInWattState() {
        return getPropertyValueAsDouble(STATE_NAME_TWO_WAY_METER_POWER_CONSUMPTION_SENSOR_POWER_IN_WATT);
    }

    public void setTwoWayMeterPowerConsumptionSensorPowerInWattState(double state) {
        setPropertyValueAsDouble(STATE_NAME_TWO_WAY_METER_POWER_CONSUMPTION_SENSOR_POWER_IN_WATT, state);
    }

}
