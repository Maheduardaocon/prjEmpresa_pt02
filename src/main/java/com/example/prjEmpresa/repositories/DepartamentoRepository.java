package com.example.prjEmpresa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.prjEmpresa.entities.Departamento;

public interface DepartamentoRepository extends JpaRepository <Departamento, Long> { 

}