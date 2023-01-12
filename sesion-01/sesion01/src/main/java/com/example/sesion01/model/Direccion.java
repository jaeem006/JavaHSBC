package com.example.sesion01.model;

public class Direccion {
    private String calle;
    private String numero;
    private String cp;

    public String getNumero() {
        return numero;
    }

    public String getCalle() {
        return calle;
    }

    public String getCp() {
        return cp;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }
}
