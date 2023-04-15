package com.spring_progettoSettimanale.configuration;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.github.javafaker.Faker;
import com.spring_progettoSettimanale.model.Postazione;
import com.spring_progettoSettimanale.model.Prenotazione;
import com.spring_progettoSettimanale.model.Utente;
import com.spring_progettoSettimanale.model.Prenotazione;


@Configuration
@PropertySource("classpath:application.properties")
public class PrenotazioneConfiguration {

	/*@Value("${user.admin.name}")private String adminName;
	@Value("${user.admin.lastname}")private String adminLastname;
	@Value("${user.admin.email}")private String adminEmail;
	@Value("${user.admin.age}")private Integer adminAge;
	@Value("${user.admin.city}")private String adminCity;
	@Value("${user.admin.password}")private String password;
	
	
	@Bean("AdminUser")
	@Scope("singleton")
	public Utente adminUser() {
		return new Utente();
	}*/
	
	
	@Bean("CustomPrenotazione")
	@Scope("prototype")
	public Prenotazione customUser() {
		return new Prenotazione();
	}
	
	@Bean("ParamsPrenotazione")
	@Scope("prototype")
	public Prenotazione paramsPrenotazione(LocalDate data, Utente utente, List<Postazione> postazione) {
		
		return new Prenotazione();
	}
	
	/*@Bean("FakeUser")
	@Scope("prototype")
	public Prenotazione fakePrenotazione() {
		Faker fake = new Faker (new Locale("it-IT"));
		
		Prenotazione p = new Prenotazione();
		p.setData(fake.date().between(LocalDate.now(), LocalDate.of(2023, 12, 31)));
		
		
		return u;
	}*/
	
	
}
