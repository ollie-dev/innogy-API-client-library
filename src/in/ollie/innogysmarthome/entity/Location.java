package in.ollie.innogysmarthome.entity;

import java.util.List;

import com.google.api.client.util.Key;

public class Location extends ConfigPropertyList {
    private final static String CONFIG_PROPERTY_TYPE = "Type";

    /**
     * Identifier of the location – must be unique.
     */
    @Key("id")
    private String id;

    /**
     * Reference to the description of the message.
     * Optional.
     */
    @Key("desc")
    private String desc;

    /**
     * Container for tagging the location, e.g. if the location is on a certain floor in the house.
     * Optional.
     */
    @Key("Tags")
    private List<Property> tagsList;

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

    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return the tagsList
     */
    public List<Property> getTagsList() {
        return tagsList;
    }

    /**
     * @param tagsList the tagsList to set
     */
    public void setTagsList(List<Property> tagsList) {
        this.tagsList = tagsList;
    }

    public String getName() {
        return getPropertyValueAsString(CONFIG_PROPERTY_NAME);
    }

    public String getType() {
        return getPropertyValueAsString(CONFIG_PROPERTY_TYPE);
    }
}
