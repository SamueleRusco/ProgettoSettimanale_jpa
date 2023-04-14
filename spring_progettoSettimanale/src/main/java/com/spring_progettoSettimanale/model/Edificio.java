package com.spring_progettoSettimanale.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="edifici")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Edificio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	private String nomeEdificio;
	
	private String address;
	
	private String city;
	
	@OneToMany(mappedBy = "edificio")
	private List<Postazione> postazione;
	
}

