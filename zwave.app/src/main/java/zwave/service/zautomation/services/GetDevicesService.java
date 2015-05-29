// Generated with g9.

package zwave.service.zautomation.services;

import java.io.StringReader;
import java.util.HashMap;

import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import me.zwave.vdev.DeviceList;

import org.eclipse.persistence.jaxb.JAXBContextFactory;
import org.eclipse.persistence.jaxb.JAXBContextProperties;

import static me.zwave.vdev.ZAutomationPayload.*;

@SuppressWarnings({ "unchecked", "cast" })
public class GetDevicesService extends ZAutomationService {

	public GetDevicesService () {
		super("me/zway/transport/rest-client-zautomation.properties", "ws.me.zway.transport.zAutomation.servletRootURI");
	}

	public DeviceList getDevices() {
		return converter.convert(getResponse().getData(), DeviceList.class);
	}

	private GetDevicesResponse getResponse() {
		webTarget = client.target(rootURI).path("/devices");
		String response = webTarget.request(MediaType.APPLICATION_JSON_TYPE).accept(MediaType.APPLICATION_JSON_TYPE).get(String.class);
		GetDevicesResponse unmarshalledResponse = null;
		HashMap<String, Object> jaxbContextProperties = new HashMap<String, Object>(3);
		jaxbContextProperties.put(JAXBContextProperties.MEDIA_TYPE, "application/json");
		jaxbContextProperties.put(JAXBContextProperties.JSON_INCLUDE_ROOT, false);
		jaxbContextProperties.put(JAXBContextProperties.JSON_WRAPPER_AS_ARRAY_NAME, true);
		try {
			JAXBContext jaxbContext = JAXBContextFactory.createContext(new Class[] { GetDevicesResponse.class }, jaxbContextProperties);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			response = response.replace("\":null", "\":\"null\"");
			unmarshalledResponse = (GetDevicesResponse) unmarshaller.unmarshal(new StreamSource(new StringReader(response.trim())), GetDevicesResponse.class).getValue();
		} catch (JAXBException e) {
			System.out.println("Unmarshalling of JSON failed! Exception:");
			e.printStackTrace();
		}
		return unmarshalledResponse;
	}
}
