package com.orderflowproject.gestorDePedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orderflowproject.gestorDePedidos.entityes.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}
