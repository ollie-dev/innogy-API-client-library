package in.ollie.innogysmarthome.entity;

import java.util.List;

import com.google.api.client.util.Key;

import in.ollie.innogysmarthome.entity.link.Link;

public class Message {
    /** device related messages */
    public final static String TYPE_DEVICE_UNREACHABLE = "DeviceUnreachable";
    public final static String TYPE_DEVICE_ACTIVITY_LOGGING_ENABLED = "DeviceActivityLoggingEnabled";
    public final static String TYPE_DEVICE_FACTORY_RESET = "DeviceFactoryReset";
    public final static String TYPE_DEVICE_LOW_BATTERY = "DeviceLowBattery";
    public final static String TYPE_DEVICE_MOLD = "DeviceMold";
    public final static String TYPE_DEVICE_LOW_RF_QUALITY = "DeviceLowRfQuality";
    public final static String TYPE_DEVICE_FREEZE = "DeviceFreeze";
    public final static String TYPE_SH_DEVICE_UPDATE_AVAILABLE = "ShDeviceUpdateAvailable";
    public final static String TYPE_SH_DEVICE_UPDATE_FAILED = "ShDeviceUpdateFailed";

    /** user related messages */
    public final static String TYPE_USER_EMAIL_ADDRESS_NOT_VALIDATED = "UserEmailAddressNotValidated";
    public final static String TYPE_USER_INVITATION_ACCEPTED = "UserInvitiationAccepted";
    public final static String TYPE_USER_FOREIGN_DELETION = "UserForeignDeletion";

    /** SHC related messages */
    public final static String TYPE_SHC_REMOTE_REBOOTED = "ShcRemoteRebooted";
    public final static String TYPE_SHC_UPDATE_COMPLETED = "ShcUpdateCompleted";
    public final static String TYPE_SHC_UPDATE_CANCELED = "ShcUpdateCanceled";
    public final static String TYPE_SHC_DEFERRABLE_UPDATE = "ShcDeferrableUpdate";
    public final static String TYPE_SHC_REAL_TIME_CLOCK_LOST = "ShcRealTimeClockLost";
    public final static String TYPE_SHC_ONLINE_SWITCH_IS_OFF = "ShcOnlineSwitchIsOff";
    public final static String TYPE_SHC_MANDATORY_UPDATE = "ShcMandatoryUpdate";
    public final static String TYPE_SHC_NO_CONNECTION_TO_BACKEND = "ShcNoConnectionToBackend";

    /** app related messages */
    public final static String TYPE_APP_ADDED_TO_SHC = "AppAddedToShc";
    public final static String TYPE_APP_UPDATED_ON_SHC = "AppUpdatedOnShc";
    public final static String TYPE_APP_TOKEN_SYNC_FAILURE = "AppTokenSyncFailure";
    public final static String TYPE_APP_DOWNLOAD_FAILED = "AppDownloadFailed";
    public final static String TYPE_APPLICATION_LOADING_ERROR = "ApplicationLoadingError";
    public final static String TYPE_APPLICATION_EXPIRED = "ApplicationExpired";
    public final static String TYPE_INVALID_CUSTOM_APP = "InvalidCustomApp";
    public final static String TYPE_CUSTOM_APP_WAS_UPGRADED = "CustomAppWasUpgraded";
    public final static String TYPE_CUSTOM_APP_UPGRADE_FAILED = "CustomAppUpgradeFailed";

    /** others */
    public final static String TYPE_BID_COS_INCLUSION_TIMEOUT = "BidCosInclusionTimeout";
    public final static String TYPE_ADDRESS_COLLISION = "AddressCollision";
    public final static String TYPE_BACKEND_CONFIG_OUT_OF_SYNC = "BackendConfigOutOfSync";
    public final static String TYPE_SMOKE_DETECTED = "SmokeDetected";
    public final static String TYPE_LEMON_BEAT_DONGLE_INITIALIZATION_FAILED = "LemonBeatDongleInitializationFailed";
    public final static String TYPE_USB_DEVICE_UNPLUGGED = "USBDeviceUnplugged";
    public final static String TYPE_INVALID_AES_KEY = "InvalidAesKey";
    public final static String TYPE_MEMORY_SHORTAGE = "MemoryShortage";
    public final static String TYPE_LOG_LEVEL_CHANGED = "LogLevelChanged";
    public final static String TYPE_RULE_EXCEPTION_FAILED = "RuleExecutionFailed";
    public final static String TYPE_SEND_MESSAGE_LIMIT_EXCEEDED = "SendMessageLimitExceeded";
    public final static String TYPE_CONFIG_FIX_ENTITY_DELETED = "ConfigFixEntityDeleted";

