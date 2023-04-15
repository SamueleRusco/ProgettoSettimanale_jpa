package com.spring_progettoSettimanale.repository;

import java.util.List;	
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring_progettoSettimanale.model.Postazione;
import com.spring_progettoSettimanale.model.Utente;


@Repository//basta creare interface utenteRepository extendsCrudrepo.. e genera in automatico le queries
public interface PostazioneRepositoryDao extends CrudRepository<Postazione, Long> {
		
	
	public List<Postazione> findByDescrizione(String descrizione);
	
	
		
	//@Query(value="SELECT u FROM User u WHERE u.city IN ('Roma', 'Milano', 'Napoli')") 
	//public List<User> findByCityInR_M_N();
	//@Query(value = "SELECT u FROM User u WHERE u.age > :age")
	//	public List<User> findByAgeOverParams(Integer age);
	
}
