package com.orderflowproject.gestorDePedidos.entityes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	@Column(unique = true)
	private String cpf;
	private String email;
	private String telefone;
	private String endereco;
	@Column(unique = true)
	private String usuario;
	private String senha;
	private Funcao funcao;
	
	@ManyToOne
	@JoinColumn(name = "perfilAcessoId", referencedColumnName = "id", nullable = false )
	private PerfilAcesso perfilAcessoId;
	
	public enum Funcao {
		Cozinheiro, Gerente, Balconista,
		AuxCozinha, Garçom, Entregador
	}

	public Funcionario() {
		super();
	}

	public Funcionario(String nome, String cpf, String email, String telefone, String endereco, String usuario,
			String senha, Funcao funcao) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
		this.usuario = usuario;
		this.senha = senha;
		this.funcao = funcao;
	}
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Funcao getFuncao() {
		return funcao;
	}

	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}

	public PerfilAcesso getPerfilAcessoId() {
		return perfilAcessoId;
	}

	public void setPerfilAcessoId(PerfilAcesso perfilAcessoId) {
		this.perfilAcessoId = perfilAcessoId;
	};
	
	
}
