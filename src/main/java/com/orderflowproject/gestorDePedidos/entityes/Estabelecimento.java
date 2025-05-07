package com.orderflowproject.gestorDePedidos.entityes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Estabelecimento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String razao_social;
	private String cnpj;
	private String endereco;
	private String telefone;
	private String email;
	private String configuracoes;
	
	public Estabelecimento()  {

	}
		
	public Estabelecimento(String razao_social, String cnpj, String endereco, 
			String telefone, String email,
			String configuracoes) {
		super();
		this.razao_social = razao_social;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.configuracoes = configuracoes;
	}

	public long getId() {
		return id;
	}

	public String getRazao_social() {
		return razao_social;
	}

	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getConfiguracoes() {
		return configuracoes;
	}

	public void setConfiguracoes(String configuracoes) {
		this.configuracoes = configuracoes;
	}



}
