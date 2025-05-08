package com.orderflowproject.gestorDePedidos.entityes;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class TransacaoPagamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "pedidoId", referencedColumnName = "id", nullable = false )
	private Pedido pedidoId;
	private BigDecimal valor;
	@ManyToOne
	@JoinColumn(name = "formaPagamentoId", referencedColumnName = "id", nullable = false )
	private FormaPagamento formaPagamentoId;
	private Status status;
	private String codTransacao;
	private LocalDateTime dataHora;
	private String dataGetway;
	
	public enum Status {
		Pendente, EmAnalise, Autorizado, Concluido, 
		Capturado, Cancelado, Estornado, Expirado, ChargBack
	}

	public TransacaoPagamento(Long id, Pedido pedidoId, BigDecimal valor, FormaPagamento formaPagamentoId,
			String codTransacao, LocalDateTime dataHora, String dataGetway) {
		super();
		this.id = id;
		this.pedidoId = pedidoId;
		this.valor = valor;
		this.formaPagamentoId = formaPagamentoId;
		this.codTransacao = codTransacao;
		this.dataHora = dataHora;
		this.dataGetway = dataGetway;
	}

	public TransacaoPagamento() {
		super();
	}

	public Long getId() {
		return id;
	}

	public Pedido getPedidoId() {
		return pedidoId;
	}

	public void setPedidoId(Pedido pedidoId) {
		this.pedidoId = pedidoId;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public FormaPagamento getFormaPagamentoId() {
		return formaPagamentoId;
	}

	public void setFormaPagamentoId(FormaPagamento formaPagamentoId) {
		this.formaPagamentoId = formaPagamentoId;
	}

	public Status getStatus() {
		return status;
	}

	public String getCodTransacao() {
		return codTransacao;
	}

	public void setCodTransacao(String codTransacao) {
		this.codTransacao = codTransacao;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	public String getDataGetway() {
		return dataGetway;
	}

	public void setDataGetway(String dataGetway) {
		this.dataGetway = dataGetway;
	};
		
	
}
