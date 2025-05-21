package com.orderflowproject.gestorDePedidos.entityes;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
	@JoinColumn(name = "produto_id", referencedColumnName = "id")
	private Produto produto;
	private Integer quantidade;
	@Enumerated(EnumType.STRING)
	private Tipo tipoMovimentacao;
	private LocalDateTime dataHora;
	@ManyToOne
	@JoinColumn(name = "funcionario_id", referencedColumnName = "id")
	private Funcionario funcionario;
	private String motivo;
	
	public enum Tipo {
		
		Entrada, Saída
	}

	public MovimentacaoEstoque(Produto produto, Integer quantidade, Tipo tipoMovimentacao, LocalDateTime dataHora,
			Funcionario funcionario, String motivo) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
		this.tipoMovimentacao = tipoMovimentacao;
		this.dataHora = dataHora;
		this.funcionario = funcionario;
		this.motivo = motivo;
	}

	public MovimentacaoEstoque() {
		super();
	}

	public Long getId() {
		return id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
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

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	};	
	
	
}
