package com.spring_progettoSettimanale.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import com.spring_progettoSettimanale.model.Utente;


import com.spring_progettoSettimanale.service.EdificioService;

@Component
public class EdificioRunner implements ApplicationRunner {
	
	@Autowired EdificioService EdificioService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Run...");
		
		
		//Utente u1 = new Utente("samuele123", "samuele", "rusco", "samuele@gmail.com", null);
		//utenteService.insertUser(u1);
		
		//userService.findAllUser().forEach(u -> System.out.println(u));
		//User u = userService.findUserByID(3l);
		//System.out.println(u);
		//u.setCity("Milano");
		//userService.updateUser(u);
		//userService.removeUser(u);
		//userService.findAgeOver(50).forEach(e -> System.out.println(e));
		//userService.findCityIn().forEach(e -> System.out.println(e));
	}

}