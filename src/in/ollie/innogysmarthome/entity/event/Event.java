package in.ollie.innogysmarthome.entity.event;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.api.client.util.Key;
import com.google.gson.annotations.SerializedName;

import in.ollie.innogysmarthome.entity.Message;
import in.ollie.innogysmarthome.entity.Property;
import in.ollie.innogysmarthome.entity.PropertyList;
import in.ollie.innogysmarthome.entity.capability.Capability;
import in.ollie.innogysmarthome.entity.device.Device;
import in.ollie.innogysmarthome.entity.link.Link;

public class Event extends PropertyList {

    public final static String TYPE_STATE_CHANGED = "device/SHC.RWE/1.0/event/StateChanged";
    public final static String TYPE_NEW_MESSAGE_RECEIVED = "device/SHC.RWE/1.0/event/NewMessageReceived";
    public final static String TYPE_MESSAGE_DELETED = "device/SHC.RWE/1.0/event/MessageDeleted";
    public final static String TYPE_DISCONNECT = "/event/Disconnect";
    public final static String TYPE_CONFIG_CHANGED = "device/SHC.RWE/1.0/event/ConfigChanged";

    public final static String LINK_TYPE_CAPABILITY = "/capability/";
    public final static String LINK_TYPE_DEVICE = "/device/";
    public final static String LINK_TYPE_MESSAGE = "/message/";
    public final static String LINK_TYPE_SHC = "/desc/device/SHC.RWE/";
    public final static String LINK_TYPE_UNKNOWN = "unknown";

    public final static String EVENT_PROPERTY_CONFIGURATION_VERSION = "ConfigurationVersion";

    /**
     * Specifies the type of the event. The type must be the full path to uniquely reference the event definition.
     * Always available.
     */
    @Key("type")
    private String type;

    /**
     * Date and time when the event occurred in the system. Always available.
     */
    @Key("timestamp")
    private String timestamp;

    /**
     * Link to the metadata to the event definition.
     * Optional.
     */
    @Key("desc")
    private String desc;

    /**
     * Reference to the associated entity (instance or metadata) for the given event. Always available.
     */
    @Key("link")
    private Link link;

    /**
     * This container includes only properties, e.g. for the changed state properties. If there is other data than
     * properties to be transported, the data container will be used.
     * Optional.
     */
    @Key("Properties")
    @SerializedName("Properties")
    private List<Property> propertyList;

    protected HashMap<String, Property> propertyMap;

    /**
     * Data for the event, The data container can contain any type of entity dependent on the event type. For example,
     * the DeviceFound events contains the entire Device entity rather than selected properties.
     * Optional.
     */
    @Key("Data")
    private List<Object> dataList;

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the timestamp
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * @param timestamp the timestamp to set
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * @return the desc
     */
    protected String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return the link
     */
    public Link getLink() {
        return link;
    }

    /**
     * @param link the link to set
     */
    public void setLink(Link link) {
        this.link = link;
    }

    /**
     * @return the propertyList
     */
    public List<Property> getPropertyList() {
        return propertyList;
    }

    /**
     * @param propertyList the propertyList to set
     */
    public void setPropertyList(List<Property> propertyList) {
        this.propertyList = propertyList;
    }

    /*
     * (non-Javadoc)
     *
     * @see in.ollie.innogysmarthome.entity.PropertyList#getPropertyMap()
     */
    @Override
    protected Map<String, Property> getPropertyMap() {
        if (propertyMap == null) {
            propertyMap = Property.getHashMap(propertyList);
        }

        return propertyMap;
    }

    /**
     * @return the dataList
     */
    protected List<Object> getDataList() {
        return dataList;
    }

    /**
     * @param dataList the dataList to set
     */
    public void setDataList(List<Object> dataList) {
        this.dataList = dataList;
    }

    /**
     * Returns the id of the link or null, if there is no link or the link does not have an id.
     *
     * @return String the id of the link or null
     */
    public String getLinkId() {
        String linkType = getLinkType();
        if (linkType != null && !linkType.equals(LINK_TYPE_UNKNOWN) && !linkType.equals(LINK_TYPE_SHC)) {
            String linkValue = getLink().getValue();
            if (linkValue != null) {
                return linkValue.replace(linkType, "");
            }
        }
        return null;
    }

