// Generated with g9.

package me.zwave.vdev;

/**
 * This file will be overwritten the next time it is generated from g9.
 */
@SuppressWarnings("all")
public interface ZAutomation {

    /**
     * @return DeviceList
     */
    DeviceList getDevices();

    /**
     * @param since
     * @return DeviceList
     */
    DeviceList getChangedDevices(int since);

    /**
     * @param deviceId
     * @return Device
     */
    Device getDevice(String deviceId);

    /**
     * @param deviceId
     * @param command
     */
    void sendCommand(String deviceId, String command);

    /**
     * @param deviceId
     * @param level
     */
    void setExactLevel(String deviceId, int level);

}
