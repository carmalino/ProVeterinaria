package com.veterinaria.idao;

import java.util.List;
import com.veterinaria.model.Servicio;

public interface IServicioDao {
	
	public boolean registrar(Servicio servicio);
	public boolean actualizar(Servicio servicio);
	public boolean eliminar(Servicio servicio);
	public List<Servicio> obtener();	
}
