package com.orderflowproject.gestorDePedidos.entityes;

import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class DisponibilidadeProduto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "produtoId", referencedColumnName = "id", nullable = false )
	private Produto produtoId;
	private DiaSemana diaSemana;
	private boolean disponivel = true;
	private LocalTime horarioInicio;
	private LocalTime horarioFim;
	
	public enum DiaSemana {
		Segunda, Terca, Quarta, Quinta, Sexta, Sabado, Domingo
	}

	public DisponibilidadeProduto() {
		super();
	}

	public DisponibilidadeProduto(Produto produtoId, boolean disponivel, LocalTime horarioInicio,
			LocalTime horarioFim) {
		super();
		this.produtoId = produtoId;
		this.disponivel = disponivel;
		this.horarioInicio = horarioInicio;
		this.horarioFim = horarioFim;
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

	public DiaSemana getDiaSemana() {
		return diaSemana;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	public LocalTime getHorarioInicio() {
		return horarioInicio;
	}

	public void setHorarioInicio(LocalTime horarioInicio) {
		this.horarioInicio = horarioInicio;
	}

	public LocalTime getHorarioFim() {
		return horarioFim;
	}

	public void setHorarioFim(LocalTime horarioFim) {
		this.horarioFim = horarioFim;
	};
		
}

