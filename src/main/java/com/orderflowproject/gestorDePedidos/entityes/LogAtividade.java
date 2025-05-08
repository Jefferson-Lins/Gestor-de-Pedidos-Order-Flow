package com.orderflowproject.gestorDePedidos.entityes;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class LogAtividade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDateTime dataHora;
	private String tipoAcao;
	private String descricao;
	@ManyToOne
	@JoinColumn(name = "funcionarioId", referencedColumnName = "id", nullable = false )
	private Funcionario funcionarioId;
	private String ip;
	private String dadosAdicionais;
	public LogAtividade() {
		super();
	}
	public LogAtividade(LocalDateTime dataHora, String tipoAcao, String descricao, Funcionario funcionarioId, String ip,
			String dadosAdicionais) {
		super();
		this.dataHora = dataHora;
		this.tipoAcao = tipoAcao;
		this.descricao = descricao;
		this.funcionarioId = funcionarioId;
		this.ip = ip;
		this.dadosAdicionais = dadosAdicionais;
	}
	public Long getId() {
		return id;
	}
	
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	public void setDataHora(LocalDateTime dataHora) {
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
	public Funcionario getFuncionarioId() {
		return funcionarioId;
	}
	public void setFuncionarioId(Funcionario funcionarioId) {
		this.funcionarioId = funcionarioId;
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
