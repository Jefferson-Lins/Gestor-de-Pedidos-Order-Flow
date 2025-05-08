package com.orderflowproject.gestorDePedidos.entityes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class PermissaoAcesso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "perfilAcessoId", referencedColumnName = "id", nullable = false )
	private PerfilAcesso perfilAcessoId;
	private String recurso;
	private String acao;
	
	public PermissaoAcesso(PerfilAcesso perfilAcessoId, String recurso, String acao) {
		super();
		this.perfilAcessoId = perfilAcessoId;
		this.recurso = recurso;
		this.acao = acao;
	}

	public PermissaoAcesso() {
		super();
	}

	public Long getId() {
		return id;
	}

	public PerfilAcesso getPerfilAcessoId() {
		return perfilAcessoId;
	}

	public void setPerfilAcessoId(PerfilAcesso perfilAcessoId) {
		this.perfilAcessoId = perfilAcessoId;
	}

	public String getRecurso() {
		return recurso;
	}

	public void setRecurso(String recurso) {
		this.recurso = recurso;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}
	
	
}
