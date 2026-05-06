package com.orderflowproject.gestorDePedidos.controller;

import java.util.List;
import java.util.Optional;

import com.orderflowproject.gestorDePedidos.dto.PedidoDTO;
import com.orderflowproject.gestorDePedidos.entityes.Cliente;
import com.orderflowproject.gestorDePedidos.entityes.Estabelecimento;
import com.orderflowproject.gestorDePedidos.entityes.Pedido;
import com.orderflowproject.gestorDePedidos.entityes.Produto;
import com.orderflowproject.gestorDePedidos.repository.ClienteRepository;
import com.orderflowproject.gestorDePedidos.repository.EstabelecimentoRepository;
import com.orderflowproject.gestorDePedidos.repository.PedidoRepository;
import com.orderflowproject.gestorDePedidos.repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private EstabelecimentoRepository estabelecimentoRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping
    public List<Pedido> getAllPedidos() {
        return pedidoRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedido> getPedidoById(@PathVariable Long id) {
        Optional<Pedido> pedido = pedidoRepository.findById(id);
        return pedido.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Pedido> createPedido(@RequestBody PedidoDTO pedidoDTO) {
    	 if (pedidoDTO.getProdutosIds() == null || pedidoDTO.getProdutosIds().isEmpty()) {
         	return ResponseEntity.badRequest().body(null);
         }
        Pedido pedido = new Pedido();

        Cliente cliente = clienteRepository.findById(pedidoDTO.getClienteId())
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));

        Estabelecimento estabelecimento = estabelecimentoRepository.findById(pedidoDTO.getEstabelecimentoId())
                .orElseThrow(() -> new RuntimeException("Estabelecimento não encontrado"));

        List<Produto> produtos = produtoRepository.findAllById(pedidoDTO.getProdutosIds());

        pedido.setCliente(cliente);
        pedido.setEstabelecimento(estabelecimento);
        pedido.setProdutos(produtos);
        pedido.setEnderecoEntrega(pedidoDTO.getEnderecoEntrega());
        pedido.setTelefoneCliente(pedidoDTO.getTelefoneCliente());
        pedido.setStatus(pedidoDTO.getStatus());
        pedido.setDataHora(pedidoDTO.getDataHora());
        pedido.setMotivoCancelamento(pedidoDTO.getMotivoCancelamento());
        pedido.setValorTotal(pedidoDTO.getValorTotal());

        Pedido novoPedido = pedidoRepository.save(pedido);
        return ResponseEntity.ok(novoPedido);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pedido> updatePedido(@PathVariable Long id, @RequestBody PedidoDTO pedidoDTO) {
        return pedidoRepository.findById(id).map(pedido -> {

            Cliente cliente = clienteRepository.findById(pedidoDTO.getClienteId())
                    .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));

            Estabelecimento estabelecimento = estabelecimentoRepository.findById(pedidoDTO.getEstabelecimentoId())
                    .orElseThrow(() -> new RuntimeException("Estabelecimento não encontrado"));

            List<Produto> produtos = produtoRepository.findAllById(pedidoDTO.getProdutosIds());

            pedido.setCliente(cliente);
            pedido.setEstabelecimento(estabelecimento);
            pedido.setProdutos(produtos);
            pedido.setEnderecoEntrega(pedidoDTO.getEnderecoEntrega());
            pedido.setTelefoneCliente(pedidoDTO.getTelefoneCliente());
            pedido.setStatus(pedidoDTO.getStatus());
            pedido.setDataHora(pedidoDTO.getDataHora());
            pedido.setMotivoCancelamento(pedidoDTO.getMotivoCancelamento());
            pedido.setValorTotal(pedidoDTO.getValorTotal());

            Pedido atualizado = pedidoRepository.save(pedido);
            return ResponseEntity.ok(atualizado);

        }).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePedido(@PathVariable Long id) {
        if (pedidoRepository.existsById(id)) {
            pedidoRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
