package in.ollie.innogysmarthome.entity.link;

import com.google.api.client.util.Key;

public class Link {

    @Key("value")
    private String value;

    public Link(String value) {
        this.value = value;
    }

    public Link() {
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }
}
