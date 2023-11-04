package br.org.contatos.AppContatos.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.contatos.AppContatos.entity.Pessoa;
import br.org.contatos.AppContatos.service.PessoaService;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
	private PessoaService pessoaService;
	
	public PessoaController(PessoaService pessoaService) {
		this.pessoaService = pessoaService;
	}
	
	@PostMapping
	List<Pessoa> create(@RequestBody Pessoa pessoa){
		return pessoaService.create(pessoa);
	}
	
	@GetMapping
	List<Pessoa> list(){
		return pessoaService.list();
	}
	
	@PutMapping
	List<Pessoa> update(@RequestBody Pessoa pessoa){
		return pessoaService.update(pessoa);
	}
	
	@DeleteMapping("{id}")
	List<Pessoa> delete(@PathVariable("id") Long id){
		return pessoaService.delete(id);
	}
}

