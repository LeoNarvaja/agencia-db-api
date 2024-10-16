package com.agencia.pruebas.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Marcas")
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "NOMBRE")
    private String nombre;

    @OneToMany(mappedBy = "marca")
    private List<Modelo> modelos;

}
