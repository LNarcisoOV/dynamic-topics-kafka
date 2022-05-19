package com.kafka.service;

import static com.kafka.util.Constants.PARTITION_0;
import static com.kafka.util.Constants.TOPIC_1_NAME;
import static com.kafka.util.Constants.TOPIC_2_NAME;
import static com.kafka.util.Constants.TOPIC_3_NAME;
import static com.kafka.util.Constants.TOPIC_4_NAME;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Service;

@Service
public class ConsumerMessageServiceImpl {

	@KafkaListener(topics = { TOPIC_1_NAME, TOPIC_2_NAME, TOPIC_3_NAME }, groupId = "groupId")
	public void consume(String message) {
		System.out.println("------------------------------------------");
		System.out.println("Received Message from topics: " + message);
		System.out.println("------------------------------------------");
	}

	@KafkaListener(topicPartitions = @TopicPartition(topic = TOPIC_4_NAME, partitions = {PARTITION_0}), groupId = "groupId")
	public void consumeWithKey(String message, @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) String key) {
		System.out.println("------------------------------------------");
		System.out.println("Received Message from topics: " + message);
		System.out.println("Received key: " + key);
		System.out.println("------------------------------------------");
	}
}
