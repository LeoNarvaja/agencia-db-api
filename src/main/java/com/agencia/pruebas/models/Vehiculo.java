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

    public Vehiculo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public List<Prueba> getPruebas() {
        return pruebas;
    }

    public void setPruebas(List<Prueba> pruebas) {
        this.pruebas = pruebas;
    }

    public List<Posicion> getPosiciones() {
        return posiciones;
    }

    public void setPosiciones(List<Posicion> posiciones) {
        this.posiciones = posiciones;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

}
