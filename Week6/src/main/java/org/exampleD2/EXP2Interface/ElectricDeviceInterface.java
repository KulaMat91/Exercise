package org.exampleD2.EXP2Interface;

public interface ElectricDeviceInterface extends DeviceInterface, ElectricityConsumerInterface {
    void plugIn();

    void unplug();

    void consumePower(double watts);
}
