package com.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.kafka.model.MessageDTO;

@Service
public class MessageServiceImpl implements MessageService {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public void sendMessage(MessageDTO messageDTO) {
		try {
			kafkaTemplate.send(messageDTO.getName(), messageDTO.getBody());
		} catch (RuntimeException re) {
			throw new RuntimeException(re);
		}
	}

}
