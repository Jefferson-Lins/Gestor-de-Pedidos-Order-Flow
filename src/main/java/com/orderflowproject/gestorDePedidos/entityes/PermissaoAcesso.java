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
	@JoinColumn(name = "perfilAcesso_id", referencedColumnName = "id")
	private PerfilAcesso perfilAcesso;
	private String recurso;
	private String acao;
	
	public PermissaoAcesso(PerfilAcesso perfilAcesso, String recurso, String acao) {
		super();
		this.perfilAcesso = perfilAcesso;
		this.recurso = recurso;
		this.acao = acao;
	}

	public PermissaoAcesso() {
		super();
	}

	public Long getId() {
		return id;
	}

	public PerfilAcesso getPerfilAcesso() {
		return perfilAcesso;
	}

	public void setPerfilAcesso(PerfilAcesso perfilAcesso) {
		this.perfilAcesso = perfilAcesso;
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
