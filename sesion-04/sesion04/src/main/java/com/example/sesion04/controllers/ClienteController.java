package com.example.sesion04.controllers;

import com.example.sesion04.model.Cliente;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.net.URI;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @GetMapping("/{clienteId}")
    public ResponseEntity<?> getCliente(@PathVariable long clienteId){

        if(clienteId > 10){
            //NO EXISTE (404 - NOT FOUND)
            //throw new ResponseStatusException(HttpStatus.NOT_FOUND, "El cliente no existe");
            return ResponseEntity.notFound().build();
        }
        if(clienteId > 5){
            // CONFIDENCIAL (403 - FORBIDDEN)
            throw new ResponseStatusException(HttpStatus.FORBIDDEN, "No tienes permiso de acceso a este cliente");
        }
        // REGRESAMOS LA INFO (200 - OK)
        Cliente cliente = new Cliente();
        cliente.setId(clienteId);
        cliente.setNombre("Beto");

        return ResponseEntity.ok(cliente);
    }

    @PostMapping
    public ResponseEntity<Void> crearCliente(@Valid @RequestBody Cliente cliente){
        return ResponseEntity.created(URI.create("")).build();
    }
}
