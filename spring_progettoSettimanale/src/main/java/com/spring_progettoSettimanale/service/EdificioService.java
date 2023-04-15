package com.spring_progettoSettimanale.service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring_progettoSettimanale.model.Edificio;
import com.spring_progettoSettimanale.model.Edificio;

import com.spring_progettoSettimanale.repository.EdificioRepositoryDao;

@Service
public class EdificioService {
	@Autowired private EdificioRepositoryDao repo;

	
	

	
	
	
	
	// JDBC method
	
	public void insertUser(Edificio e) {
		repo.save(e);
		System.out.println("ho salvato");
	}
	
	public Edificio findUserByID(Long id) {
		return repo.findById(id).get();
	}
	
	public List<Edificio> findAllLocation() {
		return (List<Edificio>) repo.findAll();
	}
	
	public void removeUser(Edificio e) {
		repo.delete(e);
		//repo.deleteById(u.getId());
	}
	
	public void updateUser(Edificio e) {
		repo.save(e);
	}
	
	
	
	
}
