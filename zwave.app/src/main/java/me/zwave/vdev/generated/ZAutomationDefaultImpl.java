// Generated with g9.

package me.zwave.vdev.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

import me.zwave.vdev.Device;
import me.zwave.vdev.DeviceList;
import me.zwave.vdev.ZAutomation;

import no.g9.support.Registry;

import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

public class ZAutomationDefaultImpl implements ZAutomation {


	@JsonIgnoreProperties(ignoreUnknown = true)
	static class GetDevicesDataWrapper {
		GetDevicesDataWrapper() {
		}

		DeviceList data;

		public void setData(DeviceList data) {
			this.data= data;
		}
	}


	@Override
	public DeviceList getDevices() {
		RestTemplate rt= getRestTemplate();
		String serviceUrl= Registry.getRegistry().getG9Property("me.zwave.vdev.zautomation.url");
		GetDevicesDataWrapper retval = rt.getForObject(serviceUrl+"ZAutomation/api/v1/devices", GetDevicesDataWrapper.class);
		return retval.data;
	}


	@JsonIgnoreProperties(ignoreUnknown = true)
	static class GetChangedDevicesDataWrapper {
		GetChangedDevicesDataWrapper() {
		}

		DeviceList data;

		public void setData(DeviceList data) {
			this.data= data;
		}
	}


	@Override
	public DeviceList getChangedDevices(int since) {
		RestTemplate rt= getRestTemplate();
		String serviceUrl= Registry.getRegistry().getG9Property("me.zwave.vdev.zautomation.url");
		GetChangedDevicesDataWrapper retval = rt.getForObject(serviceUrl+"ZAutomation/api/v1/devices?since={since}", GetChangedDevicesDataWrapper.class,  since);
		return retval.data;
	}


	@JsonIgnoreProperties(ignoreUnknown = true)
	static class GetDeviceDataWrapper {
		GetDeviceDataWrapper() {
		}

		Device data;

		public void setData(Device data) {
			this.data= data;
		}
	}


	@Override
	public Device getDevice(String deviceId) {
		RestTemplate rt= getRestTemplate();
		String serviceUrl= Registry.getRegistry().getG9Property("me.zwave.vdev.zautomation.url");
		GetDeviceDataWrapper retval = rt.getForObject(serviceUrl+"ZAutomation/api/v1/devices/{deviceId}", GetDeviceDataWrapper.class,  deviceId);
		return retval.data;
	}



	@Override
	public void sendCommand(String deviceId, String command) {
		RestTemplate rt= getRestTemplate();
		String serviceUrl= Registry.getRegistry().getG9Property("me.zwave.vdev.zautomation.url");
		rt.getForObject(serviceUrl+"ZAutomation/api/v1/devices/{deviceId}/command/{command}", Object.class,  deviceId,  command);
	}



	@Override
	public void setExactLevel(String deviceId, int level) {
		RestTemplate rt= getRestTemplate();
		String serviceUrl= Registry.getRegistry().getG9Property("me.zwave.vdev.zautomation.url");
		rt.getForObject(serviceUrl+"ZAutomation/api/v1/devices/{deviceId}/command/exact?level={level}", Object.class,  deviceId,  level);
	}

	private RestTemplate getRestTemplate() {
		ObjectMapper lax = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		MappingJackson2HttpMessageConverter c = new MappingJackson2HttpMessageConverter();
		c.setObjectMapper(lax);

		List<HttpMessageConverter<?>> list = new ArrayList<HttpMessageConverter<?>>();
		list.add(c);

		RestTemplate rest = new RestTemplate();
		rest.setMessageConverters(list);
		return rest;
	}

}
