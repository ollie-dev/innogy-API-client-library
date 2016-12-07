import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;

import in.ollie.innogysmarthome.entity.event.Event;

public class EventTest {

    private final static String eventMessage_DeviceStateChanged = "{\"type\":\"device/SHC.RWE/1.0/event/StateChanged\",\"timestamp\":\"2016-12-07T07:39:14.3640000Z\",\"desc\":\"/desc/device/SHC.RWE/1.0/event/StateChanged\",\"link\":{\"value\":\"/device/76e68e066e874b9da3403223cbf4b048\"},\"Properties\":[{\"name\":\"IsReachable\",\"value\":false,\"lastchanged\":\"2016-12-07T07:39:14.3350000Z\"},{\"name\":\"DeviceConfigurationState\",\"value\":\"Complete\",\"lastchanged\":\"0001-01-01T00:00:00.0000000Z\"},{\"name\":\"DeviceInclusionState\",\"value\":\"Included\",\"lastchanged\":\"2016-12-07T07:12:19.6290000Z\"},{\"name\":\"UpdateState\",\"value\":\"UpToDate\",\"lastchanged\":\"0001-01-01T00:00:00.0000000Z\"},{\"name\":\"FirmwareVersion\",\"value\":\"1.0\",\"lastchanged\":\"2016-12-07T07:39:14.3630000Z\"}]}";
    private final static String eventMessage_CapabilityChanged = "{\"type\": \"device/SHC.RWE/1.0/event/StateChanged\",\"timestamp\": \"2016-10-21T22:16:46.9990000Z\",\"desc\": \"/desc/device/SHC.RWE/1.0/event/StateChanged\",\"link\": {\"value\": \"/capability/2d7e58bca7fc40148e77cb4df6daef90\"},\"Properties\": [{\"name\": \"Value\",\"value\": false,\"lastchanged\": \"2016-10-21T22:16:46.9780000Z\"}]}";
    private final static String eventMessage_ControllerConnectivityChanged = "{\"type\":\"device/SHC.RWE/1.0/event/ControllerConnectivityChanged\",\"timestamp\":\"2016-12-07T19:47:25.1124564Z\",\"desc\":\"/desc/device/SHC.RWE/1.0/event/ControllerConnectivityChanged\",\"link\":{\"value\":\"/desc/device/SHC.RWE/1.0\"},\"Properties\":[{\"name\":\"IsConnected\",\"value\":false}],\"Data\":[]}";
    private final static String eventMessage_NewMessageReceived = "{\"type\":\"device/SHC.RWE/1.0/event/NewMessageReceived\",\"timestamp\":\"2016-12-07T07:39:14.5980000Z\",\"desc\":\"/desc/device/SHC.RWE/1.0/event/NewMessageReceived\",\"link\":{\"value\":\"/desc/device/SHC.RWE/1.0\"},\"Data\":[{\"id\":\"ad20d5fe86d64dd0a59a113272ea8780\",\"type\":\"DeviceUnreachable\",\"read\":false,\"class\":\"Alert\",\"desc\":\"/desc/product/core.RWE/2.01/message/DeviceUnreachable\",\"timestamp\":\"2016-12-07T07:39:14.483Z\",\"Devices\":[{\"value\":\"/device/76e68e066e874b9da3403223cbf4b048\"}],\"Data\":[{\"name\":\"DeviceName\",\"value\":\"Rauchmelder\"},{\"name\":\"SerialNumber\",\"value\":\"IRW0020883\"},{\"name\":\"LocationName\",\"value\":\"Küche\"}],\"Product\":{\"value\":\"/product/core.RWE/2.01\"}}]}";

    private Event eventDeviceStateChanged;
    private Event eventCapabilityChanged;
    private Event eventControllerConnectivityChanged;
    private Event eventNewMessageReceived;

    @Before
    public void setUp() {
        Gson gson = new Gson();
        eventDeviceStateChanged = gson.fromJson(eventMessage_DeviceStateChanged, Event.class);
        eventCapabilityChanged = gson.fromJson(eventMessage_CapabilityChanged, Event.class);
        eventControllerConnectivityChanged = gson.fromJson(eventMessage_ControllerConnectivityChanged, Event.class);
        eventNewMessageReceived = gson.fromJson(eventMessage_NewMessageReceived, Event.class);
    }

    @Test
    public void testGetType() {
        assertTrue(eventDeviceStateChanged.getType().equals("device/SHC.RWE/1.0/event/StateChanged"));
        assertTrue(eventCapabilityChanged.getType().equals("device/SHC.RWE/1.0/event/StateChanged"));
        assertTrue(eventControllerConnectivityChanged.getType()
                .equals("device/SHC.RWE/1.0/event/ControllerConnectivityChanged"));
        assertTrue(eventNewMessageReceived.getType().equals("device/SHC.RWE/1.0/event/NewMessageReceived"));
    }

    @Test
    public void testIsLinkedTo() {
        assertTrue(eventCapabilityChanged.isLinkedtoCapability());
        assertTrue(eventDeviceStateChanged.isLinkedtoDevice());
        assertTrue(eventControllerConnectivityChanged.isLinkedtoSHC());
        assertTrue(eventNewMessageReceived.isLinkedtoSHC());
    }

    @Test
    public void testIsConnected() {
        assertFalse(eventControllerConnectivityChanged.getIsConnected());
        assertNull(eventNewMessageReceived.getIsConnected());
    }

}
