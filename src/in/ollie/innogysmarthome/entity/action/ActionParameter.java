package in.ollie.innogysmarthome.entity.action;

import com.google.api.client.util.Key;

import in.ollie.innogysmarthome.entity.Constant;

public class ActionParameter {

    @Key("name")
    private String name;

    @Key("type")
    private String type;

    @Key("Constant")
    private Constant constant;

    public ActionParameter(String name, String type, Constant constant) {
        this.name = name;
        this.type = type;
        this.constant = constant;
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
     * @return the constant
     */
    public Constant getConstant() {
        return constant;
    }

    /**
     * @param constant the constant to set
     */
    public void setConstant(Constant constant) {
        this.constant = constant;
    }

}
