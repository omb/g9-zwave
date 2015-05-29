// Generated with g9.

package me.zway.transport.devices_os;

import com.sun.xml.bind.CycleRecoverable;

import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import no.g9.support.castor.XmlIdFieldHandler;

/**
 * This file will be overwritten the next time it is generated from g9.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class DeviceListTransport implements CycleRecoverable {
    @XmlElement
    private boolean structureChanged;
    @XmlElement
    private int updateTime;
    @XmlElement(nillable=true)
    private Set<DevicesTransport> devices;

    /** Default constructor. */
    public DeviceListTransport() {
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
     * Access method for structureChanged.
     *
     * @param aStructureChanged the new value for structureChanged
     */
    public void setStructureChanged(final boolean aStructureChanged) {
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
     * Access method for updateTime.
     *
     * @param aUpdateTime the new value for updateTime
     */
    public void setUpdateTime(final int aUpdateTime) {
        updateTime = aUpdateTime;
    }

    /**
     * Access method for devices.
     *
     * @return the current value of devices
     */
    public Set<DevicesTransport> getDevices() {
        if(devices == null) {
            devices = new HashSet<DevicesTransport>();
        }
        return devices;
    }

    /**
     * Access method for devices.
     *
     * @param aDevices the new value for devices
     */
    public void setDevices(final Set<DevicesTransport> aDevices) {
        devices = aDevices;
    }


    /**
     * Generates an ID for this Transport object.
     *
     * @return the generated ID.
     */
    public String toString() {
    	return (String) new XmlIdFieldHandler().getValue(this);
    }

    /**
     * Returns the generated ID for this Transport object.
     *
     * @param arg0 the context that the cycle was detected in.
     * @return the generated ID.
     */
    @Override
    public Object onCycleDetected(Context arg0) {
    	return this.toString();
    }
}
