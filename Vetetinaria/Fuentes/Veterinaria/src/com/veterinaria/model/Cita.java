package com.veterinaria.model;

public class Cita {

	private int idCita;
	private Cliente cliente;
	private Mascota mascota;
	private Empleado doctor;
	private String fecha;
	private Servicio servicioOfrecido;
	public int getIdCita() {
		return idCita;
	}
	public void setIdCita(int idCita) {
		this.idCita = idCita;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Mascota getMascota() {
		return mascota;
	}
	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}
	public Empleado getDoctor() {
		return doctor;
	}
	public void setDoctor(Empleado doctor) {
		this.doctor = doctor;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Servicio getServicioOfrecido() {
		return servicioOfrecido;
	}
	public void setServicioOfrecido(Servicio servicioOfrecido) {
		this.servicioOfrecido = servicioOfrecido;
	}
	
	
}
