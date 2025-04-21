package com.edu.matriculas.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.edu.matriculas.model.Asignatura;

@FeignClient(name = "asignaturas-servicio")
public interface AsignaturaClient {
    @GetMapping("/asignaturas/{id}")
    Asignatura getAsignaturaPorId(@PathVariable String id);
}
