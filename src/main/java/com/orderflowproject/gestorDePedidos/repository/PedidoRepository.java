package com.orderflowproject.gestorDePedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orderflowproject.gestorDePedidos.entityes.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
