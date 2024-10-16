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

    public Marca() {
    }

    public Marca(String nombre, List<Modelo> modelos) {
        this.nombre = nombre;
        this.modelos = modelos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Modelo> getModelos() {
        return modelos;
    }

    public void setModelos(List<Modelo> modelos) {
        this.modelos = modelos;
    }
}
