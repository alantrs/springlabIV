package br.gov.sp.fatec.springlabIV.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.springlabIV.exception.UsuarioNaoEncontradoException;
import br.gov.sp.fatec.springlabIV.model.Autorizacao;
import br.gov.sp.fatec.springlabIV.model.Usuario;
import br.gov.sp.fatec.springlabIV.repository.AutorizacaoRepository;
import br.gov.sp.fatec.springlabIV.repository.UsuarioRepository;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepo;

    @Autowired
    private AutorizacaoRepository autRepo;
    
    public Usuario buscarPorId(Long id) {
        Optional<Usuario> usuarioOp = usuarioRepo.findById(id);
        if(usuarioOp.isPresent()) {
            return usuarioOp.get();
        }
        throw new UsuarioNaoEncontradoException("Id inválido!");
    }

    public Usuario novoUsuario(Usuario usuario) {
        if(usuario == null ||
                usuario.getNome() == null ||
                usuario.getSenha() == null) {
            throw new IllegalArgumentException("Nome e senha inválidos!");
        }
        return usuarioRepo.save(usuario);
    }

    @Transactional
    public Usuario novoUsuarioAutorizacao(String nome, String senha, String nomeAutorizacao) {
        Usuario usuario = new Usuario(nome, senha);
        Optional<Autorizacao> autOp = autRepo.findByNome(nomeAutorizacao);
        Autorizacao autorizacao;
        if(autOp.isEmpty()) {
            autorizacao = new Autorizacao();
            autorizacao.setNome(nomeAutorizacao);
            autRepo.save(autorizacao);
        }
        else {
            autorizacao = autOp.get();
        }
        usuario.setAutorizacoes(new ArrayList<Autorizacao>());
        usuario.getAutorizacoes().add(autorizacao);
        return usuarioRepo.save(usuario);
    }

    public List<Usuario> buscarTodos() {
        return usuarioRepo.findAll();
    }
}
