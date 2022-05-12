package com.aprendizadospring;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aprendizadospring.domain.Pessoa;
import com.aprendizadospring.repositories.PessoaRepository;

@SpringBootApplication
public class TesteConhecimentoApplication implements CommandLineRunner{

	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(TesteConhecimentoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Pessoa pes1 = new Pessoa(null, "joão da silva", "joaodasilva@gmail.com");
		Pessoa pes2 = new Pessoa(null, "Maria joaquina", "mariajoaquina@yahoo.com.br");
		
		pessoaRepository.saveAll(Arrays.asList(pes1, pes2));
		
	}
		
}
