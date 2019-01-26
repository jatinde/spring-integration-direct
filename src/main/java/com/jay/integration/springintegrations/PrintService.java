package com.jay.integration.springintegrations;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;

public class PrintService {
	private static final Logger LOG = LoggerFactory.getLogger(PrintService.class);
	
	public void compute(Message<String> message) {
		
		LOG.info(message.getPayload());
	}
}
