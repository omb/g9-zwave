// Generated with g9.

package zwave.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class AppCtx implements ApplicationContextAware {

	private static ApplicationContext applicationContext;

	public AppCtx() {}

	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		AppCtx.applicationContext = ctx;
	}
}
