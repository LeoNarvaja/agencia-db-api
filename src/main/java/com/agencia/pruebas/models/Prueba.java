package com.agencia.pruebas.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Pruebas")
public class Prueba {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "FECHA_HORA_INICIO")
    private LocalDateTime fechaHoraInicio = LocalDateTime.now();

    @Column(name = "FECHA_HORA_FIN")
    private LocalDateTime fechaHoraFin = LocalDateTime.now();

    @Column(name = "COMENTARIOS")
    private String comentarios;

    @ManyToOne
    @JoinColumn(name = "ID_EMPLEADO", referencedColumnName = "LEGAJO")
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "ID_INTERESADO", referencedColumnName = "ID")
    private Interesado interesado;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_VEHICULO", referencedColumnName = "ID")
    private Vehiculo vehiculo;

    public Prueba() {
    }

    public Prueba(LocalDateTime fechaHoraInicio, LocalDateTime fechaHoraFin, String comentarios, Empleado empleado, Interesado interesado, Vehiculo vehiculo) {
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = fechaHoraFin;
        this.comentarios = comentarios;
        this.empleado = empleado;
        this.interesado = interesado;
        this.vehiculo = vehiculo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public void setFechaHoraInicio(LocalDateTime fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public LocalDateTime getFechaHoraFin() {
        return fechaHoraFin;
    }

    public void setFechaHoraFin(LocalDateTime fechaHoraFin) {
        this.fechaHoraFin = fechaHoraFin;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Interesado getInteresado() {
        return interesado;
    }

    public void setInteresado(Interesado interesado) {
        this.interesado = interesado;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

}
