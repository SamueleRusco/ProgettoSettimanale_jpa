package com.spring_progettoSettimanale.service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring_progettoSettimanale.model.Utente;

import com.spring_progettoSettimanale.repository.UtenteRepositoryDao;

@Service
public class PostazioneService {
	@Autowired private UtenteRepositoryDao repo;

	@Autowired @Qualifier("FakeUser") private ObjectProvider<Utente> fakeUserProvider; 
	

	public void createFakeUser() { 
		insertUser(fakeUserProvider.getObject());
	}
	
	
	
	// JDBC method
	
	public void insertUser(Utente u) {
		repo.save(u);
		System.out.println("ho salvato");
	}
	
	public Utente findUserByID(Long id) {
		return repo.findById(id).get();
	}
	
	public List<Utente> findAllUser() {
		return (List<Utente>) repo.findAll();
	}
	
	public void removeUser(Utente u) {
		repo.delete(u);
		//repo.deleteById(u.getId());
	}
	
	public void updateUser(Utente u) {
		repo.save(u);
	}
	
	
	
	
}
