package com.kafka.service;

import com.kafka.model.MessageDTO;

public interface ProducerMessageService {
	void sendMessage(MessageDTO messageDTO);
}
