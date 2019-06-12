package com.veterinaria.model;

public class Enfermedad {
	
	private int idEnfermedad;
	private String nombreEnfermedad;
	
	public int getIdEnfermedad() {
		return idEnfermedad;
	}

	public void setIdEnfermedad(int idEnfermedad) {
		this.idEnfermedad = idEnfermedad;
	}

	public String getNombreEnfermedad() {
		return nombreEnfermedad;
	}

	public void setNombreEnfermedad(String nombreEnfermedad) {
		this.nombreEnfermedad = nombreEnfermedad;
	}

	@Override
	public String toString() {
		return "Enfermedad [idEnfermedad=" + idEnfermedad + ", nombreEnfermedad=" + nombreEnfermedad + "]";
	}
	

}
