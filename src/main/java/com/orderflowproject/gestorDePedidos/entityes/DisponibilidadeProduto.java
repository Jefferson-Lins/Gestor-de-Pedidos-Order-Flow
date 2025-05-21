package com.orderflowproject.gestorDePedidos.entityes;


import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;

@Entity
public class DisponibilidadeProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "produto_id", referencedColumnName = "id")
    private Produto produto;

    @Enumerated(EnumType.STRING) 
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

    
    public DisponibilidadeProduto(Produto produto, DiaSemana diaSemana, boolean disponivel, LocalTime horarioInicio,
            LocalTime horarioFim) {
        super();
        this.produto = produto;
        this.diaSemana = diaSemana;
        this.disponivel = disponivel;
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public DiaSemana getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(DiaSemana diaSemana) {
        this.diaSemana = diaSemana;
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
    }
}
