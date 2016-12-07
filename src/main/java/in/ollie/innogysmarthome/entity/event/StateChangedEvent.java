package in.ollie.innogysmarthome.entity.event;

import in.ollie.innogysmarthome.entity.Property;

public class StateChangedEvent extends Event {
    public static Boolean getOnState(Event event) {
        // TODO: prüfen, ob es hier einen undefinierten Status geben kann bei Events
        for (Property p : event.getPropertyList()) {
            if (p.getName().equals("OnState")) {
                return (Boolean) p.getValue();
            }
        }
        return null;
    }

    // public static State getNewState(Event event) {
    // return getOnState(event) ? OnOffType.ON : OnOffType.OFF;
    // }
}
