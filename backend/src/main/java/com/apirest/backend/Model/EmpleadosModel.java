package com.apirest.backend.Model;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Empleados")
public class EmpleadosModel {
    @Id
    private ObjectId id;
    private String nombre;
    private String sexo;
    private List<Vinculador> vinculadores;

    public ObjectId getId() { return id; }
    public void setId(ObjectId id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; }
    public List<Vinculador> getVinculadores() { return vinculadores; }
    public void setVinculadores(List<Vinculador> vinculadores) { this.vinculadores = vinculadores; }
}