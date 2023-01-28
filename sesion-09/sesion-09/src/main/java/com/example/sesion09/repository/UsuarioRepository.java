package com.example.sesion09.repository;

import com.example.sesion09.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository
        extends JpaRepository <Usuario, Integer> {

    Optional<Usuario> findOneByEmail(String email);
}
