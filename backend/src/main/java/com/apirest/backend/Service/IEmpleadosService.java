package com.apirest.backend.Service;

import java.util.List;

import org.bson.types.ObjectId;

import com.apirest.backend.Model.EmpleadosModel;

public interface IEmpleadosService {
    public String insertarEmpleado(EmpleadosModel empleado);
    public List<EmpleadosModel> listarEmpleados();
    public EmpleadosModel buscarEmpleadoPorId(ObjectId id);
    public EmpleadosModel actualizarEmpleado(ObjectId id, EmpleadosModel empleado);
    public String eliminarEmpleado(ObjectId id);
    public List<EmpleadosModel> buscarEmpleadosPorSede(ObjectId sedeId);
}