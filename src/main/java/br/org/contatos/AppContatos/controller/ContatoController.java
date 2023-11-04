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

import br.org.contatos.AppContatos.entity.Contato;
import br.org.contatos.AppContatos.service.ContatoService;

@RestController
@RequestMapping("/contato")
public class ContatoController {
	private ContatoService contatoService;

	public ContatoController(ContatoService contatoService) {
	this.contatoService = contatoService;
	}
	
	@PostMapping
	List<Contato> create(@RequestBody Contato contato){
		return contatoService.create(contato);
	}
	
	@GetMapping
	List<Contato> list(){
		return contatoService.list();
	}
	
	@PutMapping
	List<Contato> update(@RequestBody Contato contato){
		return contatoService.update(contato);
	}
	
	@DeleteMapping("{id}")
	List<Contato> delete(@PathVariable("id")Long id){
		return contatoService.delete(id);
	}
}
