package com.apirest.backend.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class EmpleadoDTO {
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
}
