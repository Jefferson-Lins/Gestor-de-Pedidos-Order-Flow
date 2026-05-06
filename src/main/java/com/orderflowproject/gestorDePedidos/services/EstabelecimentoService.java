package com.orderflowproject.gestorDePedidos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orderflowproject.gestorDePedidos.entityes.Estabelecimento;
import com.orderflowproject.gestorDePedidos.repository.EstabelecimentoRepository;

@Service
public class EstabelecimentoService {

    @Autowired
    private EstabelecimentoRepository estabelecimentoRepository;

    public List<Estabelecimento> findAll() {
        return estabelecimentoRepository.findAll();
    }

    public Optional<Estabelecimento> findById(Long id) {
        return estabelecimentoRepository.findById(id);
    }

    public Estabelecimento save(Estabelecimento estabelecimento) {
        return estabelecimentoRepository.save(estabelecimento);
    }

    public Optional<Estabelecimento> update(Long id, Estabelecimento estabelecimentoAtualizado) {
        return estabelecimentoRepository.findById(id).map(estabelecimento -> {
            estabelecimento.setRazaoSocial(estabelecimentoAtualizado.getRazaoSocial());
            estabelecimento.setCnpj(estabelecimentoAtualizado.getCnpj());
            estabelecimento.setEndereco(estabelecimentoAtualizado.getEndereco());
            estabelecimento.setTelefone(estabelecimentoAtualizado.getTelefone());
            estabelecimento.setEmail(estabelecimentoAtualizado.getEmail());
            estabelecimento.setConfiguracoes(estabelecimentoAtualizado.getConfiguracoes());
            return estabelecimentoRepository.save(estabelecimento);
        });
    }

    public boolean deleteById(Long id) {
        if (estabelecimentoRepository.existsById(id)) {
            estabelecimentoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
