package com.jay.integration.springintegrations;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;

public class UpperCaseService {
	private static final Logger LOG = LoggerFactory.getLogger(UpperCaseService.class);
	
	public Message<?> toUpperCase(Message<String> message) {		
		LOG.info(message.getPayload().toUpperCase());
		return MessageBuilder.withPayload(message.getPayload().toUpperCase()).build();
	}
}
