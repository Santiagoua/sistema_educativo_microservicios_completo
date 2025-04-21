
package com.edu.matriculas.repository;

import com.edu.matriculas.model.Matricula;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MatriculaRepository extends MongoRepository<Matricula, String> {
}
