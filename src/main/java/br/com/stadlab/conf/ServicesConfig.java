package br.com.stadlab.conf;

import org.glassfish.jersey.server.ResourceConfig;

public class ServicesConfig extends ResourceConfig{
	
	public ServicesConfig() {
		packages("br.com.stadlab.service");
	}
	
}
