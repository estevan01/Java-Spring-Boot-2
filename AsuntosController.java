package com.msasuntos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msasuntos.entity.Asuntos;
import com.msasuntos.logic.AsuntosLogic;
import com.msasuntos.request.AsuntosRequest;



@RequestMapping("asuntos/")
@RestController
public class AsuntosController {
	
	@Autowired
	AsuntosLogic service;
	
	
	@GetMapping()
	public ResponseEntity<List <Asuntos>> mostrar(){ 
			
			List <Asuntos> asunto = service.mostrarTodos();
			
			return new ResponseEntity<List<Asuntos>>(asunto,HttpStatus.OK);
		
		}
	
	@GetMapping("buscar-por-id/{id}") //
	public ResponseEntity<Asuntos> buscar(@PathVariable int id){ 
		
		Asuntos asunto = service.buscar(id);
		
		return new ResponseEntity<Asuntos>(asunto,HttpStatus.OK);
	
	}
	
	@GetMapping("buscar-por-nombre/{nombre}") //
	public ResponseEntity<Asuntos> buscarPorNombre(@PathVariable int numExpediente){ 
		
		Asuntos asunto = service.buscarPorNombre(numExpediente);
		
		return new ResponseEntity<Asuntos>(asunto,HttpStatus.OK);
	
	}
	
	@PostMapping()
	public ResponseEntity <Asuntos> guardar(@RequestBody AsuntosRequest request){
		
		Asuntos asunto = service.guardar(request);
		return new ResponseEntity<Asuntos>(asunto, HttpStatus.OK);
		
	}
	
	@PutMapping()
	public ResponseEntity <Asuntos> editar(@RequestBody AsuntosRequest request){
		
		Asuntos asunto = service.editar(request);
		return new ResponseEntity<Asuntos>(asunto, HttpStatus.OK);
		
	}
	
	@DeleteMapping()
	public ResponseEntity <String> eliminar(@PathVariable int id){
		
		String response = service.eliminar(id);
		return new ResponseEntity<String>(response, HttpStatus.OK);
		
	}
	
	

}
