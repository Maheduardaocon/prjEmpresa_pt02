package com.example.prjEmpresa.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_departamento")
public class Departamento {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long depcodigo;

	private String depnome;

	public Long getDepcodigo() {
		return depcodigo;
	}

	public void setDepcodigo(Long depcodigo) {
		this.depcodigo = depcodigo;
	}

	public String getDepnome() {
		return depnome;
	}

	public void setDepnome(String depnome) {
		this.depnome = depnome;
	}

	public Departamento() {

	}

	public Departamento(Long depcogigo, String depnome, List<Funcionario> funcionarios) {
		super();
		this.depcodigo = depcogigo;
		this.depnome = depnome;
	}
}
