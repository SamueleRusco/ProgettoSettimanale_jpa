package com.spring_progettoSettimanale.repository;

import java.util.List;	
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring_progettoSettimanale.model.Edificio;
import com.spring_progettoSettimanale.model.Utente;


@Repository//basta creare interface utenteRepository extendsCrudrepo.. e genera in automatico le queries
public interface EdificioRepositoryDao extends CrudRepository<Edificio, Long> {
		
	
	public List<Edificio> findByCity(String City);
	public List<Edificio> findByNomeEdificio(String nomeEdificio );
	
		

	
}
