package com.example.sesion03.controller.handlers;

import com.example.sesion03.model.RespuestaError;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class ManejadorGlobalExcepciones {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleStatusException(MethodArgumentNotValidException ex, WebRequest request){
        return RespuestaError.builder()
                .exception(ex)
                .ruta(request.getDescription(false).substring(4))
                .entidad();
    }

}
