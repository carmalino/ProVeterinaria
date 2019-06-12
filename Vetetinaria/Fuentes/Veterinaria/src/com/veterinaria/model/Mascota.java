package com.veterinaria.model;

import java.util.List;

public class Mascota {

	private int idMascota;
	private String nombre;
	private int edad;
	private List<String> padres;
	private String raza;
	private String especie;
	private String fechaNacimiento;
	
	
	public int getIdMascota() {
		return idMascota;
	}


	public void setIdMascota(int idMascota) {
		this.idMascota = idMascota;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public List<String> getPadres() {
		return padres;
	}


	public void setPadres(List<String> padres) {
		this.padres = padres;
	}


	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}


	public String getEspecie() {
		return especie;
	}


	public void setEspecie(String especie) {
		this.especie = especie;
	}


	public String getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	@Override
	public String toString() {
		return "Mascota [idMascota=" + idMascota + ", nombre=" + nombre + ", edad=" + edad + ", padres=" + padres
				+ ", raza=" + raza + ", especie=" + especie + ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	
	
}
