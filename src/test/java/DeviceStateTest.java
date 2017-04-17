import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;

import in.ollie.innogysmarthome.entity.Property;
import in.ollie.innogysmarthome.entity.state.DeviceState;

public class DeviceStateTest {

    DeviceState dsSHC;
    DeviceState dsWMD;

    @Before
    public void setUp() {
        Gson gson = new Gson();
        Property[] deviceStateArraySHC = gson.fromJson(
                "[{\"name\":\"UpdateAvailable\",\"value\":\"\",\"lastchanged\":\"2016-12-01T23:15:06.5470000Z\"},{\"name\":\"LastReboot\",\"value\":\"2016-12-01T23:13:49.879Z\",\"lastchanged\":\"2016-12-01T23:15:06.6030000Z\"},{\"name\":\"MBusDongleAttached\",\"value\":false,\"lastchanged\":\"2016-12-01T23:15:06.6340000Z\"},{\"name\":\"LBDongleAttached\",\"value\":false,\"lastchanged\":\"2016-12-01T23:15:06.6340000Z\"},{\"name\":\"ConfigVersion\",\"value\":132.0,\"lastchanged\":\"2016-12-07T07:38:15.0150000Z\"},{\"name\":\"OSState\",\"value\":\"Normal\",\"lastchanged\":\"2016-12-02T00:15:06.7000000Z\"},{\"name\":\"MemoryLoad\",\"value\":61.0,\"lastchanged\":\"2016-12-07T14:56:15.9650000Z\"},{\"name\":\"CPULoad\",\"value\":10.0,\"lastchanged\":\"2016-12-07T14:56:15.9660000Z\"}]",
                Property[].class);
        List<Property> deviceStateListSHC = Arrays.asList(deviceStateArraySHC);
        dsSHC = new DeviceState();
        dsSHC.setStateList(deviceStateListSHC);

        Property[] deviceStateArrayWMD = gson.fromJson(
                "[{\"name\":\"IsReachable\",\"value\":true,\"lastchanged\":\"0001-01-01T00:00:00.0000000Z\"},{\"name\":\"DeviceConfigurationState\",\"value\":\"Complete\",\"lastchanged\":\"0001-01-01T00:00:00.0000000Z\"},{\"name\":\"DeviceInclusionState\",\"value\":\"Included\",\"lastchanged\":\"2017-04-08T06:19:37.1930000Z\"},{\"name\":\"UpdateState\",\"value\":\"UpToDate\",\"lastchanged\":\"0001-01-01T00:00:00.0000000Z\"},{\"name\":\"FirmwareVersion\",\"value\":\"1.5\",\"lastchanged\":\"2017-04-16T22:17:20.2790000Z\"}]",
                Property[].class);
        List<Property> deviceStateListWMD = Arrays.asList(deviceStateArrayWMD);
        dsWMD = new DeviceState();
        dsWMD.setStateList(deviceStateListWMD);
    }

    @Test
    public void testGetUpdateAvailable() {
        assertTrue(dsSHC.getUpdateAvailable().equals(""));
    }

    @Test
    public void testGetLastReboot() {
        // 2016-12-01T23:13:49.879Z
        DateTime dateTime = new DateTime(2016, 12, 01, 23, 13, 49, 879, DateTimeZone.UTC)
                .toDateTime(DateTimeZone.forOffsetHours(1));
        DateTime lastRebootTime = dsSHC.getLastReboot();
        assertTrue(lastRebootTime.isEqual(dateTime));
    }

    @Test
    public void testGetConfigurationVersion() {
        assertEquals(new Integer(132), dsSHC.getConfigVersion());
    }

    @Test
    public void testIsReachable() {
        assertTrue(dsWMD.getIsReachable());
    }

    @Test
    public void testSetIsReachable() {
        dsWMD.setIsReachable(false);
        assertFalse(dsWMD.getIsReachable());
        assertTrue(dsWMD.getStateMap().containsKey("IsReachable"));
        assertFalse((boolean) dsWMD.getStateMap().get("IsReachable").getValue());
    }
}
