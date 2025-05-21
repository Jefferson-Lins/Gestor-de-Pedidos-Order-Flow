package com.orderflowproject.gestorDePedidos.entityes;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class LogAtividade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Timestamp dataHora;
	private String tipoAcao;
	private String descricao;
	@ManyToOne
	private Funcionario funcionario;
	private String ip;
	private String dadosAdicionais;
	public LogAtividade() {
		super();
	}
	public LogAtividade(Timestamp dataHora, String tipoAcao, String descricao, Funcionario funcionario, String ip,
			String dadosAdicionais) {
		super();
		this.dataHora = dataHora;
		this.tipoAcao = tipoAcao;
		this.descricao = descricao;
		this.funcionario = funcionario;
		this.ip = ip;
		this.dadosAdicionais = dadosAdicionais;
	}
	public Long getId() {
		return id;
	}
	
	public Timestamp getDataHora() {
		return dataHora;
	}
	public void setDataHora(Timestamp dataHora) {
		this.dataHora = dataHora;
	}
	public String getTipoAcao() {
		return tipoAcao;
	}
	public void setTipoAcao(String tipoAcao) {
		this.tipoAcao = tipoAcao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getDadosAdicionais() {
		return dadosAdicionais;
	}
	public void setDadosAdicionais(String dadosAdicionais) {
		this.dadosAdicionais = dadosAdicionais;
	}
	
}