    /**
     * Identifier of the message – must be unique.
     */
    @Key("id")
    private String id;

    /**
     * Specifies the type of the message.
     */
    @Key("type")
    private String type;

    /**
     * Defines whether it is an alert or a message, default is message.
     */
    @Key("class")
    private String messageClass;

    /**
     * Reference to the description of the message.
     *
     * Optional.
     */
    @Key("desc")
    private String desc;

    /**
     * Timestamp when the message was created.
     *
     * Optional.
     */
    @Key("timestamp")
    private String timestamp;

    /**
     * Defines whether the message has been viewed by a user.
     */
    @Key("read")
    private boolean isRead;

    /**
     * Reference to the underlying product, which the message relates to.
     */
    @Key("Product")
    private Link productLink;

    /**
     * Reference to the underlying devices, which the message relates to.
     *
     * Optional.
     */
    @Key("Devices")
    private List<Link> deviceLinkList;

    /**
     * Reference to the underlying capabilities, which the message relates to.
     *
     * Optional.
     */
    @Key("Capabilities")
    private List<Link> capabilityLinkList;

    /**
     * Container for all parameters of the message. The parameters are contained in Property entities.
     *
     * Optional.
     */
    @Key("Data")
    private List<Property> dataPropertyList;

    /**
     * Container for tagging the message, e.g. if the message should only be visible to certain roles.
     *
     * Optional.
     */
    @Key("Tags")
    private List<Property> tagsPropertyList;

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
     * @return the messageClass
     */
    public String getMessageClass() {
        return messageClass;
    }

    /**
     * @param messageClass the messageClass to set
     */
    public void setMessageClass(String messageClass) {
        this.messageClass = messageClass;
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
     * @return the isRead
     */
    public boolean isRead() {
        return isRead;
    }

    /**
     * @param isRead the isRead to set
     */
    public void setRead(boolean isRead) {
        this.isRead = isRead;
    }

    /**
     * @return the productLink
     */
    public Link getProductLink() {
        return productLink;
    }

    /**
     * @param productLink the productLink to set
     */
    public void setProductLink(Link productLink) {
        this.productLink = productLink;
    }

    /**
     * @return the deviceLinkList
     */
    public List<Link> getDeviceLinkList() {
        return deviceLinkList;
    }

    /**
     * @param deviceLinkList the deviceLinkList to set
     */
    public void setDeviceLinkList(List<Link> deviceLinkList) {
        this.deviceLinkList = deviceLinkList;
    }

    /**
     * @return the capabilityLinkList
     */
    public List<Link> getCapabilityLinkList() {
        return capabilityLinkList;
    }

    /**
     * @param capabilityLinkList the capabilityLinkList to set
     */
    public void setCapabilityLinkList(List<Link> capabilityLinkList) {
        this.capabilityLinkList = capabilityLinkList;
    }

    /**
     * @return the dataPropertyList
     */
    public List<Property> getDataPropertyList() {
        return dataPropertyList;
    }

    /**
     * @param dataPropertyList the dataPropertyList to set
     */
    public void setDataPropertyList(List<Property> dataPropertyList) {
        this.dataPropertyList = dataPropertyList;
    }

    /**
     * @return the tagsPropertyList
     */
    public List<Property> getTagsPropertyList() {
        return tagsPropertyList;
    }

    /**
     * @param tagsPropertyList the tagsPropertyList to set
     */
    public void setTagsPropertyList(List<Property> tagsPropertyList) {
        this.tagsPropertyList = tagsPropertyList;
    }
}
