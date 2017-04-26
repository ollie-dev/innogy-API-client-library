package in.ollie.innogysmarthome;

public enum JSONApiResponseKeysEnum {

    DEVICE_ID("id"),
    DEVICE_MANUFACTURER("manufacturer"),
    DEVICE_VERSION("version"),
    DEVICE_PRODUCT("product"),
    DEVICE_SERIALNUMBER("serialnumber"),
    DEVICE_DESC("desc"),
    DEVICE_TYPE("type"),
    DEVICE_CONFIG_ARRAY("config"),
    DEVICE_CAPABILITIES_ARRAY("capabilities");

    private final String key;

    private JSONApiResponseKeysEnum(String key) {
        this.key = key;
    }

    /**
     * Returns the key.
     *
     * @return key
     */
    public String getKey() {
        return key;
    }
}
