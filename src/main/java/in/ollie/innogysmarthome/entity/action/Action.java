package in.ollie.innogysmarthome.entity.action;

import java.util.List;

import com.google.api.client.util.Key;
import com.google.gson.annotations.SerializedName;

import in.ollie.innogysmarthome.entity.link.Link;

public class Action {

    public final static String ACTION_TYPE_SETSTATE = "device/SHC.RWE/1.0/action/SetState";

    @Key("type")
    private String type;

    @Key("Link")
    @SerializedName("Link")
    private Link capabilityLink;

    @Key("Data")
    @SerializedName("Data")
    private List<ActionParameter> parameterList;

    public Action() {
    }

    public Action(String type) {
        this.type = type;
    }

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
     * @return the capabilityLink
     */
    public Link getCapabilityLink() {
        return capabilityLink;
    }

    /**
     * @param capabilityLink the capabilityLink to set
     */
    public void setCapabilityLink(Link capabilityLink) {
        this.capabilityLink = capabilityLink;
    }

    /**
     * Sets the capability link to the given capability id.
     *
     * @param capabilityId String with the 32 character long id
     */
    public void setCapabilityLink(String capabilityId) {
        setCapabilityLink(new Link("/capability/" + capabilityId));
    }

    /**
     * @return the parameterList
     */
    public List<ActionParameter> getParameterList() {
        return parameterList;
    }

    /**
     * @param parameterList the parameterList to set
     */
    public void setParameterList(List<ActionParameter> parameterList) {
        this.parameterList = parameterList;
    }

}
