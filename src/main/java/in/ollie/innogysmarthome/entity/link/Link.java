package in.ollie.innogysmarthome.entity.link;

import com.google.api.client.util.Key;

import in.ollie.innogysmarthome.entity.Message;
import in.ollie.innogysmarthome.entity.capability.Capability;
import in.ollie.innogysmarthome.entity.device.Device;

public class Link {

    public final static String LINK_TYPE_CAPABILITY = "/capability/";
    public final static String LINK_TYPE_DEVICE = "/device/";
    public final static String LINK_TYPE_MESSAGE = "/message/";
    public final static String LINK_TYPE_SHC = "/desc/device/SHC.RWE/";
    public final static String LINK_TYPE_UNKNOWN = "unknown";

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

    /**
     * Returns the Type of the {@link Link}.
     *
     * @return
     */
    public String getLinkType() {
        String linkValue = getValue();
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

    /**
     * Returns true, if the {@link Link} points to a {@link Capability}.
     * 
     * @return
     */
    public boolean isTypeCapability() {
        return getLinkType().equals(LINK_TYPE_CAPABILITY);
    }

    /**
     * Returns true, if the {@link Link} points to a {@link Device}.
     * 
     * @return
     */
    public boolean isTypeDevice() {
        return getLinkType().equals(LINK_TYPE_DEVICE);
    }

    /**
     * Returns true, if the {@link Link} points to a {@link Message}.
     * 
     * @return
     */
    public boolean isTypeMessage() {
        return getLinkType().equals(LINK_TYPE_MESSAGE);
    }

    /**
     * Returns true, if the {@link Link} points to a SHC.
     * 
     * @return
     */
    public boolean isTypeSHC() {
        return getLinkType().equals(LINK_TYPE_SHC);
    }

    /**
     * Returns true, if the {@link Link} points to something unknown.
     * 
     * @return
     */
    public boolean isTypeUnknown() {
        return getLinkType().equals(LINK_TYPE_UNKNOWN);
    }
}
