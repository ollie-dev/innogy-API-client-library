package in.ollie.innogysmarthome.entity;

import com.google.api.client.util.Key;

public class Property {

    @Key("name")
    private String name;

    @Key("value")
    private Object value;

    @Key("lastchanged")
    private String lastchanged;

    public Property() {

    }

    /**
     * Constructs a new {@link Property} with the given name and value.
     *
     * @param name
     * @param value
     */
    public Property(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the value
     */
    public Object getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(Object value) {
        this.value = value;
    }

    /**
     * @return the lastchanged
     */
    public String getLastchanged() {
        return lastchanged;
    }

    /**
     * @param lastchanged the lastchanged to set
     */
    public void setLastchanged(String lastchanged) {
        this.lastchanged = lastchanged;
    }
}
