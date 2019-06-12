package com.veterinaria.model;

public class HistoriaClinica extends Cita {

	private int idHistoria;
	private int temperatura;
	private int pulso;
	private Patologia patologia;
	private String diagnostico;
	
	public int getIdHistoria() {
		return idHistoria;
	}

	public void setIdHistoria(int idHistoria) {
		this.idHistoria = idHistoria;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	public int getPulso() {
		return pulso;
	}

	public void setPulso(int pulso) {
		this.pulso = pulso;
	}

	public Patologia getPatologia() {
		return patologia;
	}

	public void setPatologia(Patologia patologia) {
		this.patologia = patologia;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	@Override
	public String toString() {
		return "HistoriaClinica [idHistoria=" + idHistoria + ", temperatura=" + temperatura + ", pulso=" + pulso
				+ ", patologia=" + patologia + ", diagnostico=" + diagnostico + "]";
	}
	
	
	
}
