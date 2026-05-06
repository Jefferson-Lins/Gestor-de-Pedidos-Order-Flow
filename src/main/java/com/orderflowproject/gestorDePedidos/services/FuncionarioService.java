package com.orderflowproject.gestorDePedidos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orderflowproject.gestorDePedidos.entityes.Funcionario;
import com.orderflowproject.gestorDePedidos.repository.FuncionarioRepository;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public List<Funcionario> findAll() {
        return funcionarioRepository.findAll();
    }

    public Optional<Funcionario> findById(Long id) {
        return funcionarioRepository.findById(id);
    }

    public Funcionario save(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    public Optional<Funcionario> update(Long id, Funcionario funcionarioAtualizado) {
        return funcionarioRepository.findById(id).map(funcionario -> {
            funcionario.setNome(funcionarioAtualizado.getNome());
            funcionario.setCpf(funcionarioAtualizado.getCpf());
            funcionario.setEmail(funcionarioAtualizado.getEmail());
            funcionario.setTelefone(funcionarioAtualizado.getTelefone());
            funcionario.setEndereco(funcionarioAtualizado.getEndereco());
            funcionario.setUsuario(funcionarioAtualizado.getUsuario());
            funcionario.setSenha(funcionarioAtualizado.getSenha());
            funcionario.setFuncao(funcionarioAtualizado.getFuncao());
            funcionario.setEstabelecimento(funcionarioAtualizado.getEstabelecimento());
            return funcionarioRepository.save(funcionario);
        });
    }

    public boolean deleteById(Long id) {
        if (funcionarioRepository.existsById(id)) {
            funcionarioRepository.deleteById(id);
            return true;
        }
        return false;
    }
}