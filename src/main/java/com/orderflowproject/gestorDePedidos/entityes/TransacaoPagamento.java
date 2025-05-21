package com.orderflowproject.gestorDePedidos.entityes;

import java.math.BigDecimal;
import java.sql.Timestamp;

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
	@JoinColumn(name = "pedido_id", referencedColumnName = "id")
	private Pedido pedido;
	private BigDecimal valor;
	@ManyToOne
	@JoinColumn(name = "formaPagamento_id", referencedColumnName = "id")
	private FormaPagamento formaPagamento;
	private Status status;
	private String codTransacao;
	private Timestamp dataHora;
	private String dataGetway;
	
	public enum Status {
		Pendente, EmAnalise, Autorizado, Concluido, 
		Capturado, Cancelado, Estornado, Expirado, ChargBack
	}

	public TransacaoPagamento(Long id, Pedido pedido, BigDecimal valor, FormaPagamento formaPagamento,
			String codTransacao, Timestamp dataHora, String dataGetway) {
		super();
		this.id = id;
		this.pedido = pedido;
		this.valor = valor;
		this.formaPagamento = formaPagamento;
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

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
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

	public Timestamp getDataHora() {
		return dataHora;
	}

	public void setDataHora(Timestamp dataHora) {
		this.dataHora = dataHora;
	}

	public String getDataGetway() {
		return dataGetway;
	}

	public void setDataGetway(String dataGetway) {
		this.dataGetway = dataGetway;
	};
		
	
}
