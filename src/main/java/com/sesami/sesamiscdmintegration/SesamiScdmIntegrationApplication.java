package com.sesami.sesamiscdmintegration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SesamiScdmIntegrationApplication {
	private static Logger logger = LoggerFactory.getLogger(SesamiScdmIntegrationApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SesamiScdmIntegrationApplication.class, args);
		
		logger.info("SesamiScdmIntegrationApplication called with {} to {}", "Integration", "CBD");
	}

}
