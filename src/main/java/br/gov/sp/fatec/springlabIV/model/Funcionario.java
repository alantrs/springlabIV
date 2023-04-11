package br.gov.sp.fatec.springlabIV.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "fnc_funcionario")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fnc_id")
    private Long id;

    @Column(name = "fnc_nome")
    private String nome;

    @Column(name = "fnc_cpf")
    private Long cpf;
    @Column(name = "fnc_data_hora_cadastro")
    private LocalDateTime data_hora_cadastro;
    @Column(name = "fnc_cargo")
    private String cargo;
    @Column(name = "fnc_email")
    private String email;
    @Column(name = "fnc_senha")
    private String senha;

    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Long getCpf() {
        return cpf;
    }
    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }
    public LocalDateTime getData_hora_cadastro() {
        return data_hora_cadastro;
    }
    public void setData_hora_cadastro(LocalDateTime data_hora_cadastro) {
        this.data_hora_cadastro = data_hora_cadastro;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    


    
}
