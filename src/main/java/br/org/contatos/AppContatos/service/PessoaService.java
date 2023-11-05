package br.org.contatos.AppContatos.service;

import java.util.List;
import org.springframework.stereotype.Service;

import br.org.contatos.AppContatos.entity.Pessoa;
import br.org.contatos.AppContatos.repository.PessoaRepository;

@Service
public class PessoaService{
	private PessoaRepository pessoaRepository;
	
	public PessoaService(PessoaRepository pessoaRepository) {
	this.pessoaRepository = pessoaRepository;
	
	}

	public List<Pessoa> create(Pessoa pessoas){
		pessoaRepository.save(pessoas);
		return list();
	}
	public List<Pessoa> list (){
		return pessoaRepository.findAll();
		
	}
	public List<Pessoa> update(Pessoa pessoas){
		pessoaRepository.save(pessoas);
		return list();
		
	}
	public List<Pessoa> delete(Long id){
		pessoaRepository.deleteById(id);
		return list();
	}
	
	public Pessoa buscaPorId(Long id) {
	    return pessoaRepository.findById(id).orElse(null);
	}
	public Pessoa getPessoaParaMalaDireta(Long id) {
		return pessoaRepository.findById(id).orElse(null);
	}
}