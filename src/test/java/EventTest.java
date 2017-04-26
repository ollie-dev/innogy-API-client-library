import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;
import com.google.gson.Gson;

import in.ollie.innogysmarthome.entity.Message;
import in.ollie.innogysmarthome.entity.Property;
import in.ollie.innogysmarthome.entity.event.Event;

public class EventTest {

    private final static String eventMessage_DeviceStateChanged = "{\"type\":\"device/SHC.RWE/1.0/event/StateChanged\",\"timestamp\":\"2016-12-07T07:39:14.3640000Z\",\"desc\":\"/desc/device/SHC.RWE/1.0/event/StateChanged\",\"link\":{\"value\":\"/device/76e68e066e874b9da3403223cbf4b048\"},\"Properties\":[{\"name\":\"IsReachable\",\"value\":false,\"lastchanged\":\"2016-12-07T07:39:14.3350000Z\"},{\"name\":\"DeviceConfigurationState\",\"value\":\"Complete\",\"lastchanged\":\"0001-01-01T00:00:00.0000000Z\"},{\"name\":\"DeviceInclusionState\",\"value\":\"Included\",\"lastchanged\":\"2016-12-07T07:12:19.6290000Z\"},{\"name\":\"UpdateState\",\"value\":\"UpToDate\",\"lastchanged\":\"0001-01-01T00:00:00.0000000Z\"},{\"name\":\"FirmwareVersion\",\"value\":\"1.0\",\"lastchanged\":\"2016-12-07T07:39:14.3630000Z\"}]}";
    private final static String eventMessage_CapabilityChanged = "{\"type\": \"device/SHC.RWE/1.0/event/StateChanged\",\"timestamp\": \"2016-10-21T22:16:46.9990000Z\",\"desc\": \"/desc/device/SHC.RWE/1.0/event/StateChanged\",\"link\": {\"value\": \"/capability/2d7e58bca7fc40148e77cb4df6daef90\"},\"Properties\": [{\"name\": \"Value\",\"value\": false,\"lastchanged\": \"2016-10-21T22:16:46.9780000Z\"}]}";
    private final static String eventMessage_ControllerConnectivityChanged = "{\"type\":\"device/SHC.RWE/1.0/event/ControllerConnectivityChanged\",\"timestamp\":\"2016-12-07T19:47:25.1124564Z\",\"desc\":\"/desc/device/SHC.RWE/1.0/event/ControllerConnectivityChanged\",\"link\":{\"value\":\"/desc/device/SHC.RWE/1.0\"},\"Properties\":[{\"name\":\"IsConnected\",\"value\":false}],\"Data\":[]}";
    private final static String eventMessage_NewMessageReceivedDeviceUnreachable = "{\"type\":\"device/SHC.RWE/1.0/event/NewMessageReceived\",\"timestamp\":\"2016-12-07T07:39:14.5980000Z\",\"desc\":\"/desc/device/SHC.RWE/1.0/event/NewMessageReceived\",\"link\":{\"value\":\"/desc/device/SHC.RWE/1.0\"},\"Data\":[{\"id\":\"ad20d5fe86d64dd0a59a113272ea8780\",\"type\":\"DeviceUnreachable\",\"read\":false,\"class\":\"Alert\",\"desc\":\"/desc/product/core.RWE/2.01/message/DeviceUnreachable\",\"timestamp\":\"2016-12-07T07:39:14.483Z\",\"Devices\":[{\"value\":\"/device/76e68e066e874b9da3403223cbf4b048\"}],\"Data\":[{\"name\":\"DeviceName\",\"value\":\"Rauchmelder\"},{\"name\":\"SerialNumber\",\"value\":\"IRW0020883\"},{\"name\":\"LocationName\",\"value\":\"Küche\"}],\"Product\":{\"value\":\"/product/core.RWE/2.01\"}}]}";

    private Event eventDeviceStateChanged;
    private Event eventCapabilityChanged;
    private Event eventControllerConnectivityChanged;
    private Event eventNewMessageReceivedDeviceUnreachable;
    private Event eventNewMessageReceivedDeviceLowBattery;

    @Before
    public void setUp() throws IOException {
        Gson gson = new Gson();
        eventDeviceStateChanged = gson.fromJson(eventMessage_DeviceStateChanged, Event.class);
        eventCapabilityChanged = gson.fromJson(eventMessage_CapabilityChanged, Event.class);
        eventControllerConnectivityChanged = gson.fromJson(eventMessage_ControllerConnectivityChanged, Event.class);
        eventNewMessageReceivedDeviceUnreachable = gson.fromJson(eventMessage_NewMessageReceivedDeviceUnreachable,
                Event.class);
        eventNewMessageReceivedDeviceLowBattery = gson
                .fromJson(this.readResource("eventNewMessageDeviceLowBattery.json", Charsets.UTF_8), Event.class);
    }

    public String readResource(final String fileName, Charset charset) throws IOException {
        return Resources.toString(Resources.getResource(fileName), charset);
    }

    @Test
    public void testGetType() {
        assertTrue(eventDeviceStateChanged.getType().equals("device/SHC.RWE/1.0/event/StateChanged"));
        assertTrue(eventCapabilityChanged.getType().equals("device/SHC.RWE/1.0/event/StateChanged"));
        assertTrue(eventControllerConnectivityChanged.getType()
                .equals("device/SHC.RWE/1.0/event/ControllerConnectivityChanged"));
        assertTrue(eventNewMessageReceivedDeviceUnreachable.getType()
                .equals("device/SHC.RWE/1.0/event/NewMessageReceived"));
        assertTrue(eventNewMessageReceivedDeviceLowBattery.getType()
                .equals("device/SHC.RWE/1.0/event/NewMessageReceived"));
    }

    @Test
    public void testIsLinkedTo() {
        assertTrue(eventCapabilityChanged.isLinkedtoCapability());
        assertTrue(eventDeviceStateChanged.isLinkedtoDevice());
        assertTrue(eventControllerConnectivityChanged.isLinkedtoSHC());
        assertTrue(eventNewMessageReceivedDeviceUnreachable.isLinkedtoSHC());
        assertTrue(eventNewMessageReceivedDeviceLowBattery.isLinkedtoSHC());
    }

    @Test
    public void testIsConnected() {
        assertFalse(eventControllerConnectivityChanged.getIsConnected());
        assertNull(eventNewMessageReceivedDeviceUnreachable.getIsConnected());
    }

    @Test
    public void testPropertyIsReachable() {
        List<Property> propertyList = eventDeviceStateChanged.getPropertyList();
        Property p = propertyList.get(0);
        assertEquals(p.getName(), "IsReachable");
        assertFalse((boolean) p.getValue());
    }

    @Test
    public void testDeviceLowBatteryEvent() {
        Message m = eventNewMessageReceivedDeviceLowBattery.getDataListAsMessage().get(0);
        assertEquals("6e2ff765d6714baab5925f4f30e8afb4", m.getId());
        assertEquals("DeviceLowBattery", m.getType());
        assertFalse(m.isRead());
        assertEquals("Alert", m.getMessageClass());
        assertEquals("/desc/product/core.RWE/2.01/message/DeviceLowBattery", m.getDesc());
        assertEquals("2016-12-29T08:22:53.072Z", m.getTimestamp());
        assertEquals("/device/73e38e033e874b9da3403223cbf4b048", m.getDeviceLinkList().get(0).getValue());
        assertEquals("/product/core.RWE/2.01", m.getProductLink().getValue());
    }
}
