package com.Grupo3.API.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@JsonIdentityInfo(
		generator = ObjectIdGenerators.PropertyGenerator.class,
		property = "instrutorid",
		scope = Instrutor.class
		)
public class Instrutor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "instrutorid")
	private Integer instrutorId;
	
	@Column(name = "rg")
	private Double rg;
	
	@Column(name = "nomeinstrutor")
	private String nomeInstrutor;
	
	@OneToOne(mappedBy = "instrutor")
	private Telefone telefone;
	
	@OneToMany(mappedBy = "instrutor")
	private List<Turma> turmas;
	
	public Integer getInstrutorId() {
		return instrutorId;
	}
	public void setInstrutorId(Integer instrutorId) {
		this.instrutorId = instrutorId;
	}
	public Double getRg() {
		return rg;
	}
	public void setRg(Double rg) {
		this.rg = rg;
	}
	public String getNomeInstrutor() {
		return nomeInstrutor;
	}
	public void setNomeInstrutor(String nomeInstrutor) {
		this.nomeInstrutor = nomeInstrutor;
	}
	public Telefone getTelefone() {
		return telefone;
	}
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	public List<Turma> getTurmas() {
		return turmas;
	}
	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}
	
}
