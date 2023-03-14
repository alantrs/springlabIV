package br.gov.sp.fatec.springlabIV.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.springlabIV.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
}
