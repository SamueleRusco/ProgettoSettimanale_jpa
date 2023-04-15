package com.spring_progettoSettimanale.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.spring_progettoSettimanale.service.PrenotazioneService;


@Component
public class PrenotazioneRunner implements ApplicationRunner {
	
	@Autowired PrenotazioneService PrenotazioneService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Run Prenotazione...");		
	}

}