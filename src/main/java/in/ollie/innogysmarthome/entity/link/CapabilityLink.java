package in.ollie.innogysmarthome.entity.link;

public class CapabilityLink extends Link {
    public final static String LINK_BASE = "/capability/";

    public String getId() {
        return getValue().replace(LINK_BASE, "");
    }
}