    /**
     * Returns the Type of the {@link Link} in the {@link Event}.
     *
     * @return
     */
    public String getLinkType() {
        Link link = getLink();
        if (link != null) {
            String linkValue = link.getValue();
            if (linkValue.startsWith(LINK_TYPE_CAPABILITY)) {
                return LINK_TYPE_CAPABILITY;
            } else if (linkValue.startsWith(LINK_TYPE_DEVICE)) {
                return LINK_TYPE_DEVICE;
            } else if (linkValue.startsWith(LINK_TYPE_MESSAGE)) {
                return LINK_TYPE_MESSAGE;
            } else if (linkValue.startsWith(LINK_TYPE_SHC)) {
                return LINK_TYPE_SHC;
            } else {
                return LINK_TYPE_UNKNOWN;
            }
        }
        return null;
    }

    /**
     * Returns true, if the {@link Event} is a StateChangedEvent.
     *
     * @return
     */
    public boolean isStateChangedEvent() {
        return getType().equals(TYPE_STATE_CHANGED);
    }

    /**
     * Returns true, if the {@link Event} is a NewMessageReceivedEvent.
     *
     * @return
     */
    public boolean isNewMessageReceivedEvent() {
        return getType().equals(TYPE_NEW_MESSAGE_RECEIVED);
    }

    /**
     * Returns true, if the {@link Event} is a MessageDeletedEvent.
     *
     * @return
     */
    public boolean isMessageDeletedEvent() {
        return getType().equals(TYPE_MESSAGE_DELETED);
    }

    /**
     * Returns true, if the {@link Event} is a Disconnect event.
     *
     * @return
     */
    public boolean isDisconnectedEvent() {
        return getType().equals(TYPE_DISCONNECT);
    }

    /**
     * Returns true, if the {@link Event} is a ConfigChanged event.
     *
     * @return
     */
    public boolean isConfigChangedEvent() {
        return getType().equals(TYPE_CONFIG_CHANGED);
    }

    /**
     * Returns true, if the {@link Link} points to a {@link Capability}.
     *
     * @return
     */
    public Boolean isLinkedtoCapability() {
        Link link = getLink();
        if (link != null) {
            String linkValue = link.getValue();
            return linkValue.startsWith(LINK_TYPE_CAPABILITY);
        }
        return null;
    }

    /**
     * Returns true, if the {@link Link} points to a {@link Device}.
     *
     * @return
     */
    public Boolean isLinkedtoDevice() {
        Link link = getLink();
        if (link != null) {
            String linkValue = link.getValue();
            return linkValue.startsWith(LINK_TYPE_DEVICE);
        }
        return null;
    }

    /**
     * Returns true, if the {@link Link} points to a {@link Message}.
     *
     * @return
     */
    public Boolean isLinkedtoMessage() {
        Link link = getLink();
        if (link != null) {
            String linkValue = link.getValue();
            return linkValue.startsWith(LINK_TYPE_DEVICE);
        }
        return null;
    }

    /**
     * Returns true, if the {@link Link} points to the SHC {@link Device}.
     *
     * @return
     */
    public Boolean isLinkedtoSHC() {
        Link link = getLink();
        if (link != null) {
            String linkValue = link.getValue();
            return linkValue.startsWith(LINK_TYPE_SHC);
        }
        return null;
    }

    // private Class getEventTypeClass() {
    // return StateChangedEvent.class;
    // }
    //
    // public <T extends Event> T getTypifiedEvent(Class<T> type) {
    // return type.cast(this);
    // }
    //
    // public State getNewState() {
    // return getTypifiedEvent(getEventTypeClass()).getNewState();
    // }

    /**
     * Returns the configurationVersion or null, if this {@link Property} is not available in the event.
     *
     * @return
     */
    public Integer getConfigurationVersion() {
        return getPropertyValueAsInteger(EVENT_PROPERTY_CONFIGURATION_VERSION);
    }
}
