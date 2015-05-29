// Generated with g9.

package zwave.service.zautomation.services;

import java.io.StringReader;
import java.util.HashMap;

import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import me.zwave.vdev.Device;

import org.eclipse.persistence.jaxb.JAXBContextFactory;
import org.eclipse.persistence.jaxb.JAXBContextProperties;

import static me.zwave.vdev.ZAutomationPayload.*;

@SuppressWarnings({ "unchecked", "cast" })
public class GetDeviceService extends ZAutomationService {

	public GetDeviceService () {
		super("me/zway/transport/rest-client-zautomation.properties", "ws.me.zway.transport.zAutomation.servletRootURI");
	}

	public Device getDevice(String deviceId) {
		return converter.convert(getResponse(deviceId).getData(), Device.class);
	}

	private GetDeviceResponse getResponse(String deviceId) {
		webTarget = client.target(rootURI).path("/devices/" + deviceId.replace(" ", "%20"));
		String response = webTarget.request(MediaType.APPLICATION_JSON_TYPE).accept(MediaType.APPLICATION_JSON_TYPE).get(String.class);
		GetDeviceResponse unmarshalledResponse = null;
		HashMap<String, Object> jaxbContextProperties = new HashMap<String, Object>(3);
		jaxbContextProperties.put(JAXBContextProperties.MEDIA_TYPE, "application/json");
		jaxbContextProperties.put(JAXBContextProperties.JSON_INCLUDE_ROOT, false);
		jaxbContextProperties.put(JAXBContextProperties.JSON_WRAPPER_AS_ARRAY_NAME, true);
		try {
			JAXBContext jaxbContext = JAXBContextFactory.createContext(new Class[] { GetDeviceResponse.class }, jaxbContextProperties);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			response = response.replace("\":null", "\":\"null\"");
			unmarshalledResponse = (GetDeviceResponse) unmarshaller.unmarshal(new StreamSource(new StringReader(response.trim())), GetDeviceResponse.class).getValue();
		} catch (JAXBException e) {
			System.out.println("Unmarshalling of JSON failed! Exception:");
			e.printStackTrace();
		}
		return unmarshalledResponse;
	}
}
