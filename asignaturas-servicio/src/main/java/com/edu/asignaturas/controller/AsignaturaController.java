package com.edu.asignaturas.controller;

import com.edu.asignaturas.model.Asignatura;
import com.edu.asignaturas.repository.AsignaturaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/asignaturas")
public class AsignaturaController {

    private final AsignaturaRepository repository;

    public AsignaturaController(AsignaturaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Asignatura> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Asignatura save(@RequestBody Asignatura asignatura) {
        return repository.save(asignatura);
    }
}