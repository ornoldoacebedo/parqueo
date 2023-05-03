package com.softeam.parqueo.service;

import com.softeam.parqueo.entity.Vehiculo;

public interface IVehiculoService {
    public Vehiculo parquearVehiculo(int poscicion, Vehiculo vehiculo);
}
