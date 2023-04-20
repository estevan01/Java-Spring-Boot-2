package com.msasuntos.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="ASUNTO")
public class Asuntos implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
	property = "numExpediente")
	private int numExpediente;
	
	@Column(name="FECHA_INICIO", columnDefinition="DATE")
	private LocalDateTime fechaInicio;
	@Column(name="FECHA_FIN", columnDefinition="DATE")
	private LocalDateTime fechaFin;
	@Column (name="STATUS",columnDefinition="NVARCHAR2")
	private String status;
	@Column(name="CLIENTE_ID", columnDefinition="NUMBER")
	private int ClienteId;
	
	
	
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
