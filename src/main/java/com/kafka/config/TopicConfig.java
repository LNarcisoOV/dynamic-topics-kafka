package com.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class TopicConfig {
	
	@Bean
	public NewTopic topic1() {
		return TopicBuilder
				.name("topic-1")
				.partitions(1)
				.replicas(1)
				.build();
	}
	
	@Bean
	public NewTopic topic2() {
		return TopicBuilder
				.name("topic-2")
				.partitions(2)
				.replicas(1)
				.build();
	}
	
	@Bean
	public NewTopic topic3() {
		return TopicBuilder
				.name("topic-3")
				.partitions(3)
				.replicas(1)
				.build();
	}
}
