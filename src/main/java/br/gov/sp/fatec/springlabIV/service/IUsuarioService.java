package br.gov.sp.fatec.springlabIV.service;

import java.util.List;

import br.gov.sp.fatec.springlabIV.model.Usuario;

public interface IUsuarioService {
    
    public Usuario buscarPorId(Long id);
    public Usuario novoUsuario(Usuario usuario);
    public List<Usuario> buscarTodos();
    public Usuario novoUsuarioAutorizacao(String nome, String senha, String nomeAutorizacao);

}
