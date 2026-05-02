package com.apirest.backend.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class VehiculoSede {
    private String marca;
    private String modelo;
    private String matricula;
    private String estado;

}