package com.edu.matriculas.client;

import com.edu.matriculas.model.Usuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "usuarios-servicio")
public interface UsuarioClient {
    @GetMapping("/usuarios/{id}")
    Usuario getUsuarioPorId(@PathVariable String id);
}
