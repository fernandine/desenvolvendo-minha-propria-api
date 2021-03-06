package com.aprendizadospring.services;

import java.util.List;
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aprendizadospring.domain.Endereco;
import com.aprendizadospring.repositories.EnderecoRepository;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository repo;

	public Endereco find(Integer id) {
		Optional<Endereco> opt = repo.findById(id);
		return opt.orElseThrow(() -> new ObjectNotFoundException("Endereco não encontrado!", null));

	}

	public List<Endereco> findAll() {
		return repo.findAll();
	}

	public Endereco insert(Endereco obj) {
		obj.setId(null);
		return repo.save(obj);
	}

	public Endereco update(Endereco obj) {
		find(obj.getId());
		return repo.save(obj);
	}

	public void delete(Integer id) {
		find(id);
		repo.deleteById(id);

	

	}
}
