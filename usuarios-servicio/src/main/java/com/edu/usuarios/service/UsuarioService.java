package com.edu.usuarios.service;

import org.springframework.stereotype.Service;

import com.edu.usuarios.model.Usuario;
import com.edu.usuarios.repository.UsuarioRepository;

@Service
public class UsuarioService {

    private final UsuarioRepository repo;

    public UsuarioService(UsuarioRepository repo) {
        this.repo = repo;
    }

    public Usuario guardar(Usuario usuario) {
        return repo.save(usuario);
    }

    public Usuario buscarPorId(String id) {
        return repo.findById(id).orElse(null);
    }
}