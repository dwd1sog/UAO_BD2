package com.apirest.backend.Service;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.backend.Exception.RecursoNoEncontradoException;
import com.apirest.backend.Model.SedesModel;
import com.apirest.backend.Repository.ISedesRepository;

@Service
public class SedesServiceImp implements ISedesService {

    @Autowired 
    ISedesRepository sedesRepository;

    @Override
    public String GuardarSede(SedesModel sede) {
        sedesRepository.save(sede);
        return "La sede " + sede.getNombre() + " fue creada con éxito";
    }

    @Override
    public List<SedesModel> ListarSedes() {
        return sedesRepository.findAll();
    }

    @Override
    public SedesModel buscarSedePorId(ObjectId id) {
        return sedesRepository.findById(id)
            .orElseThrow(() -> new RecursoNoEncontradoException("Error: No existe una sede con ID " + id));
    }

    @Override
    public SedesModel actualizarSede(ObjectId id, SedesModel sede) {
        SedesModel sedeExistente = buscarSedePorId(id);
        // Actualizamos los datos
        sedeExistente.setNombre(sede.getNombre());
        sedeExistente.setVehiculos(sede.getVehiculos());
        sedeExistente.setTiendaId(sede.getTiendaId());
        
        return sedesRepository.save(sedeExistente);
    }

    @Override
    public String eliminarSede(ObjectId id) {
        SedesModel sedeExistente = buscarSedePorId(id);
        sedesRepository.delete(sedeExistente);
        return "La sede con ID " + id + " fue eliminada correctamente";
    }
}