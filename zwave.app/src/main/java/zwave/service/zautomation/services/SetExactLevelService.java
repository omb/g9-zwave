// Generated with g9.

package zwave.service.zautomation.services;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static me.zwave.vdev.ZAutomationPayload.*;

@SuppressWarnings({ "unchecked", "cast" })
public class SetExactLevelService extends ZAutomationService {

	public SetExactLevelService () {
		super("me/zway/transport/rest-client-zautomation.properties", "ws.me.zway.transport.zAutomation.servletRootURI");
	}

	public void setExactLevel(String deviceId, int level) {
		getResponse(deviceId, level);
	}

	private Response getResponse(String deviceId, int level) {
		webTarget = client.target(rootURI).path("/devices/" + deviceId.replace(" ", "%20") + "/command/exact");
		return webTarget.queryParam("level", level).request(MediaType.APPLICATION_JSON_TYPE).accept(MediaType.APPLICATION_JSON_TYPE).get(Response.class);
	}
}
