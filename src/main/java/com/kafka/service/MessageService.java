package com.kafka.service;

import com.kafka.model.MessageDTO;

public interface MessageService {
	void sendMessage(MessageDTO messageDTO);
}
