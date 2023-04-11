package br.gov.sp.fatec.springlabIV.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.springlabIV.model.Funcionario;
import br.gov.sp.fatec.springlabIV.service.FuncionarioService;

@RestController
@RequestMapping(value = "/funcionario")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @PostMapping
    public Funcionario cadastrarFuncionario(@RequestBody Funcionario funcionario){
        return funcionarioService.cadastrarFuncionario(funcionario);
    }

    @GetMapping("/buscar")
    public List<Funcionario> buscarTodos() {
    return funcionarioService.listarFuncionarios();
    }

    @GetMapping(value = "/id/{funcionario}")
    public Funcionario buscarPorId(@PathVariable("funcionario") Long id) {
    return funcionarioService.buscarPorId(id);
    }

}
