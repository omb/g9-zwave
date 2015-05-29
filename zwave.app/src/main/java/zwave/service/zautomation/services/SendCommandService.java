// Generated with g9.

package zwave.service.zautomation.services;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static me.zwave.vdev.ZAutomationPayload.*;

@SuppressWarnings({ "unchecked", "cast" })
public class SendCommandService extends ZAutomationService {

	public SendCommandService () {
		super("me/zway/transport/rest-client-zautomation.properties", "ws.me.zway.transport.zAutomation.servletRootURI");
	}

	public void sendCommand(String deviceId, String command) {
		getResponse(deviceId, command);
	}

	private Response getResponse(String deviceId, String command) {
		webTarget = client.target(rootURI).path("/devices/" + deviceId.replace(" ", "%20") + "/command/" + command.replace(" ", "%20"));
		return webTarget.request(MediaType.APPLICATION_JSON_TYPE).accept(MediaType.APPLICATION_JSON_TYPE).get(Response.class);
	}
}
