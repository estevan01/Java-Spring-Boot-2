package com.msasuntos.request;

import java.time.LocalDateTime;

public class AsuntosRequest {

	private int numExpediente;
	private LocalDateTime fechaInicio;
	private LocalDateTime fechaFin;
	private String status;
	private int ClienteId;
	
	public AsuntosRequest() {
		
	}

	public AsuntosRequest(int numExpediente, LocalDateTime fechaInicio, LocalDateTime fechaFin, String status,
			int clienteId) {
		super();
		this.numExpediente = numExpediente;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.status = status;
		ClienteId = clienteId;
	}

	public int getNumExpediente() {
		return numExpediente;
	}

	public void setNumExpediente(int numExpediente) {
		this.numExpediente = numExpediente;
	}

	public LocalDateTime getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDateTime fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDateTime getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDateTime fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getClienteId() {
		return ClienteId;
	}

	public void setClienteId(int clienteId) {
		ClienteId = clienteId;
	}

	@Override
	public String toString() {
		return "AsuntosRequest [numExpediente=" + numExpediente + ", fechaInicio=" + fechaInicio + ", fechaFin="
				+ fechaFin + ", status=" + status + ", ClienteId=" + ClienteId + "]";
	}
	
	 
	
	
	
	
	
}
