package in.ollie.innogysmarthome.entity;

import com.google.api.client.util.Key;

public class Constant {

    @Key("value")
    public Object value;

    public Constant() {
        super();
    }

    public Constant(Object value) {
        super();
        this.value = value;
    }
}
