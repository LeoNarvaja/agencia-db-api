package com.agencia.pruebas.models;

import jakarta.persistence.*;

import java.awt.image.ImagingOpException;
import java.util.List;

@Entity
@Table(name = "Vehiculos")
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "PATENTE")
    private String patente;

    @Column(name = "ANIO")
    private int anio = 2019;

    @OneToMany(mappedBy = "vehiculo")
    private List<Prueba> pruebas;

    @OneToMany(mappedBy = "vehiculo")
    private List<Posicion> posiciones;

    @ManyToOne
    @JoinColumn(name = "ID_MODELO")
    private Modelo modelo;

}
