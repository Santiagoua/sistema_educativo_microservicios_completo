package com.edu.asignaturas.repository;

import com.edu.asignaturas.model.Asignatura;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AsignaturaRepository extends MongoRepository<Asignatura, String> {
}