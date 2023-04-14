package com.spring_progettoSettimanale.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="postazioni")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Postazione{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String descrizione;
	
	@Enumerated(EnumType.STRING)
	private PostazioneEnum tipo;
	
	private Integer numeroPosti;
	
	
	

	@ManyToOne
	@JoinColumn(name = "postazione_edificio")
	private Edificio edificio;
	
	@ManyToMany(mappedBy="postazione")
	private List<Prenotazione> prenotazione;
	
	
}

