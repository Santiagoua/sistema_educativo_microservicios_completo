
package com.edu.matriculas.controller;

import com.edu.matriculas.model.Matricula;
import com.edu.matriculas.repository.MatriculaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/matriculas")
public class MatriculaController {

    private final MatriculaRepository repo;

    public MatriculaController(MatriculaRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Matricula> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Matricula create(@RequestBody Matricula matricula) {
        return repo.save(matricula);
    }
}
