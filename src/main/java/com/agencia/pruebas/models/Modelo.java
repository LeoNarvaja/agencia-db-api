package com.agencia.pruebas.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Modelos")
public class Modelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @OneToMany(mappedBy = "modelo")
    private List<Vehiculo> vehiculos;

    @ManyToOne
    @JoinColumn(name = "ID_MARCA", referencedColumnName = "ID")
    private Marca marca;

}
