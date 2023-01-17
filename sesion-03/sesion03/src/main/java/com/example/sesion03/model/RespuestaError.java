package com.example.sesion03.model;


import java.time.LocalDateTime;
import java.util.Map;

public class RespuestaError {
    private final LocalDateTime timestamp = LocalDateTime.now();
    private int status;
    private Map<String ,String> errores;
    private String ruta;

    public int getStatus() {
        return status;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public static RespuestaErrorBuilder builder() {
        return new RespuestaErrorBuilder();
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Map<String, String> getErrores() {
        return errores;
    }

    public void setErrores(Map<String, String> errores) {
        this.errores = errores;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
}
