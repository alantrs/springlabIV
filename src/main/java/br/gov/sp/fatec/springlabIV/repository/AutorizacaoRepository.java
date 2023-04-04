package br.gov.sp.fatec.springlabIV.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.springlabIV.model.Autorizacao;

public interface AutorizacaoRepository extends JpaRepository<Autorizacao, Long>{

        public Optional<Autorizacao> findByNome(String nome);
    
}

