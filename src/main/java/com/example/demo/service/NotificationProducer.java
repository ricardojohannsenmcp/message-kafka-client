package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;

import com.example.demo.dto.NotificationDTO;


@Service
public class NotificationProducer {
	
    private static final Logger logger = LoggerFactory.getLogger(NotificationProducer.class);

	
	
	private final String topic;
	private final KafkaTemplate<String,NotificationDTO> kafkaTemplate;
	
	
	
	public NotificationProducer(@Value("${topic.name}")String topic, KafkaTemplate<String, NotificationDTO> kafkaTemplate) {
		
		this.topic = topic;
		this.kafkaTemplate = kafkaTemplate;
	}
	
	
	
	
	public void send(NotificationDTO notificationDTO) {
		
		ListenableFuture<SendResult<String, NotificationDTO>> send = kafkaTemplate.send(topic,  notificationDTO);
		
		send.addCallback( success -> logger.info("Messagem send" + success.getProducerRecord().value()),
                failure -> logger.info("Message failure" + failure.getMessage()));
		
	}
	
	
	

}
