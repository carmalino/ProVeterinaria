package com.veterinaria.model;

public class Medicacion {

	private int idMedicacion;
	private HistoriaClinica idHistoria;
	private String nombreMedicina;
	private int dosis;
	private int frecuencia;
	private int dias;
	
	
	public int getIdMedicacion() {
		return idMedicacion;
	}


	public void setIdMedicacion(int idMedicacion) {
		this.idMedicacion = idMedicacion;
	}


	public HistoriaClinica getIdHistoria() {
		return idHistoria;
	}


	public void setIdHistoria(HistoriaClinica idHistoria) {
		this.idHistoria = idHistoria;
	}


	public String getNombreMedicina() {
		return nombreMedicina;
	}


	public void setNombreMedicina(String nombreMedicina) {
		this.nombreMedicina = nombreMedicina;
	}


	public int getDosis() {
		return dosis;
	}


	public void setDosis(int dosis) {
		this.dosis = dosis;
	}


	public int getFrecuencia() {
		return frecuencia;
	}


	public void setFrecuencia(int frecuencia) {
		this.frecuencia = frecuencia;
	}


	public int getDias() {
		return dias;
	}


	public void setDias(int dias) {
		this.dias = dias;
	}


	@Override
	public String toString() {
		return "Medicacion [idMedicacion=" + idMedicacion + ", idHistoria=" + idHistoria + ", nombreMedicina="
				+ nombreMedicina + ", dosis=" + dosis + ", frecuencia=" + frecuencia + ", dias=" + dias + "]";
	}
	
}
