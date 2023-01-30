package com.powergreen.powergreen.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_planos")
public class PlanosModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O Atributo Nome é Obrigatório")
	@Size(min=5, max=50, message = "O Nome deve ter entre 5 à 50 caracteres")
	private String nome;
	
		
}
