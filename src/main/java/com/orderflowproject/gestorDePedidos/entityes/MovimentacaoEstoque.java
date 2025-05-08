package com.orderflowproject.gestorDePedidos.entityes;


import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class MovimentacaoEstoque {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "produtoId", referencedColumnName = "id", nullable = false)
	private Produto produtoId;
	private Integer quantidade;
	private Tipo tipoMovimentacao;
	private LocalDateTime dataHora;
	@ManyToOne
	@JoinColumn(name = "funcionarioId", referencedColumnName = "id", nullable = false)
	private Funcionario funcionarioId;
	private String motivo;
	
	public enum Tipo {
		
		Entrada, Saída
	}

	public MovimentacaoEstoque(Produto produtoId, Integer quantidade, Tipo tipoMovimentacao, LocalDateTime dataHora,
			Funcionario funcionarioId, String motivo) {
		super();
		this.produtoId = produtoId;
		this.quantidade = quantidade;
		this.tipoMovimentacao = tipoMovimentacao;
		this.dataHora = dataHora;
		this.funcionarioId = funcionarioId;
		this.motivo = motivo;
	}

	public MovimentacaoEstoque() {
		super();
	}

	public Long getId() {
		return id;
	}

	public Produto getProdutoId() {
		return produtoId;
	}

	public void setProdutoId(Produto produtoId) {
		this.produtoId = produtoId;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Tipo getTipoMovimentacao() {
		return tipoMovimentacao;
	}

	public void setTipoMovimentacao(Tipo tipoMovimentacao) {
		this.tipoMovimentacao = tipoMovimentacao;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	public Funcionario getFuncionarioId() {
		return funcionarioId;
	}

	public void setFuncionarioId(Funcionario funcionarioId) {
		this.funcionarioId = funcionarioId;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	};	
	
	
}
