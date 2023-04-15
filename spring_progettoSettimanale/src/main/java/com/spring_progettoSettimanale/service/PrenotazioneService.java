package com.spring_progettoSettimanale.service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring_progettoSettimanale.model.Prenotazione;
import com.spring_progettoSettimanale.repository.PrenotazioneRepositoryDao;
import com.spring_progettoSettimanale.repository.UtenteRepositoryDao;

@Service
public class PrenotazioneService {
	@Autowired private PrenotazioneRepositoryDao repo;

	
	


	
	
	
	// JDBC method
	
	public void insertUser(Prenotazione e) {
		repo.save(e);
		System.out.println("ho salvato");
	}
	
	public Prenotazione findUserByID(Long id) {
		return repo.findById(id).get();
	}
	
	public List<Prenotazione> findAllUser() {
		return (List<Prenotazione>) repo.findAll();
	}
	
	public void removeUser(Prenotazione e) {
		repo.delete(e);
		//repo.deleteById(u.getId());
	}
	
	public void updateUser(Prenotazione e) {
		repo.save(e);
	}
	
	
	
	
}
