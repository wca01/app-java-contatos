package br.org.contatos.AppContatos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.contatos.AppContatos.entity.Contato;


public interface ContatoRepository extends JpaRepository<Contato, Long>{

}
