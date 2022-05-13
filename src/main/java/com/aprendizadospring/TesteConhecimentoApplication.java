package com.aprendizadospring;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aprendizadospring.domain.Endereco;
import com.aprendizadospring.domain.Pessoa;
import com.aprendizadospring.repositories.EnderecoRepository;
import com.aprendizadospring.repositories.PessoaRepository;

@SpringBootApplication
public class TesteConhecimentoApplication implements CommandLineRunner{

	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(TesteConhecimentoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Pessoa pes1 = new Pessoa(null, "joão da silva", "joaodasilva@gmail.com");
		Pessoa pes2 = new Pessoa(null, "Maria joaquina", "mariajoaquina@yahoo.com.br");
		
		pessoaRepository.saveAll(Arrays.asList(pes1, pes2));
		
		Endereco end1 = new Endereco(null, "rua das flores", 345684.0);
		Endereco end2 = new Endereco(null, "rua das acacias", 8975.25);
		Endereco end3 = new Endereco(null, "rua do diamante", 87775.25);
		Endereco end4 = new Endereco(null, "rua Oliveira", 9825.25);
		
		pes1.getEnderecos().addAll(Arrays.asList(end1, end2));
		pes2.getEnderecos().addAll(Arrays.asList(end3, end4));
		
		enderecoRepository.saveAll(Arrays.asList(end1, end2, end3, end4));
		
		
		
		
	}
		
}
