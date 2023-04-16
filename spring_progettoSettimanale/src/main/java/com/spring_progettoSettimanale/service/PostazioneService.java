package com.spring_progettoSettimanale.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.spring_progettoSettimanale.model.Postazione;
import com.spring_progettoSettimanale.repository.PostazioneRepositoryDao;


@Service
public class PostazioneService {
	@Autowired private PostazioneRepositoryDao repo;


	

	
	
	
	
	// JDBC method
	
	public void insertPostazione(Postazione u) {
		repo.save(u);
		System.out.println("ho salvato");
	}
	
	public Postazione findPostazioneByID(Long id) {
		return repo.findById(id).get();
	}
	
	public List<Postazione> findAllPostazioni() {
		return (List<Postazione>) repo.findAll();
	}
	
	public void removePostazione(Postazione u) {
		repo.delete(u);
		//repo.deleteById(u.getId());
	}
	
	public void updatePostazione(Postazione u) {
		repo.save(u);
	}
	
	
	
	
}
