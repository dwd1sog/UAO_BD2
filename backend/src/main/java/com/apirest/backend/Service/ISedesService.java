package com.apirest.backend.Service;

import java.util.List;

import org.bson.types.ObjectId;

import com.apirest.backend.Model.SedesModel;

public interface ISedesService {
    public String CrearSede(SedesModel sede);
    public List<SedesModel> ListarSedes();
    public SedesModel buscarSedePorId(ObjectId id);
    public SedesModel actualizarSede(ObjectId id, SedesModel sede);
    public String eliminarSede(ObjectId id);
    public List<SedesModel> buscarSedePorTiendaId(ObjectId tiendaId);
}