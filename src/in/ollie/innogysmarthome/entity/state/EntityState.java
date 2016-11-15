package in.ollie.innogysmarthome.entity.state;

import java.util.Map;

import com.google.api.client.util.Key;

import in.ollie.innogysmarthome.entity.Property;

public class EntityState extends StateList {

    @Key("Id")
    private String id;

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

    @Override
    public Map<String, Property> getPropertyMap() {
        return super.getPropertyMap();
    }

}
