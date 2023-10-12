package com.Grupo3.API.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "telefoneid", scope = Telefone.class)
@Entity
@Table(name = "telefone")
public class Telefone {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "telefoneid")
	private Integer telefoneId;

	@Column(name = "telefoneinstrutorid")
	private Integer telefoneInstrutorId;

	@Column(name = "numero")
	private Double numero;

	@OneToOne(mappedBy = "telefone")
	private Instrutor instrutor;

	public Integer getTelefoneId() {
		return telefoneId;
	}

	public void setTelefoneId(Integer telefoneId) {
		this.telefoneId = telefoneId;
	}

	public Integer getTelefoneInstrutorId() {
		return telefoneInstrutorId;
	}

	public void setTelefoneInstrutorId(Integer telefoneInstrutorId) {
		this.telefoneInstrutorId = telefoneInstrutorId;
	}

	public Double getNumero() {
		return numero;
	}

	public void setNumero(Double numero) {
		this.numero = numero;
	}

	public Instrutor getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
	}

}
