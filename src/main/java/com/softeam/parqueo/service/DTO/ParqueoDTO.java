package com.softeam.parqueo.service.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ParqueoDTO {

    private String marca;

    private String modelo;

    private String chapa;

    private int numero_puesto;



}
