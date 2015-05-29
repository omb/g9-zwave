// Generated with g9.

package me.zwave.vdev;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Web service request- and response-wrappers for interface <code>ZAutomation</code>.
 * This file will be overwritten the next time it is generated from g9.
 */
public class ZAutomationPayload {

    /**
     * A wrapper transport class for the return value of method getDevices.
     */
    @XmlRootElement
    @XmlAccessorType(XmlAccessType.NONE)
    public static class GetDevicesResponse {
        @XmlElement
        private List<me.zway.transport.devices_os.DeviceListTransport> data;
    	/**
    	 * Gets the response.
    	 *
    	 * @return the response
    	 */
    	public List<me.zway.transport.devices_os.DeviceListTransport> getData() {
    	    return this.data;
    	}

    	/**
    	 * Sets the response.
    	 *
    	 * @param response the new response
    	 */
    	public void setData(List<me.zway.transport.devices_os.DeviceListTransport> response) {
    	    this.data = response;
    	}
    }

    /**
     * A wrapper transport class for arguments of method getDevices.
     */
    @XmlRootElement
    @XmlAccessorType(XmlAccessType.NONE)
    public static class GetDevicesRequest {
        // a wrapper for a method with no parameters
    }

    /**
     * A wrapper transport class for the return value of method getChangedDevices.
     */
    @XmlRootElement
    @XmlAccessorType(XmlAccessType.NONE)
    public static class GetChangedDevicesResponse {
        @XmlElement
        private me.zway.transport.devices_os.DeviceListTransport data;
    	/**
    	 * Gets the response.
    	 *
    	 * @return the response
    	 */
    	public me.zway.transport.devices_os.DeviceListTransport getData() {
    	    return this.data;
    	}

    	/**
    	 * Sets the response.
    	 *
    	 * @param response the new response
    	 */
    	public void setData(me.zway.transport.devices_os.DeviceListTransport response) {
    	    this.data = response;
    	}
    }

    /**
     * A wrapper transport class for arguments of method getChangedDevices.
     */
    @XmlRootElement
    @XmlAccessorType(XmlAccessType.NONE)
    public static class GetChangedDevicesRequest {
    	@XmlElement private int since;
    	/**
     	* Gets the since.
     	*
     	* @return the since
     	*/
    	public int getSince() {
        	return since;
    	}

    	/**
     	* Sets the since.
     	*
     	* @param since the new since
     	*/
    	public void setSince(int since) {
        	this.since = since;
    	}
    }

    /**
     * A wrapper transport class for the return value of method getDevice.
     */
    @XmlRootElement
    @XmlAccessorType(XmlAccessType.NONE)
    public static class GetDeviceResponse {
        @XmlElement
        private me.zway.transport.devicedetail_os.DeviceTransport data;
    	/**
    	 * Gets the response.
    	 *
    	 * @return the response
    	 */
    	public me.zway.transport.devicedetail_os.DeviceTransport getData() {
    	    return this.data;
    	}

    	/**
    	 * Sets the response.
    	 *
    	 * @param response the new response
    	 */
    	public void setData(me.zway.transport.devicedetail_os.DeviceTransport response) {
    	    this.data = response;
    	}
    }

    /**
     * A wrapper transport class for arguments of method getDevice.
     */
    @XmlRootElement
    @XmlAccessorType(XmlAccessType.NONE)
    public static class GetDeviceRequest {
    	@XmlElement private String deviceId;
    	/**
     	* Gets the deviceId.
     	*
     	* @return the deviceId
     	*/
    	public String getDeviceId() {
        	return deviceId;
    	}

    	/**
     	* Sets the deviceId.
     	*
     	* @param deviceId the new deviceId
     	*/
    	public void setDeviceId(String deviceId) {
        	this.deviceId = deviceId;
    	}
    }

    /**
     * A wrapper transport class for the return value of method sendCommand.
     */
    @XmlRootElement
    @XmlAccessorType(XmlAccessType.NONE)
    public static class SendCommandResponse {
        // a wrapper for a void method
    }

    /**
     * A wrapper transport class for arguments of method sendCommand.
     */
    @XmlRootElement
    @XmlAccessorType(XmlAccessType.NONE)
    public static class SendCommandRequest {
    	@XmlElement private String deviceId;	@XmlElement private String command;
    	/**
     	* Gets the deviceId.
     	*
     	* @return the deviceId
     	*/
    	public String getDeviceId() {
        	return deviceId;
    	}

    	/**
     	* Sets the deviceId.
     	*
     	* @param deviceId the new deviceId
     	*/
    	public void setDeviceId(String deviceId) {
        	this.deviceId = deviceId;
    	}
    	/**
     	* Gets the command.
     	*
     	* @return the command
     	*/
    	public String getCommand() {
        	return command;
    	}

    	/**
     	* Sets the command.
     	*
     	* @param command the new command
     	*/
    	public void setCommand(String command) {
        	this.command = command;
    	}
    }

    /**
     * A wrapper transport class for the return value of method setExactLevel.
     */
    @XmlRootElement
    @XmlAccessorType(XmlAccessType.NONE)
    public static class SetExactLevelResponse {
        // a wrapper for a void method
    }

    /**
     * A wrapper transport class for arguments of method setExactLevel.
     */
    @XmlRootElement
    @XmlAccessorType(XmlAccessType.NONE)
    public static class SetExactLevelRequest {
    	@XmlElement private String deviceId;	@XmlElement private int level;
    	/**
     	* Gets the deviceId.
     	*
     	* @return the deviceId
     	*/
    	public String getDeviceId() {
        	return deviceId;
    	}

    	/**
     	* Sets the deviceId.
     	*
     	* @param deviceId the new deviceId
     	*/
    	public void setDeviceId(String deviceId) {
        	this.deviceId = deviceId;
    	}
    	/**
     	* Gets the level.
     	*
     	* @return the level
     	*/
    	public int getLevel() {
        	return level;
    	}

    	/**
     	* Sets the level.
     	*
     	* @param level the new level
     	*/
    	public void setLevel(int level) {
        	this.level = level;
    	}
    }

}
