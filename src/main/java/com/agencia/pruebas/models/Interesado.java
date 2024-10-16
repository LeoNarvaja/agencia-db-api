package com.agencia.pruebas.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Interesados")
public class Interesado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "TIPO_DOCUMENTO")
    private String tipoDocumento = "DNI";

    @Column(name = "DOCUMENTO")
    private String documento;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "APELLIDO")
    private String apellido;

    @Column(name = "RESTRINGIDO")
    private Boolean restringido = false;

    @Column(name = "NRO_LICENCIA")
    private int nroLicencia;

    @Column(name = "FECHA_VENCIMIENTO_LICENCIA")
    private LocalDate fechaVencimientoLicencia;

    @OneToMany(mappedBy = "interesado")
    private List<Prueba> pruebas;


    public Interesado() {
    }

    public Interesado(String tipoDocumento, Boolean restringido, String apellido, String nombre, String documento, int nroLicencia, LocalDate fechaVencimientoLicencia, List<Prueba> pruebas) {
        this.tipoDocumento = tipoDocumento;
        this.restringido = restringido;
        this.apellido = apellido;
        this.nombre = nombre;
        this.documento = documento;
        this.nroLicencia = nroLicencia;
        this.fechaVencimientoLicencia = fechaVencimientoLicencia;
        this.pruebas = pruebas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Boolean getRestringido() {
        return restringido;
    }

    public void setRestringido(Boolean restringido) {
        this.restringido = restringido;
    }

    public int getNroLicencia() {
        return nroLicencia;
    }

    public void setNroLicencia(int nroLicencia) {
        this.nroLicencia = nroLicencia;
    }

    public LocalDate getFechaVencimientoLicencia() {
        return fechaVencimientoLicencia;
    }

    public void setFechaVencimientoLicencia(LocalDate fechaVencimientoLicencia) {
        this.fechaVencimientoLicencia = fechaVencimientoLicencia;
    }

    public List<Prueba> getPruebas() {
        return pruebas;
    }

    public void setPruebas(List<Prueba> pruebas) {
        this.pruebas = pruebas;
    }

}
