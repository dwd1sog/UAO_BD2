package com.apirest.backend.Repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.apirest.backend.Model.EmpleadosModel;

public interface IEmpleadosRepository extends MongoRepository<EmpleadosModel, ObjectId> {
    // Espacio listo por si luego quieres hacer consultas personalizadas de empleados
    @Aggregation(pipeline = {
        "{ $match: { 'nombre': ?0 } }",
        "{ $project: { _id: 0, nombre: 1, sexo: 1 } }"
    })
     List<EmpleadosModel> buscarEmpleadoPorNombre(String nombre);
}