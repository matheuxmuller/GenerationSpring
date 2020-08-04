package com.redesocial.TasteMood.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name= "tb_postagem")
public class PostModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 10, max = 5000)
	private String texto;
	
	private int likes;
	
	@ManyToOne
	@JsonIgnoreProperties("texto")
	private TemaModel descricao;
	
	@ManyToOne
	@JsonIgnoreProperties("texto")
	private UserModel nome;

	public UserModel getNome() {
		return nome;
	}

	public void setNome(UserModel nome) {
		this.nome = nome;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public TemaModel getDescricao() {
		return descricao;
	}

	public void setDescricao(TemaModel descricao) {
		this.descricao = descricao;
	}

}
