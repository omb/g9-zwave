// Generated with g9.

package me.zwave.vdev.generated;

import java.util.LinkedHashMap;
import java.util.Map;

import me.zwave.vdev.DeviceMetrics;

/**
 * This file will be overwritten the next time it is generated from g9.
 */
@SuppressWarnings("all")
public abstract class DeviceDefault {

    /** Primary key. */
    protected static final String PK = "id";

    private String id;
    private String deviceType;
    private int updateTime;
    private DeviceMetrics metrics;

    /** Default constructor. */
    protected DeviceDefault() {
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
     * Setter method for id.
     *
     * @param aId the new value for id
     */
    public void setId(String aId) {
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
     * Setter method for deviceType.
     *
     * @param aDeviceType the new value for deviceType
     */
    public void setDeviceType(String aDeviceType) {
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
     * Setter method for updateTime.
     *
     * @param aUpdateTime the new value for updateTime
     */
    public void setUpdateTime(int aUpdateTime) {
        updateTime = aUpdateTime;
    }

    /**
     * Access method for metrics.
     *
     * @return the current value of metrics
     */
    public DeviceMetrics getMetrics() {
        return metrics;
    }

    /**
     * Setter method for metrics.
     *
     * @param aMetrics the new value for metrics
     */
    public void setMetrics(DeviceMetrics aMetrics) {
        metrics = aMetrics;
    }

    /**
     * Compares the key for this instance with another Device.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Device and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof DeviceDefault)) {
            return false;
        }
        DeviceDefault that = (DeviceDefault) other;
        Object myId = this.getId();
        Object yourId = that.getId();
        if (myId==null ? yourId!=null : !myId.equals(yourId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Device.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof DeviceDefault)) return false;
        return this.equalKeys(other) && ((DeviceDefault)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        if (getId() == null) {
            i = 0;
        } else {
            i = getId().hashCode();
        }
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Device |");
        sb.append(" id=").append(getId());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("id", getId());
        return ret;
    }

}
