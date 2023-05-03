package com.softeam.parqueo.service;

import com.softeam.parqueo.entity.Parqueo;
import com.softeam.parqueo.service.DTO.ParqueoDTO;

import java.util.Date;
import java.util.List;

public interface IParqueoService {
    public Parqueo crearParqueo(ParqueoDTO parqueoDTO);

    public List<Parqueo> listar();

    public Parqueo updateParqueo();

    public List<Parqueo> obtenerVehiculosParqueados();



}
