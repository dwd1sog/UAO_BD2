package com.apirest.backend.Model;

import org.bson.types.ObjectId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class VinculadorEmpleado {
    private String fecha;
    private ObjectId sedeId;
    private String sedeNombre;
    private String estado;

}