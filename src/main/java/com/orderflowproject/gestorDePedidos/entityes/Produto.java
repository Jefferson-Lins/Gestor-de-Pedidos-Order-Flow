package com.orderflowproject.gestorDePedidos.entityes;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private String descricao;
	private BigDecimal preco;
	private Integer quantidade_estoque;
	private String codigo_referencia;
	private long categoria_id;

	public Produto()  {

	}
	
	public Produto(String nome, String descricao, BigDecimal preco, Integer quantidade_estoque,
			String codigo_referencia, long categoria_id) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.quantidade_estoque = quantidade_estoque;
		this.codigo_referencia = codigo_referencia;
		this.categoria_id = categoria_id;
	}


	public long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Integer getQuantidade_estoque() {
		return quantidade_estoque;
	}

	public void setQuantidade_estoque(Integer quantidade_estoque) {
		this.quantidade_estoque = quantidade_estoque;
	}

	public String getCodigo_referencia() {
		return codigo_referencia;
	}

	public void setCodigo_referencia(String codigo_referencia) {
		this.codigo_referencia = codigo_referencia;
	}

	public long getCategoria_id() {
		return categoria_id;
	}


	

}
