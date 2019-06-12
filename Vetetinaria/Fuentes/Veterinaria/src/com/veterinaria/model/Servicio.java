package com.veterinaria.model;

public class Servicio {
	
	private int idServicio;
	private String nombreServicio;
	
	
	public int getIdServicio() {
		return idServicio;
	}


	public void setIdServicio(int idServicio) {
		this.idServicio = idServicio;
	}


	public String getNombreServicio() {
		return nombreServicio;
	}


	public void setNombreServicio(String nombreServicio) {
		this.nombreServicio = nombreServicio;
	}


	@Override
	public String toString() {
		return "Servicio [idServicio=" + idServicio + ", nombreServicio=" + nombreServicio + "]";
	}
	

}
