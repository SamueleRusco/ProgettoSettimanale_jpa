package com.spring_progettoSettimanale.configuration;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.github.javafaker.Faker;
import com.spring_progettoSettimanale.model.Prenotazione;
import com.spring_progettoSettimanale.model.Utente;


@Configuration
@PropertySource("classpath:application.properties")
public class EdificioConfiguration {

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
	
	
	@Bean("CustomUser")
	@Scope("prototype")
	public Utente customUser() {
		return new Utente();
	}
	
	@Bean("ParamsUser")
	@Scope("prototype")
	public Utente paramsUser(Long id, String username, String nomeUtente, String cognome, String email, Prenotazione prenotazione ) {
		
		return new Utente();
	}
	
	@Bean("FakeUser")
	@Scope("prototype")
	public Utente fakeUser() {
		Faker fake = new Faker (new Locale("it-IT"));
		
		Utente u = new Utente();
		u.setUsername(fake.name().firstName() + fake.number().numberBetween(0, 100));
		u.setNomeUtente(fake.name().firstName());
		u.setCognome(fake.name().lastName());
		u.setEmail(u.getNomeUtente() + "." + u.getCognome() + "@example.com");
		return u;
	}
	
	
}
