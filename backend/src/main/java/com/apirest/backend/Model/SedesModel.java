package com.apirest.backend.Model;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document ("Sedes")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class SedesModel {
    
    @Id
    private ObjectId id;
    private String nombre;
    private List<VehiculoSede> vehiculos = new ArrayList<>();
    private ObjectId tiendaId; // Llave foránea hacia Tiendas

    @JsonProperty("id")
    public String getIdAString() {
        return id != null ? id.toHexString() : null;
    }
    @JsonProperty("tiendaId")
    public String getTiendaIdAString() {
        return tiendaId != null ? tiendaId.toHexString() : null;
    }
}