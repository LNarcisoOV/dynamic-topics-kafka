package com.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import com.kafka.util.Constants;

@Configuration
public class TopicConfig {
	
	@Bean
	public NewTopic topic1() {
		return TopicBuilder
				.name(Constants.TOPIC_1_NAME)
				.partitions(1)
				.replicas(1)
				.build();
	}
	
	@Bean
	public NewTopic topic2() {
		return TopicBuilder
				.name(Constants.TOPIC_2_NAME)
				.partitions(2)
				.replicas(1)
				.build();
	}
	
	@Bean
	public NewTopic topic3() {
		return TopicBuilder
				.name(Constants.TOPIC_3_NAME)
				.partitions(3)
				.replicas(1)
				.build();
	}
}
