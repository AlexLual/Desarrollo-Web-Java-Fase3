package org.bedu.fase3.postwork.model;

import java.time.LocalDateTime;
import java.util.Map;

import org.bedu.fase3.postwork.model.builders.RespuestaErrorBuilder;

public class RespuestaError {

    private final LocalDateTime timeDateTime = LocalDateTime.now();
    private int estatus;
    private String mensaje;
    private Map<String, String> errores;
    private String ruta;

    public static RespuestaErrorBuilder builder() {
        return new RespuestaErrorBuilder();
    }

    public LocalDateTime getTimestamp() {
        return timeDateTime;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
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
