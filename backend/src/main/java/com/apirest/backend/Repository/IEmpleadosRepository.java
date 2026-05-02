package com.apirest.backend.Repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.apirest.backend.Model.EmpleadosModel;

public interface IEmpleadosRepository extends MongoRepository<EmpleadosModel, ObjectId> {
    
    @Query("{ 'vinculadores.sedeId': ?0 }")
    List<EmpleadosModel> buscarEmpleadosPorSede(ObjectId sedeId);

}