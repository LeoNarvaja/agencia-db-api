package com.agencia.pruebas.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Empleados")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LEGAJO")
    private int legajo;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "APELLIDO")
    private String apellido;

    @Column(name = "TELEFONO_CONTACTO")
    private String telefonoContacto;

    @OneToMany(mappedBy = "empleado")
    private List<Prueba> pruebas;

}
