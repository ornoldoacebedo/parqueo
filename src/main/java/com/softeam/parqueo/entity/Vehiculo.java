package com.softeam.parqueo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "marca", nullable = false)
    private String marca;

    private String modelo;

    private String chapa;


}
