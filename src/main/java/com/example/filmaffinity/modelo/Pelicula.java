package com.example.filmaffinity.modelo;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String titulo;

    @Column(columnDefinition = "text")
    private String resumen;

    private String nacionalidad;

    @Temporal(TemporalType.DATE)
    private LocalDate fecha;
}
