package com.softeam.parqueo.repository;

import com.softeam.parqueo.entity.Parqueo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParqueoRepository extends JpaRepository<Parqueo,Long> {}
