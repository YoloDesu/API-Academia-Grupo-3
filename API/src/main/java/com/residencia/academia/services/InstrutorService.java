package com.residencia.academia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Grupo3.API.entities.Instrutor;

@Service
public class InstrutorService {
	@Autowired
	InstrutorRepository instrutorRep;

	public List<Instrutor> listarInstrutors() {
		return instrutorRep.findAll();
	}

	public Instrutor buscarInstrutorId(Integer id) {
		return instrutorRep.findById(id).orElse(null);
	}

	public Instrutor salvarInstrutor(Instrutor instrutor) {
		return instrutorRep.save(instrutor);
	}

	public Instrutor atualizarInstrutor(Instrutor instrutor) {
		return instrutorRep.save(instrutor);
	}

	public Boolean deletarInstrutor(Instrutor instrutor) {
		if (instrutor == null)
			return false;

		Instrutor instrutorExistente = buscarInstrutorId(instrutor.getNumeroMatriculaInstrutor());
		if (instrutorExistente == null)
			return false;

		instrutorRep.delete(instrutor);

		Instrutor instrutorContinuaExistindo = buscarInstrutorId(instrutor.getNumeroMatriculaInstrutor());
		if (instrutorContinuaExistindo == null)
			return true;

		return false;

	}
}
