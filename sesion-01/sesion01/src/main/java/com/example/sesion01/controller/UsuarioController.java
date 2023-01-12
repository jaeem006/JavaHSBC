package com.example.sesion01.controller;

import com.example.sesion01.model.Direccion;
import com.example.sesion01.model.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioController {

    @PostMapping
    public ResponseEntity<Usuario> crearUsuario(@RequestBody Usuario usuario, @RequestParam("id") long id, @RequestParam("rol") String rol){
        System.out.println("Creando usuario");
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Apellido: " + usuario.getApellido());
        System.out.println("Usuario: " + usuario.getUsuario());
        System.out.println("E-Mail: " + usuario.getCorreoElectronico());
        System.out.println("Rol: " + rol);

        Direccion direccion = new Direccion();

        direccion.setCalle("Córdoba");
        direccion.setNumero("56");
        direccion.setCp("06700");

        usuario.setDireccion(direccion);

        return ResponseEntity.ok(usuario);
    }

}
