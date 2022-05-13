package com.aprendizadospring.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aprendizadospring.domain.Endereco;
import com.aprendizadospring.services.EnderecoService;

@RestController
@RequestMapping(value = "/enderecos")
public class EnderecoResource {
	
	@Autowired
	private EnderecoService service;
	
	@GetMapping
	@RequestMapping(value="/{id}")
	public ResponseEntity<Endereco> buscar(@PathVariable Integer id) {
		Endereco obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}

}
