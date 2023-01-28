package com.example.sesion09.repository;

import com.example.sesion09.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository
        extends JpaRepository <Cliente,Integer>{
}
