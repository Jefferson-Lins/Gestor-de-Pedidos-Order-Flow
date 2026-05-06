package com.orderflowproject.gestorDePedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orderflowproject.gestorDePedidos.entityes.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
