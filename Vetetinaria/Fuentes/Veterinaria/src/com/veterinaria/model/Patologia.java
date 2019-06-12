package com.veterinaria.model;

public class Patologia {
	
	private int idPatologia;
	private String nombrePatologia;
	
	public int getIdPatologia() {
		return idPatologia;
	}

	public void setIdPatologia(int idPatologia) {
		this.idPatologia = idPatologia;
	}

	public String getNombrePatologia() {
		return nombrePatologia;
	}

	public void setNombrePatologia(String nombrePatologia) {
		this.nombrePatologia = nombrePatologia;
	}

	@Override
	public String toString() {
		return "Patologia [idPatologia=" + idPatologia + ", nombrePatologia=" + nombrePatologia + "]";
	}
	

}
