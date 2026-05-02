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

@Document ("Empleados")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class EmpleadosModel {

    @Id
    private ObjectId id;
    private String nombre;
    private String sexo;
    private List<VinculadorEmpleado> vinculadores = new ArrayList<>();

    @JsonProperty("id")
    public String getIdAString() {
        return id != null ? id.toHexString() : null;
    }
}