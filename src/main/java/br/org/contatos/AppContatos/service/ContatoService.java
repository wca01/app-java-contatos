package br.org.contatos.AppContatos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.org.contatos.AppContatos.entity.Contato;
import br.org.contatos.AppContatos.repository.ContatoRepository;

@Service
public class ContatoService {
private ContatoRepository contatoRepository;
	
	public ContatoService(ContatoRepository contatoRepository) {
	this.contatoRepository = contatoRepository;
	
	}

	public List<Contato> create(Contato contato){
		contatoRepository.save(contato);
		return list();
	}
	public List<Contato> list (){
		return contatoRepository.findAll();
		
	}
	public List<Contato> update(Contato contato){
		contatoRepository.save(contato);
		return list();
		
	}
	public List<Contato> delete(Long id){
		contatoRepository.deleteById(id);
		return list();
	}
}
