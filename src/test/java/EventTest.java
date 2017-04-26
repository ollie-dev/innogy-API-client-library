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

    private Event eventDeviceStateChanged;
    private Event eventCapabilityChanged;
    private Event eventControllerConnectivityChanged;
    private Event eventNewMessageReceivedDeviceUnreachable;
    private Event eventNewMessageReceivedDeviceLowBattery;

    @Before
    public void setUp() throws IOException {
        Gson gson = new Gson();
        eventDeviceStateChanged = gson.fromJson(this.readResource("eventDeviceStateChanged.json", Charsets.UTF_8),
                Event.class);
        eventCapabilityChanged = gson.fromJson(this.readResource("eventCapabilityChanged.json", Charsets.UTF_8),
                Event.class);
        eventControllerConnectivityChanged = gson
                .fromJson(this.readResource("eventControllerConnectivityChanged.json", Charsets.UTF_8), Event.class);
        eventNewMessageReceivedDeviceUnreachable = gson
                .fromJson(this.readResource("eventNewMessageDeviceUnreachable.json", Charsets.UTF_8), Event.class);
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
        assertEquals("/device/76e68e066e874b9da3403223cbf4b048", m.getDeviceLinkList().get(0).getValue());
        assertEquals("/product/core.RWE/2.01", m.getProductLink().getValue());
    }
}
