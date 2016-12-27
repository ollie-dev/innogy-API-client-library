package in.ollie.innogysmarthome.entity.action;

import java.util.ArrayList;
import java.util.List;

import in.ollie.innogysmarthome.entity.Constant;
import in.ollie.innogysmarthome.entity.capability.Capability;

public class SetStateAction extends Action {

    public final static String ACTION_PARAMETER_SWITCHACTUATOR_ONSTATE = "OnState";
    public final static String ACTION_PARAMETER_VARIABLEACTUATOR_VALUE = "Value";
    public final static String ACTION_PARAMETER_THERMOSTATACTUATOR_POINTTEMPERATURE = "PointTemperature";
    public final static String ACTION_PARAMETER_THERMOSTATACTUATOR_OPERATIONMODE = "OperationMode";
    public final static String ACTION_PARAMETER_ALARMACTUATOR_ONSTATE = "OnState";

    /**
     * Constructs a new {@link SetStateAction}.
     *
     * @param capabilityId String of the 32 character capability id
     * @param capabilityType the type of the {@link Capability}, {@link Capability#TYPE_SWITCHACTUATOR} or
     *            {@link Capability#TYPE_VARIABLEACTUATOR}
     * @param state the new state as boolean (true=on, false=off)
     */
    public SetStateAction(String capabilityId, String capabilityType, boolean state) {
        super(ACTION_TYPE_SETSTATE);
        setCapabilityLink(capabilityId);

        List<ActionParameter> parameterList = new ArrayList<ActionParameter>();

        if (capabilityType.equals(Capability.TYPE_SWITCHACTUATOR)) {
            parameterList.add(new ActionParameter(ACTION_PARAMETER_SWITCHACTUATOR_ONSTATE, "/entity/Constant",
                    new Constant(state)));
        } else if (capabilityType.equals(Capability.TYPE_VARIABLEACTUATOR)) {
            parameterList.add(new ActionParameter(ACTION_PARAMETER_VARIABLEACTUATOR_VALUE, "/entity/Constant",
                    new Constant(state)));
        } else if (capabilityType.equals(Capability.TYPE_ALARMACTUATOR)) {
            parameterList.add(new ActionParameter(ACTION_PARAMETER_ALARMACTUATOR_ONSTATE, "/entity/Constant",
                    new Constant(state)));
        }
        setParameterList(parameterList);
    }

    /**
     * Constructs a new {@link SetStateAction}.
     *
     * @param capabilityId String of the 32 character capability id
     * @param capabilityType the type of the {@link Capability}, {@link Capability#TYPE_THERMOSTATACTUATOR}
     * @param newValue the new double value
     */
    public SetStateAction(String capabilityId, String capabilityType, double newValue) {
        super(ACTION_TYPE_SETSTATE);
        setCapabilityLink(capabilityId);

        List<ActionParameter> parameterList = new ArrayList<ActionParameter>();

        if (capabilityType.equals(Capability.TYPE_THERMOSTATACTUATOR)) {
            parameterList.add(new ActionParameter(ACTION_PARAMETER_THERMOSTATACTUATOR_POINTTEMPERATURE,
                    "/entity/Constant", new Constant(newValue)));
        }
        setParameterList(parameterList);
    }

    /**
     * Constructs a new {@link SetStateAction}.
     *
     * @param capabilityId String of the 32 character capability id
     * @param capabilityType the type of the {@link Capability}, {@link Capability#TYPE_THERMOSTATACTUATOR}
     * @param newValue the new string value
     */
    public SetStateAction(String capabilityId, String capabilityType, String newValue) {
        super(ACTION_TYPE_SETSTATE);
        setCapabilityLink(capabilityId);

        List<ActionParameter> parameterList = new ArrayList<ActionParameter>();

        if (capabilityType.equals(Capability.TYPE_THERMOSTATACTUATOR)) {
            parameterList.add(new ActionParameter(ACTION_PARAMETER_THERMOSTATACTUATOR_OPERATIONMODE, "/entity/Constant",
                    new Constant(newValue)));
        }
        setParameterList(parameterList);
    }

}
