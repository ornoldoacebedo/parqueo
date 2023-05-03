package com.softeam.parqueo.service;

import com.softeam.parqueo.entity.Parqueadero;
import com.softeam.parqueo.repository.ParqueaderoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParqueaderoServiceImp implements IParqueaderoService{

    @Autowired
    public ParqueaderoRepository parqueaderoRepository;
    @Override
    public Parqueadero prueba() {

        return null;
    }
}
