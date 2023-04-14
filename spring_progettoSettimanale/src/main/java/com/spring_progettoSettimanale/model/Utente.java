package com.spring_progettoSettimanale.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="utenti")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Utente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String username;
	
	private String nomeUtente;
	
	private String cognome;
	
	private String email;
	
	@OneToMany(mappedBy="utente",cascade = CascadeType.ALL)
	private List<Prenotazione> prenotazione;
	
	
	public Utente(String username, String nomeUtente, String cognome, String email, List<Prenotazione> prenotazione) {
		super();
		this.username = username;
		this.nomeUtente = nomeUtente;
		this.cognome = cognome;
		this.email = email;
		this.prenotazione = prenotazione;
	}
	
	
}
