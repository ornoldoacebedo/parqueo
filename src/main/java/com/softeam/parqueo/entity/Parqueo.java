package com.softeam.parqueo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Data
@Entity
public class Parqueo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "numero_puesto", nullable = false)
    private int numero_puesto;

    @Column(name = "hora_inicial")
    private Date hora_inicial;

    @Column(name = "hora_final")
    private Date hora_final;

    @OneToOne
    @JoinColumn(name = "id_vehiculo")
    private Vehiculo vehiculo;

    @ManyToOne
    @JoinColumn(name = "id_parqueadero")
    private Parqueadero id_posicion;


}
