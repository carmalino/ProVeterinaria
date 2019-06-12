package com.veterinaria.vista;

import java.util.List;
import com.veterinaria.model.Servicio;

public class ViewServicio {

	public void verServicio(Servicio servicio) {
		System.out.println("Datos del servicio: " + servicio);
	}
	
	public void verServicios(List<Servicio> servicios) {
		for (Servicio servicio:servicios) {
			System.out.println("Datos del servicio: " + servicio);
		}
	}
}
