package com.orderflowproject.gestorDePedidos.entityes;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Caixa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private LocalDateTime data_abertura;
	private LocalDateTime data_fechamento;
	private BigDecimal valor_inicial;
	private BigDecimal valor_final;
	private String status;
	private long funcionario_id;

	public Caixa()  {

	}
	
	public Caixa(LocalDateTime data_abertura, LocalDateTime data_fechamento, BigDecimal valor_inicial,
			BigDecimal valor_final, String status, long funcionario_id) {
		super();
		this.data_abertura = data_abertura;
		this.data_fechamento = data_fechamento;
		this.valor_inicial = valor_inicial;
		this.valor_final = valor_final;
		this.status = status;
		this.funcionario_id = funcionario_id;
	}

	public long getId() {
		return id;
	}

	public LocalDateTime getData_abertura() {
		return data_abertura;
	}

	public void setData_abertura(LocalDateTime data_abertura) {
		this.data_abertura = data_abertura;
	}

	public LocalDateTime getData_fechamento() {
		return data_fechamento;
	}

	public void setData_fechamento(LocalDateTime data_fechamento) {
		this.data_fechamento = data_fechamento;
	}

	public BigDecimal getValor_inicial() {
		return valor_inicial;
	}

	public void setValor_inicial(BigDecimal valor_inicial) {
		this.valor_inicial = valor_inicial;
	}

	public BigDecimal getValor_final() {
		return valor_final;
	}

	public void setValor_final(BigDecimal valor_final) {
		this.valor_final = valor_final;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getFuncionario_id() {
		return funcionario_id;
	}

}
