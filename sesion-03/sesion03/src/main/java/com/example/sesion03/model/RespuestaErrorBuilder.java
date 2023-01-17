package com.example.sesion03.model;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;

import java.util.HashMap;
import java.util.Map;

public class RespuestaErrorBuilder {
    private int status;
    private Map<String,String> errores;
    private String ruta;

    public RespuestaErrorBuilder estatus(int estatus) {
        this.status = estatus;
        return this;
    }

    public RespuestaErrorBuilder status(HttpStatus estatus) {
        this.status = estatus.value();
        return this;
    }

    public RespuestaErrorBuilder errores(Map<String, String> error) {
        this.errores = error;
        return this;
    }

    public RespuestaErrorBuilder  exception(MethodArgumentNotValidException ex){
        HttpStatus status = HttpStatus.BAD_REQUEST;
        this.status = status.value();

        this.errores = new HashMap<>();

        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errores.put(fieldName, errorMessage);
        });

        return this;
    }

    public RespuestaErrorBuilder ruta(String ruta) {
        this.ruta = ruta;
        return this;
    }

    public RespuestaError build(){
        RespuestaError respuesta  = new RespuestaError();

        respuesta.setStatus(this.status);
        respuesta.setErrores(this.errores);
        respuesta.setRuta(this.ruta);

        return respuesta;
    }

    public ResponseEntity<RespuestaError> entidad(){
        return ResponseEntity.status(status).headers(HttpHeaders.EMPTY).body(build());
    }
}
