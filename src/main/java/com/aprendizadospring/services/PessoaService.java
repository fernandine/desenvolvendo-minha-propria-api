package com.aprendizadospring.services;

import java.util.List;
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aprendizadospring.domain.Pessoa;
import com.aprendizadospring.repositories.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository repo;

	public Pessoa find(Integer id) {
		Optional<Pessoa> opt = repo.findById(id);
		return opt.orElseThrow(() -> new ObjectNotFoundException (
				"Objeto não encontrado! Id: " + id + "tipo: " + Pessoa.class.getName(), null)); 
	}

	public List<Pessoa> findAll() {
		return repo.findAll();
	}

}
