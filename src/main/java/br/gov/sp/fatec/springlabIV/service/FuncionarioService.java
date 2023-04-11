package br.gov.sp.fatec.springlabIV.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.gov.sp.fatec.springlabIV.exception.UsuarioNaoEncontradoException;
import br.gov.sp.fatec.springlabIV.model.Funcionario;
import br.gov.sp.fatec.springlabIV.repository.FuncionarioRepository;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public List<Funcionario> listarFuncionarios(){
        return funcionarioRepository.findAll();
    }

    public Funcionario cadastrarFuncionario(Funcionario funcionario){
        return funcionarioRepository.save(funcionario);
    }

    public Funcionario buscarPorId(Long id) {
        Optional<Funcionario> funcionarioOp = funcionarioRepository.findById(id);
        if(funcionarioOp.isPresent()) {
            return funcionarioOp.get();
        }
        throw new UsuarioNaoEncontradoException("Id inválido!");
    }
    
}
