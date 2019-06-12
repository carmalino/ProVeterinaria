package com.veterinaria.model;

public class EnfermedadesCronicas {
	private Mascota mascota;
	private HistoriaClinica historia;
	private Enfermedad enfermedad;
	
	
	public Mascota getMascota() {
		return mascota;
	}


	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}


	public HistoriaClinica getHistoria() {
		return historia;
	}


	public void setHistoria(HistoriaClinica historia) {
		this.historia = historia;
	}


	public Enfermedad getEnfermedad() {
		return enfermedad;
	}


	public void setEnfermedad(Enfermedad enfermedad) {
		this.enfermedad = enfermedad;
	}


	@Override
	public String toString() {
		return "EnfermedadesCronicas [mascota=" + mascota + ", historia=" + historia + ", enfermedad=" + enfermedad
				+ "]";
	}
	
		
	
}
