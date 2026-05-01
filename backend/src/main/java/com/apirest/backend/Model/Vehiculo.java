package com.apirest.backend.Model;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String matricula;
    private String estado;

    // Getters y Setters manuales a prueba de errores
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}