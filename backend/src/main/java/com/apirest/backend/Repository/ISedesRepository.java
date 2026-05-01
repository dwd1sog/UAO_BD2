package com.apirest.backend.Repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.apirest.backend.Model.SedesModel;

public interface ISedesRepository extends MongoRepository<SedesModel, ObjectId> {
    // Si más adelante queremos hacer una consulta personalizada para Sedes, va aquí
}