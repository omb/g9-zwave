// Generated with g9.

package zwave.service.zautomation;

import me.zwave.vdev.Device;
import me.zwave.vdev.DeviceList;
import me.zwave.vdev.ZAutomation;

import no.g9.support.ws.AbstractWSClient;

import zwave.service.zautomation.services.*;

/**
 * A Web Service client implemententation of the interface {@link ZAutomation}.
 *
 * <p/>All invocations are converted to/from domain objects and then delegated to a <code>WebServiceTemplate</code>.
 *
 * @see ZAutomation
 * This file will be overwritten the next time it is generated from g9.
 */
@SuppressWarnings({ "cast" })
public class ZAutomationRestClient extends AbstractWSClient implements ZAutomation {

    @Override
    public DeviceList getDevices() {
    	return new GetDevicesService().getDevices();
    }

    @Override
    public DeviceList getChangedDevices(int since) {
    	return new GetChangedDevicesService().getChangedDevices(since);
    }

    @Override
    public Device getDevice(String deviceId) {
    	return new GetDeviceService().getDevice(deviceId);
    }

    @Override
    public void sendCommand(String deviceId, String command) {
    	new SendCommandService().sendCommand(deviceId, command);
    }

    @Override
    public void setExactLevel(String deviceId, int level) {
    	new SetExactLevelService().setExactLevel(deviceId, level);
    }
    @Override
    protected String getServiceRequestName() {
        return "zAutomation";
    }

}
