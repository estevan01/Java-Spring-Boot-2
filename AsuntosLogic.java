package com.msasuntos.logic;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msasuntos.entity.Asuntos;
import com.msasuntos.repository.AsuntosRepository;
import com.msasuntos.request.AsuntosRequest;
import com.msasuntos.service.AsuntosService;

@Transactional
@Service
public class AsuntosLogic implements AsuntosService{

	
	@Autowired
	AsuntosRepository repo;
	
	@Override
	public Asuntos guardar(AsuntosRequest request) {
		
		Asuntos asunto= new Asuntos();
		
		asunto.setNumExpediente(request.getNumExpediente());
		asunto.setFechaInicio(request.getFechaInicio());
		asunto.setFechaFin(request.getFechaFin());
		asunto.setStatus(request.getStatus());
		asunto.setClienteId(request.getClienteId());
		
		
		repo.save(asunto);
		return asunto;
	}

	@Override
	public Asuntos editar(AsuntosRequest request) {
		Asuntos asunto = repo.findById(request.getNumExpediente()).get();
		asunto.setNumExpediente(request.getNumExpediente());
		asunto.setFechaInicio(request.getFechaInicio());
		asunto.setFechaFin(request.getFechaFin());
		asunto.setStatus(request.getStatus());
		asunto.setClienteId(request.getClienteId());
		
		
		return null;
	}

	@Override
	public Asuntos buscarPorNombre(int numExpediente) {
		return repo.findByName(numExpediente);
	}

	@Override
	public String eliminar(int id) {
		repo.deleteById(id);
		return "Eliminado";
	}

	@Override
	public List mostrarTodos() {
		return repo.findAll();
	}

	@Override
	public String desactivar(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Asuntos buscar(int id) {
		
		return repo.findById(id).get();
	}
	
	
	

}
