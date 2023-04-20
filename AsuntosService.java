package com.msasuntos.service;

import java.util.List;

import com.msasuntos.entity.Asuntos;
import com.msasuntos.request.AsuntosRequest;


public interface AsuntosService {

	Asuntos guardar (AsuntosRequest request);
	Asuntos editar (AsuntosRequest request);
	Asuntos buscarPorNombre(int numExpediente);
	String eliminar (int id);
	List mostrarTodos();
	String desactivar(String nombre);
	Asuntos buscar (int id);
	
	
}
