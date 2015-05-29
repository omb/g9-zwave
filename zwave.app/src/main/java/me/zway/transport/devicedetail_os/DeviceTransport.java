// Generated with g9.

package me.zway.transport.devicedetail_os;

import com.sun.xml.bind.CycleRecoverable;

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
public class DeviceTransport implements CycleRecoverable {
    @XmlElement
    private String id;
    @XmlElement
    private String deviceType;
    @XmlElement
    private int updateTime;
    @XmlElement
    private MetricsTransport metrics;

    /** Default constructor. */
    public DeviceTransport() {
        super();
    }

    /**
     * Access method for id.
     *
     * @return the current value of id
     */
    public String getId() {
        return id;
    }

    /**
     * Access method for id.
     *
     * @param aId the new value for id
     */
    public void setId(final String aId) {
        id = aId;
    }

    /**
     * Access method for deviceType.
     *
     * @return the current value of deviceType
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * Access method for deviceType.
     *
     * @param aDeviceType the new value for deviceType
     */
    public void setDeviceType(final String aDeviceType) {
        deviceType = aDeviceType;
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
     * Access method for metrics.
     *
     * @return the current value of metrics
     */
    public MetricsTransport getMetrics() {
        return metrics;
    }

    /**
     * Access method for metrics.
     *
     * @param aMetrics the new value for metrics
     */
    public void setMetrics(final MetricsTransport aMetrics) {
        metrics = aMetrics;
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
