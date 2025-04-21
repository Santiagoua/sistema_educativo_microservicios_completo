package com.edu.usuarios.controller;

import java.util.List;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.when;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.edu.usuarios.model.Usuario;
import com.edu.usuarios.repository.UsuarioRepository;

@WebFluxTest(UsuarioController.class)
public class UsuarioControllerTest {

    @Autowired
    private WebTestClient webClient;

    @MockBean
    private UsuarioRepository repo;

    @Test
    void testGetUsuarios() {
        when(repo.findAll()).thenReturn(List.of(new Usuario("1", "Ana", "ana@email.com")));
        webClient.get().uri("/usuarios")
                .exchange()
                .expectStatus().isOk()
                .expectBodyList(Usuario.class);
    }
}
