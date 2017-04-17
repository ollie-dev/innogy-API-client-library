package in.ollie.innogysmarthome.entity.state;

import com.google.api.client.util.Key;

public class EntityState extends StatePropertyList {

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
}
