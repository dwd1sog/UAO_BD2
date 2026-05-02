package com.apirest.backend.Repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.apirest.backend.Model.SedesModel;

public interface ISedesRepository extends MongoRepository<SedesModel, ObjectId> {
    List<SedesModel> findByTiendaId(ObjectId tiendaId);
}