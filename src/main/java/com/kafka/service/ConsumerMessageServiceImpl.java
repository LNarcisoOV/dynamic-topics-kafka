package com.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static com.kafka.util.Constants.TOPIC_1_NAME;
import static com.kafka.util.Constants.TOPIC_2_NAME;
import static com.kafka.util.Constants.TOPIC_3_NAME;

@Service
public class ConsumerMessageServiceImpl {

	@KafkaListener(topics = {TOPIC_1_NAME, TOPIC_2_NAME, TOPIC_3_NAME}, groupId = "groupId")
	public void consume(String message) {
		System.out.println("------------------------------------------");
		System.out.println("Received Message from topics: " + message);
		System.out.println("------------------------------------------");
	}
}
