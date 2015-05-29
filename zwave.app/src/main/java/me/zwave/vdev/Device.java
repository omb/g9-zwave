// Generated with g9.

package me.zwave.vdev;

import me.zwave.vdev.generated.DeviceDefault;

/**
 */
public class Device extends DeviceDefault {

    /** Default constructor. */
    public Device() {
        super();
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Device |");
        sb.append(" id=").append(getId());
        sb.append(" type=").append(getDeviceType());
        sb.append("]");
        return sb.toString();
    }

}
