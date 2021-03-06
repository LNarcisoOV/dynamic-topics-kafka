package com.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.model.MessageDTO;
import com.kafka.service.ProducerMessageService;

@RestController
@RequestMapping("/message")
public class MessageController {
	
	@Autowired
	private ProducerMessageService messageService;

	@PostMapping("/")
	public void sendMessage(@RequestBody MessageDTO messageDTO) {
		messageService.sendMessage(messageDTO);
	}
	
	@PostMapping("/partition")
	public void sendMessageToSpecificPartition(@RequestBody MessageDTO messageDTO) {
		messageService.sendMessageToSpecificPartition(messageDTO);
	}
	
	@PostMapping("/key")
	public void sendMessageWithKey(@RequestBody MessageDTO messageDTO) {
		messageService.sendMessageWithKey(messageDTO);
	}
}
