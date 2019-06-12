package com.veterinaria.controller;

import java.util.ArrayList;
import java.util.List;

import com.veterinaria.dao.ServicioDaoImpl;
import com.veterinaria.idao.IServicioDao;
import com.veterinaria.model.Servicio;
import com.veterinaria.vista.ViewServicio;

public class ControllerServicio {

	private ViewServicio vista = new ViewServicio();
	
	public ControllerServicio() {
		
	}
	
	public void registrar(Servicio servicio) {
		IServicioDao dao = new ServicioDaoImpl();
		dao.registrar(servicio);
	}
	
	public void actualizar(Servicio servicio) {
		IServicioDao dao = new ServicioDaoImpl();
		dao.actualizar(servicio);
	}
	
	public void eliminar(Servicio servicio) {
		IServicioDao dao = new ServicioDaoImpl();
		dao.eliminar(servicio);
	}
	
	public void verServicios() {
		List<Servicio> servicios = new ArrayList<Servicio>();
		IServicioDao dao = new ServicioDaoImpl();
		servicios = dao.obtener();
		vista.verServicios(servicios);
	}
}
