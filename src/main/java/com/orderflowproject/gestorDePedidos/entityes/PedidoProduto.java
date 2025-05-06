package com.orderflowproject.gestorDePedidos.entityes;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PedidoProduto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long pedido_id;
	private long produto_id;
	private Integer quantidade;
	private BigDecimal preco_unitario;

	// Construtor Vazio
	public PedidoProduto() {

	}
	
	//Metodos Get e Set

	public long getId()   {
		return id;
	}

	public long getPedido_id() {
		return pedido_id;
	}

	public long getProduto_id() {
		return produto_id;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getPreco_unitario() {
		return preco_unitario;
	}

	public void setPreco_unitario(BigDecimal preco_unitario) {
		this.preco_unitario = preco_unitario;
	}

}
