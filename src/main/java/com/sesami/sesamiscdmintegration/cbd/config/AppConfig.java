package com.sesami.sesamiscdmintegration.cbd.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

    
    @Bean
    public RestTemplate restTemplate() throws Exception {
      
		System.setProperty("javax.net.ssl.trustStore", "src/main/resources/TGHQGUN.jks");
		System.setProperty("javax.net.ssl.trustStorePassword", "gunnebo");
		System.setProperty("javax.net.ssl.keyStore", "src/main/resources/TGHQGUN.jks");
		System.setProperty("javax.net.ssl.keyStorePassword", "gunnebo");
    	
//		System.setProperty("javax.net.ssl.trustStore","./TGHQGUN.jks");
//		System.setProperty("javax.net.ssl.trustStorePassword", "gunnebo");
//		System.setProperty("javax.net.ssl.keyStore", "./TGHQGUN.jks");
//		System.setProperty("javax.net.ssl.keyStorePassword", "gunnebo");
//		
        return new RestTemplate();
    }
}
