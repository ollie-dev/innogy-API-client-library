package in.ollie.innogysmarthome.entity;

import java.util.HashMap;
import java.util.List;

import com.google.api.client.util.Key;

public class Property {

    @Key("name")
    private String name;

    @Key("value")
    private Object value;

    @Key("lastchanged")
    private String lastchanged;

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

    /**
     * Returns a {@link HashMap} with the name as key and {@link Property} as value.
     *
     * @param propertyList
     * @return
     */
    public static HashMap<String, Property> getHashMap(List<Property> propertyList) {
        HashMap<String, Property> map = new HashMap<String, Property>();
        for (Property p : propertyList) {
            map.put(p.getName(), p);
        }
        return map;
    }
}
