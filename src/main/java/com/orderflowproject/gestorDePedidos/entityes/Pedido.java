package com.orderflowproject.gestorDePedidos.entityes;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long cliente_id;
	private long estabelecimento_id;
	private BigDecimal valor_total;
	private long forma_pagamento_id;
	private String endereco_entrega;
	private String telefone_cliente;
	private String status;
	private LocalDate data_hora;
	private String motivo_cancelamento;

	// Construtor Vazio

	public Pedido() {

	}

	// Metodos Get e Set

	public long getId() {
		return id;
	}

	public long getCliente_id() {
		return cliente_id;

	}

	public long getEstabelecimento_id() {
		return estabelecimento_id;
	}

	public BigDecimal getValor_total() {
		return valor_total;
	}

	public void setValor_total(BigDecimal valor_total) {
		this.valor_total = valor_total;
	}

	public long getForma_pagamento_id() {
		return forma_pagamento_id;
	}

	public String getEndereco_entrega() {
		return endereco_entrega;
	}

	public void setEndereco_entrega(String endereco_entrega) {
		this.endereco_entrega = endereco_entrega;
	}

	public String getTelefone_cliente() {
		return telefone_cliente;
	}

	public void setTelefone_cliente(String telefone_cliente) {
		this.telefone_cliente = telefone_cliente;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getData_hora() {
		return data_hora;
	}

	public void setData_hora(LocalDate data_hora) {
		this.data_hora = data_hora;
	}

	public String getMotivo_cancelamento() {
		return motivo_cancelamento;
	}

	public void setMotivo_cancelamento(String motivo_cancelamento) {
		this.motivo_cancelamento = motivo_cancelamento;
	}

}
