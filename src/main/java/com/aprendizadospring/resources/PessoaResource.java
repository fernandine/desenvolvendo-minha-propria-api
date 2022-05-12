package com.aprendizadospring.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aprendizadospring.domain.Pessoa;
import com.aprendizadospring.services.PessoaService;

@RestController
@RequestMapping(value="/dados")
public class PessoaResource {
	
	@Autowired
	private PessoaService service;
	
	@GetMapping
	@RequestMapping(value="/{id}")
	public ResponseEntity<Pessoa> buscar(@PathVariable Integer id){
		Pessoa obj = service.find(id);
				return ResponseEntity.ok().body(obj);
	}


	
	

}
