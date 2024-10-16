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

    public Modelo() {
    }

    public Modelo(String descripcion, List<Vehiculo> vehiculos, Marca marca) {
        this.descripcion = descripcion;
        this.vehiculos = vehiculos;
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
