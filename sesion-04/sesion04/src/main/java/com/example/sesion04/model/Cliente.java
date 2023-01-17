package com.example.sesion04.model;

import jakarta.validation.constraints.*;

public class Cliente {
    @PositiveOrZero(message = "el id no puede ser negativo")
    private long id;
    @NotEmpty(message = "El nombre no puede ser vacío")
    @Size(min=5, max = 30, message = "El nombre debe contener entre 5 y 30 letras")
    private String nombre;
    @Email(message = "El correo no es válido")
    private String correoContacto;
    @Min(value = 10, message = "Los clientes con menos de 10 empleados no son válidos")
    @Max(value = 10000, message = "No se puede tener mas de 10,000 empleados")
    private String numeroEmpleados;
    @NotBlank(message = "El cliente debe tenr dirección")
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
