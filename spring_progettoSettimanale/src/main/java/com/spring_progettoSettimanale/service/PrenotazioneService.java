package com.spring_progettoSettimanale.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.spring_progettoSettimanale.model.Prenotazione;
import com.spring_progettoSettimanale.repository.PrenotazioneRepositoryDao;


@Service
public class PrenotazioneService {
	@Autowired private PrenotazioneRepositoryDao repo;

	
	


	
	
	
	// JDBC method
	
	public void insertPrenotazione(Prenotazione e) {
		repo.save(e);
		System.out.println("ho salvato");
	}
	
	public Prenotazione findPrenotazoneByID(Long id) {
		return repo.findById(id).get();
	}
	
	public List<Prenotazione> findAllPrenotazioni() {
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
