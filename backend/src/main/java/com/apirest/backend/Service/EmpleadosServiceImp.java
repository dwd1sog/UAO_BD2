package com.apirest.backend.Service;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.backend.Exception.RecursoNoEncontradoException;
import com.apirest.backend.Model.EmpleadosModel;
import com.apirest.backend.Repository.IEmpleadosRepository;

@Service
public class EmpleadosServiceImp implements IEmpleadosService {

    @Autowired 
    IEmpleadosRepository empleadosRepository;

    @Override
    public String insertarEmpleado(EmpleadosModel empleado) {
        empleadosRepository.save(empleado);
        return "El empleado " + empleado.getNombre() + " fue creado con éxito";
    }

    @Override
    public List<EmpleadosModel> listarEmpleados() {
        return empleadosRepository.findAll();
    }

    @Override
    public EmpleadosModel buscarEmpleadoPorId(ObjectId id) {
        return empleadosRepository.findById(id)
            .orElseThrow(() -> new RecursoNoEncontradoException("Error: No existe un empleado con ID " + id));
    }

    @Override
    public EmpleadosModel actualizarEmpleado(ObjectId id, EmpleadosModel empleado) {
        EmpleadosModel empleadoExistente = buscarEmpleadoPorId(id);
        
        empleadoExistente.setNombre(empleado.getNombre());
        empleadoExistente.setSexo(empleado.getSexo());
        empleadoExistente.setVinculadores(empleado.getVinculadores());
        
        return empleadosRepository.save(empleadoExistente);
    }

    @Override
    public String eliminarEmpleado(ObjectId id) {
        EmpleadosModel empleadoExistente = buscarEmpleadoPorId(id);
        empleadosRepository.delete(empleadoExistente);
        return "El empleado con ID " + id + " fue eliminado correctamente";
    }

    @Override
    public List<EmpleadosModel> buscarEmpleadosPorSede(ObjectId sedeId) {
        return empleadosRepository.buscarEmpleadosPorSede(sedeId);
    }
}