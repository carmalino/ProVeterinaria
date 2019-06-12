package com.veterinaria.model;

import java.util.ArrayList;
import java.util.List;

public class Empleado extends Persona {

	private int idEmpleado;
	private String cargo;	
	private List<Especialidad> listaEspecilidades = new ArrayList<Especialidad>();
	
	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public List<Especialidad> getListaEspecilidades() {
		return listaEspecilidades;
	}

	public void setListaEspecilidades(List<Especialidad> listaEspecilidades) {
		this.listaEspecilidades = listaEspecilidades;
	}

	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", cargo=" + cargo + "]";
	}
	
}
