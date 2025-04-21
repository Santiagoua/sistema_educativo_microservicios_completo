
package com.edu.usuarios.repository;

import com.edu.usuarios.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {}
