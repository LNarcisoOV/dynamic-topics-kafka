package com.kafka.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

@Configuration
public class KafkaProducerConfig {
	
	@Value("${spring.kafka.bootstrap-servers}")
	private String bootstrapServers;

	private Map<String, Object> producerConfig() {
		Map<String, Object> map = new HashMap<>();
		map.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
		map.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, String.class);
		map.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, String.class);
		
		return map;
	}
	
	@Bean
	private ProducerFactory<String, String> producerFactory() {
		return new DefaultKafkaProducerFactory<String, String>(producerConfig());
	}
	
	@Bean
	public KafkaTemplate<String, String> kafkaTemplate(ProducerFactory<String, String> producerFactory) {
		return new KafkaTemplate<>(producerFactory);
	}
}
