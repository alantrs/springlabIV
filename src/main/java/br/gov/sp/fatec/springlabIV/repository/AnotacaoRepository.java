package br.gov.sp.fatec.springlabIV.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.gov.sp.fatec.springlabIV.model.Anotacao;

public interface AnotacaoRepository extends JpaRepository<Anotacao, Long>{

    public List<Anotacao> findByUsuarioNome(String nomeUsuario);

    @Query("select a from Anotacao a join a.usuario u where u.nome = ?1")
    public List<Anotacao> buscarPeloNomeUsuario(String nomeUsuario);
    
}
