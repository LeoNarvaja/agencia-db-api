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

}
