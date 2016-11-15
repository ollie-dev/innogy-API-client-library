package in.ollie.innogysmarthome.entity;

import java.util.Map;

public abstract class PropertyList {

    /**
     * Returns a {@link Map} of the {@link Property}s. Must be overwritten!
     *
     * @return the configMap
     */
    protected abstract Map<String, Property> getPropertyMap();

    /**
     * Returns the value of the {@link Property} with the given name.
     *
     * @param propertyName
     * @return
     */
    protected Object getPropertyValue(String propertyName) {
        return getPropertyMap().get(propertyName);
    }

    /**
     * Returns the value of the {@link Property} with the given name as {@link String}.
     *
     * @param propertyName
     * @return
     */
    protected String getPropertyValueAsString(String propertyName) {
        Property p = getPropertyMap().get(propertyName);
        if (p != null) {
            Object value = p.getValue();
            if (value instanceof String) {
                return (String) value;
            }
        }
        return null;
    }

    /**
     * Returns the value of the {@link Property} with the given name as {@link Boolean}.
     *
     * @param propertyName
     * @return
     */
    protected Boolean getPropertyValueAsBoolean(String propertyName) {
        Property p = getPropertyMap().get(propertyName);
        if (p != null) {
            Object value = p.getValue();
            if (value instanceof Boolean) {
                return (Boolean) value;
            }
        }
        return null;
    }

    /**
     * Sets the value of the {@link Property} with the given name to the booleanState.
     *
     * @param propertyName String the name of the {@link Property}
     * @param booleanState boolean the new state to set
     */
    protected void setPropertyValueAsBoolean(String propertyName, boolean booleanState) {
        Property p = getPropertyMap().get(propertyName);
        if (p != null) {
            p.setValue(booleanState);
        }
    }

    /**
     * Returns the value of the {@link Property} with the given name as {@link Double}.
     *
     * @param propertyName
     * @return
     */
    protected Double getPropertyValueAsDouble(String propertyName) {
        Property p = getPropertyMap().get(propertyName);
        if (p != null) {
            Object value = p.getValue();
            // return (Double) value;
            return Double.parseDouble(value.toString());
        }
        return null;
    }

    /**
     * Sets the value of the {@link Property} with the given name to the doubleState.
     *
     * @param propertyName String the name of the {@link Property}
     * @param doubleState double the new state to set
     */
    protected void setPropertyValueAsDouble(String propertyName, double doubleState) {
        Property p = getPropertyMap().get(propertyName);
        if (p != null) {
            p.setValue(doubleState);
        }
    }

    /**
     * Returns the value of the {@link Property} with the given name as {@link Integer}.
     *
     * @param propertyName
     * @return
     */
    protected Integer getPropertyValueAsInteger(String propertyName) {
        Property p = getPropertyMap().get(propertyName);
        if (p != null) {
            Object value = p.getValue();
            return Integer.parseInt(value.toString());
        }
        return null;
    }

    /**
     * Sets the value of the {@link Property} with the given name to the intState.
     *
     * @param propertyName String the name of the {@link Property}
     * @param intState int the new state to set
     */
    protected void setPropertyValueAsInteger(String propertyName, int intState) {
        Property p = getPropertyMap().get(propertyName);
        if (p != null) {
            p.setValue(intState);
        }
    }

}
