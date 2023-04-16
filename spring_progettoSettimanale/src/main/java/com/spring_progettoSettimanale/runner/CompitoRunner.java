package com.spring_progettoSettimanale.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import com.spring_progettoSettimanale.model.Utente;


import com.spring_progettoSettimanale.service.EdificioService;
import com.spring_progettoSettimanale.service.PostazioneService;
import com.spring_progettoSettimanale.service.PrenotazioneService;
import com.spring_progettoSettimanale.service.UtenteService;

@Component
public class CompitoRunner implements ApplicationRunner {
	
	@Autowired EdificioService EdificioService;
    @Autowired UtenteService utenteService;
	@Autowired PostazioneService postazioneService;
	@Autowired PrenotazioneService PrenotazioneService;
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Run Compito...");
		
		
		
	
	}

}