package com.orderflowproject.gestorDePedidos.controller;

import com.orderflowproject.gestorDePedidos.entityes.Estabelecimento;
import com.orderflowproject.gestorDePedidos.services.EstabelecimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estabelecimentos")
public class EstabelecimentoController {

    @Autowired
    private EstabelecimentoService estabelecimentoService;

    @GetMapping
    public List<Estabelecimento> getAllEstabelecimentos() {
        return estabelecimentoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estabelecimento> getEstabelecimentoById(@PathVariable Long id) {
        return estabelecimentoService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Estabelecimento> createEstabelecimento(@RequestBody Estabelecimento estabelecimento) {
        Estabelecimento novoEstabelecimento = estabelecimentoService.save(estabelecimento);
        return ResponseEntity.ok(novoEstabelecimento);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Estabelecimento> updateEstabelecimento(@PathVariable Long id, @RequestBody Estabelecimento estabelecimentoAtualizado) {
        return estabelecimentoService.update(id, estabelecimentoAtualizado)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEstabelecimento(@PathVariable Long id) {
        if (estabelecimentoService.deleteById(id)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
