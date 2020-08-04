package com.redesocial.TasteMood.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name= "tb_user")
public class UserModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 10, max = 300)
	private String nome;

	@NotNull
	@Size(min = 10, max = 200)
	private String email;
	
	@NotNull
	@Size(min = 10, max = 70)
	private String senha;
	
	@OneToMany(mappedBy = "nome", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("nome")
	private List<PostModel> texto;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<PostModel> getTexto() {
		return texto;
	}

	public void setTexto(List<PostModel> texto) {
		this.texto = texto;
	}

}
