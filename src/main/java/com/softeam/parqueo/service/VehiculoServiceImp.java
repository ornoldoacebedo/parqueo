package com.softeam.parqueo.service;

import com.softeam.parqueo.entity.Parqueo;
import com.softeam.parqueo.entity.Vehiculo;
import com.softeam.parqueo.repository.ParqueaderoRepository;
import com.softeam.parqueo.service.DTO.ParqueoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class VehiculoServiceImp implements IVehiculoService{

    @Autowired
    ParqueaderoRepository parqueaderoRepository;
    //@Override
    public Vehiculo parquearVehiculo(int poscicion, ParqueoDTO parqueoDTO) {
        //tengo una lista de posiciones de parqueos
        //voy a buscar si la posicion que me dan esta ocupada
        //si no esta ocupada guardo el vehículo en la posicion



        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setChapa(parqueoDTO.getChapa());
        vehiculo.setModelo(parqueoDTO.getModelo());
        vehiculo.setMarca(parqueoDTO.getMarca());

        System.out.println(vehiculo);

       // Vehiculo vehiculoGuardar = vehiculoRepository.save(vehiculo);
/*
        System.out.println(vehiculoGuardar);

        Parqueo posicion1 = new Parqueo();
        posicion1.setHora_inicial(new Date());
        posicion1.setHora_final(new Date());
        posicion1.setNumero_puesto(parqueoDTO.getNumero_puesto());
        posicion1.setVehiculo(vehiculoGuardar);

        System.out.println(posicion1);

*/



        return null;
    }

    @Override
    public Vehiculo parquearVehiculo(int poscicion, Vehiculo vehiculo) {
        return null;
    }
}
