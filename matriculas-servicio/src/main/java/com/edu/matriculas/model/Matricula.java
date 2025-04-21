
package com.edu.matriculas.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "matriculas")
public class Matricula {

    @Id
    private String id;
    private String usuarioId;
    private String asignaturaId;
    private LocalDate fecha;

    public Matricula() {}

    public Matricula(String usuarioId, String asignaturaId, LocalDate fecha) {
        this.usuarioId = usuarioId;
        this.asignaturaId = asignaturaId;
        this.fecha = fecha;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getUsuarioId() { return usuarioId; }
    public void setUsuarioId(String usuarioId) { this.usuarioId = usuarioId; }

    public String getAsignaturaId() { return asignaturaId; }
    public void setAsignaturaId(String asignaturaId) { this.asignaturaId = asignaturaId; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }
}
