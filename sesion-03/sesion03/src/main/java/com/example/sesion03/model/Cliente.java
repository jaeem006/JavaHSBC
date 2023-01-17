package com.example.sesion03.model;

import jakarta.validation.constraints.*;

public class Cliente {
    @PositiveOrZero(message = "El id debe ser positivo")
    private long id;
    @NotEmpty(message = "El cliente debe tener un nombre")
    @Size(min = 5, max = 30, message = "El nombre debe tener entre 5 y 30 letras")
    private String nombre;
    @Email
    private String correoContacto;
    @Min(value = 10, message = "Debe de tener al menos 10 empleados")
    @Max(value = 100, message = "No puede tener mas de 100 empleados")
    private String numeroEmpleados;
    @NotBlank(message = "Se debe contar con una dirección")
    private String direccion;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoContacto() {
        return correoContacto;
    }

    public void setCorreoContacto(String correoContacto) {
        this.correoContacto = correoContacto;
    }

    public String getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(String numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
