package com.veterinaria.model;

import java.util.List;

public class Cliente extends Persona {

	private String sexo;
	private List<Mascota> listaMascotas;
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public List<Mascota> getListaMascotas() {
		return listaMascotas;
	}
	public void setListaMascotas(List<Mascota> listaMascotas) {
		this.listaMascotas = listaMascotas;
	}
	
}
