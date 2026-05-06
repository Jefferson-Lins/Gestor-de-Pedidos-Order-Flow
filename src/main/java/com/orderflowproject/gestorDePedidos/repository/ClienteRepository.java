package com.orderflowproject.gestorDePedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orderflowproject.gestorDePedidos.entityes.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
