package br.org.contatos.AppContatos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.org.contatos.AppContatos.entity.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
