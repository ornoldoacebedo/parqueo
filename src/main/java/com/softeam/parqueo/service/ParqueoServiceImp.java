package com.softeam.parqueo.service;

import com.softeam.parqueo.entity.Parqueo;
import com.softeam.parqueo.entity.Vehiculo;
import com.softeam.parqueo.repository.ParqueoRepository;
import com.softeam.parqueo.repository.VehiculoRepository;
import com.softeam.parqueo.service.DTO.ParqueoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class ParqueoServiceImp implements IParqueoService {

    @Autowired
    ParqueoRepository parqueoRepository;

    @Autowired
    VehiculoRepository vehiculoRepository;


    @Override
    public Parqueo crearParqueo(ParqueoDTO parqueoDTO) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setChapa(parqueoDTO.getChapa());
        vehiculo.setModelo(parqueoDTO.getModelo());
        vehiculo.setMarca(parqueoDTO.getMarca());

        Vehiculo vehiculoGuardar = vehiculoRepository.save(vehiculo);

        Parqueo posicion1 = new Parqueo();
        posicion1.setHora_inicial(new Date());
        posicion1.setHora_final(new Date());
        posicion1.setNumero_puesto(parqueoDTO.getNumero_puesto());
        posicion1.setVehiculo(vehiculoGuardar);

        return parqueoRepository.save(posicion1);
    }

    @Override
    public List<Parqueo> listar() {

        return parqueoRepository.findAll();
    }
    @Override
    public List<Parqueo> obtenerVehiculosParqueados(){
        return null;
    }

    @Override
    public Parqueo updateParqueo() {
        return null;
    }
}
