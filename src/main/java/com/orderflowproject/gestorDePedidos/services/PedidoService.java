package com.orderflowproject.gestorDePedidos.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.orderflowproject.gestorDePedidos.entityes.Pedido;
import com.orderflowproject.gestorDePedidos.repository.PedidoRepository;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    // Buscar todos os pedidos
    public List<Pedido> findAll() {
        return pedidoRepository.findAll();
    }

    // Buscar pedido por ID
    public Optional<Pedido> findById(Long id) {
        return pedidoRepository.findById(id);
    }

    // Criar novo pedido
    public Pedido save(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    // Atualizar pedido existente
    public Optional<Pedido> update(Long id, Pedido pedidoAtualizado) {
        return pedidoRepository.findById(id).map(pedido -> {
            pedido.setCliente(pedidoAtualizado.getCliente());
            pedido.setEnderecoEntrega(pedidoAtualizado.getEnderecoEntrega());
            pedido.setTelefoneCliente(pedidoAtualizado.getTelefoneCliente());
            pedido.setStatus(pedidoAtualizado.getStatus());
            pedido.setDataHora(pedidoAtualizado.getDataHora());
            pedido.setMotivoCancelamento(pedidoAtualizado.getMotivoCancelamento());
            pedido.setEstabelecimento(pedidoAtualizado.getEstabelecimento());
            pedido.setProdutos(pedidoAtualizado.getProdutos());
            pedido.setValorTotal(pedidoAtualizado.getValorTotal());

            return pedidoRepository.save(pedido);
        });
    }

    // Remover pedido
    public boolean deleteById(Long id) {
        if (pedidoRepository.existsById(id)) {
            pedidoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
