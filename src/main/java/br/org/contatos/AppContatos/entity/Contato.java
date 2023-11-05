package br.org.contatos.AppContatos.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="contatos")
public class Contato {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, unique = true)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "pessoa_id", nullable=false)
	private Pessoa pessoa;
	
	@Column(nullable = false)
	private Integer tipo;
	private String contato;
	
	
	//editado
	public enum TipoContato{
		TELEFONE,
		CELULAR
	}
	//construtores
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Number getTipo() {
		return tipo;
	}
	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	
		
	}
