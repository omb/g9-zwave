// Generated with g9.

package zwave.service.zautomation.services;

import java.util.Properties;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

import no.g9.support.transport.DomainTransportConversionService;

import org.glassfish.jersey.client.JerseyClientBuilder;
import org.glassfish.jersey.moxy.json.MoxyJsonFeature;
import org.glassfish.jersey.moxy.xml.MoxyXmlFeature;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import zwave.service.AppCtx;

public class ZAutomationService {

	protected DomainTransportConversionService converter;
	protected ApplicationContext applicationContext;
	protected AppCtx appCtx;
	protected Client client;
	protected String rootURI;
	protected WebTarget webTarget;

	public ZAutomationService (String propertiesPath, String rootURIpkg) {
		if (AppCtx.getApplicationContext() == null) {
			applicationContext = new ClassPathXmlApplicationContext("me/zway/transport/rest-clients.xml");
			appCtx = new AppCtx();
			appCtx.setApplicationContext(applicationContext);
		}
		getRootURI(propertiesPath, rootURIpkg);
		converter = (DomainTransportConversionService) AppCtx.getApplicationContext().getBean("me.zway.transport.domainTransportConversionService");
		client = new JerseyClientBuilder().build();
		client.register(MoxyJsonFeature.class);
		client.register(MoxyXmlFeature.class);
	}

	private void getRootURI(String propertiesPath, String rootURIpkg) {
		Properties properties = new Properties();
		try {
			properties.load(getClass().getClassLoader().getResourceAsStream(propertiesPath));
			rootURI = properties.getProperty(rootURIpkg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
