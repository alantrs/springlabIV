package br.gov.sp.fatec.springlabIV.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UsuarioNaoEncontradoException extends IllegalArgumentException {
    
    public UsuarioNaoEncontradoException() {
        super();
    }

    public UsuarioNaoEncontradoException(String message) {
        super(message);
    }

    public UsuarioNaoEncontradoException(String message, Throwable t) {
        super(message, t);
    }

}