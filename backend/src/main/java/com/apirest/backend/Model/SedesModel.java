package com.apirest.backend.Model;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Sedes")
public class SedesModel {
    
    @Id
    private ObjectId id;
    private String nombre;
    private List<Vehiculo> vehiculos;
    private ObjectId tiendaId; // Llave foránea hacia Tiendas

    // Getters y Setters
    public ObjectId getId() { return id; }
    public void setId(ObjectId id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public List<Vehiculo> getVehiculos() { return vehiculos; }
    public void setVehiculos(List<Vehiculo> vehiculos) { this.vehiculos = vehiculos; }

    public ObjectId getTiendaId() { return tiendaId; }
    public void setTiendaId(ObjectId tiendaId) { this.tiendaId = tiendaId; }
}