package com.softeam.parqueo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
@Entity
public class Parqueadero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "contOcupado")
    private int contOcupado;

    @OneToMany(mappedBy = "id_posicion")
    private List<Parqueo> puestos = new ArrayList<>(100);

    public Parqueadero(Long id, int contOcupado, List<Parqueo> puestos) {

        for (int i = 0; i < 10; i++) {
            Parqueo parqueo = new Parqueo();
            this.puestos.add(parqueo);
        }
        this.id = id;
        this.contOcupado = 0;

    }

}
