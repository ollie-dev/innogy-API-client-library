package in.ollie.innogysmarthome.entity;

import java.util.List;

import com.google.api.client.util.Key;

import in.ollie.innogysmarthome.entity.device.Device;

public class SHCInfo {

    @Key("CurrentConfigurationVersion")
    public long currentConfigurationVersion;

    @Key("Data")
    public List<Device> deviceList;
}
