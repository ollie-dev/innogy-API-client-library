package in.ollie.innogysmarthome;

import java.util.Set;

import com.google.common.collect.ImmutableSet;

public class Constants {

    // devices
    public final static Set<String> BATTERY_POWERED_DEVICES = ImmutableSet.of("RST", "WRT", "WDS", "WSD", "WSD2", "WMD",
            "WMDO", "WSC2", "BRC8");

    // API URLs
    public final static String API_VERSION = "1.0";
    public final static String REDIRECT_URL = "https://www.ollie.in/rwe-smarthome-token/";
    public final static String API_URL_TOKEN = "https://api.services-smarthome.de/AUTH/token";
    public final static String API_URL_BASE = "https://api.services-smarthome.de/API/" + API_VERSION;

    public final static String API_URL_CHECK_CONNECTION = API_URL_BASE + "/desc/device/SHC.RWE/1.0/event/StateChanged";
    public final static String API_URL_INITIALIZE = API_URL_BASE + "/initialize";
    public final static String API_URL_UNINITIALIZE = API_URL_BASE + "/uninitialize";

    public final static String API_URL_DEVICE = API_URL_BASE + "/device";
    public final static String API_URL_DEVICE_ID = API_URL_DEVICE + "/{id}";
    public final static String API_URL_DEVICE_ID_STATE = API_URL_DEVICE_ID + "/state";
    public final static String API_URL_DEVICE_CAPABILITIES = API_URL_DEVICE + "/{id}/capabilities";
    public final static String API_URL_DEVICE_STATES = API_URL_DEVICE + "/states";

    public final static String API_URL_LOCATION = API_URL_BASE + "/location";

    public final static String API_URL_CAPABILITY = API_URL_BASE + "/capability";
    public final static String API_URL_CAPABILITY_STATES = API_URL_CAPABILITY + "/states";

    public final static String API_URL_MESSAGE = API_URL_BASE + "/message";

    public final static String API_URL_EVENTS = "wss://api.services-smarthome.de/API/" + API_VERSION
            + "/events?token={token}";

    public final static String API_URL_ACTION = "https://api.services-smarthome.de/API/1.0/action";

    // others
    public final static String FORMAT_DATETIME = "dd.MM.yyyy HH:mm:ss";
}
