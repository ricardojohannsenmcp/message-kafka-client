package com.example.demo.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.NotificationDTO;
import com.example.demo.dto.PlayerDTO;
import com.example.demo.service.NotificationProducer;

@RestController
@RequestMapping("/task")
public class TaskController {
	
	
	
	@Autowired
	private NotificationProducer notificationProducer;
	
	
	@PostMapping
	public ResponseEntity<?> create(){
		
		NotificationDTO notificationDTO = new NotificationDTO();
		notificationDTO.setHeading("Novo Documento");
		notificationDTO.setConteudo("Você possui um novo atestado para analisar");
		notificationDTO.setFeatureId(131L);
		notificationDTO.setStackKey("documentos");
		notificationDTO.setPlayers(Arrays.asList(new PlayerDTO("02404459376")));
		notificationProducer.send(notificationDTO);
		return ResponseEntity.ok().build();
	}
	
	

}
