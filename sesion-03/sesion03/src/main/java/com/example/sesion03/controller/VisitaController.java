package com.example.sesion03.controller;

import com.example.sesion03.model.Visita;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

@RestController
public class VisitaController {
    @PostMapping("/visita")
    public ResponseEntity<Void> creaVisita(@Valid @RequestBody Visita visita){
        return ResponseEntity.created(URI.create("1")).build();
    }
}
