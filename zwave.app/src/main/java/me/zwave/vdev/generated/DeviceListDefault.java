// Generated with g9.

package me.zwave.vdev.generated;

import java.util.Set;

import me.zwave.vdev.Device;

/**
 * This file will be overwritten the next time it is generated from g9.
 */
@SuppressWarnings("all")
public abstract class DeviceListDefault {

    private boolean structureChanged;
    private int updateTime;
    private Set<Device> devices;

    /** Default constructor. */
    protected DeviceListDefault() {
        super();
    }

    /**
     * Access method for structureChanged.
     *
     * @return true if and only if structureChanged is currently true
     */
    public boolean getStructureChanged() {
        return structureChanged;
    }

    /**
     * Setter method for structureChanged.
     *
     * @param aStructureChanged the new value for structureChanged
     */
    public void setStructureChanged(boolean aStructureChanged) {
        structureChanged = aStructureChanged;
    }

    /**
     * Access method for updateTime.
     *
     * @return the current value of updateTime
     */
    public int getUpdateTime() {
        return updateTime;
    }

    /**
     * Setter method for updateTime.
     *
     * @param aUpdateTime the new value for updateTime
     */
    public void setUpdateTime(int aUpdateTime) {
        updateTime = aUpdateTime;
    }

    /**
     * Access method for devices.
     *
     * @return the current value of devices
     */
    public Set<Device> getDevices() {
        return devices;
    }

    /**
     * Setter method for devices.
     *
     * @param aDevices the new value for devices
     */
    public void setDevices(Set<Device> aDevices) {
        devices = aDevices;
    }

}
