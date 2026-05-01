package com.apirest.backend.Model;

import org.bson.types.ObjectId;

public class Vinculador {
    private String fecha;
    private ObjectId sedeId;
    private String sedeNombre;
    private String estado;

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    public ObjectId getSedeId() { return sedeId; }
    public void setSedeId(ObjectId sedeId) { this.sedeId = sedeId; }
    public String getSedeNombre() { return sedeNombre; }
    public void setSedeNombre(String sedeNombre) { this.sedeNombre = sedeNombre; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}