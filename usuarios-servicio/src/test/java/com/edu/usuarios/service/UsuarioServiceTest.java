package com.edu.usuarios.service;

import com.edu.usuarios.model.Usuario;
import com.edu.usuarios.repository.UsuarioRepository;
import org.junit.jupiter.api.Test;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class UsuarioServiceTest {

    private final UsuarioRepository repo = mock(UsuarioRepository.class);
    private final UsuarioService service = new UsuarioService(repo);

    @Test
    void testGuardarUsuario() {
        Usuario u = new Usuario();
        u.setNombre("Carlos");
        u.setCorreo("carlos@email.com");

        Usuario guardado = new Usuario();
        guardado.setId("1");
        guardado.setNombre("Carlos");
        guardado.setCorreo("carlos@email.com");

        when(repo.save(u)).thenReturn(guardado);

        assertEquals(guardado, service.guardar(u));
    }

    @Test
    void testBuscarPorId() {
        Usuario u = new Usuario();
        u.setId("1");
        u.setNombre("Carlos");
        u.setCorreo("carlos@email.com");

        when(repo.findById("1")).thenReturn(Optional.of(u));

        assertEquals("Carlos", service.buscarPorId("1").getNombre());
    }
}
