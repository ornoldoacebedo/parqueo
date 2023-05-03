package com.softeam.parqueo.controller;

import com.softeam.parqueo.entity.Parqueo;
import com.softeam.parqueo.entity.Vehiculo;
import com.softeam.parqueo.service.DTO.ParqueoDTO;
import com.softeam.parqueo.service.ParqueoServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/parqueo")
public class ParqueoController {

    @Autowired
    ParqueoServiceImp posicionServiceImp;

    @PostMapping
    private ResponseEntity<Parqueo> crearParqueo(@RequestBody ParqueoDTO parqueoDTO){


        Parqueo parqueo = posicionServiceImp.crearParqueo(parqueoDTO);

        return new ResponseEntity<>(parqueo, HttpStatus.CREATED);
    }

    @GetMapping
    private ResponseEntity<List<Parqueo>> listarTipoVehiculo(){
        List<Parqueo> parqueos = posicionServiceImp.listar();
        return new ResponseEntity<>(parqueos,HttpStatus.OK);
    }

    @GetMapping("/asd")
    private ResponseEntity<List<Parqueo>> listarVehiculo(){
        List<Parqueo> parqueos = posicionServiceImp.listar();
        return new ResponseEntity<>(parqueos,HttpStatus.OK);
    }



}
