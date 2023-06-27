package com.vista.ParaVer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="producto")
@Entity(name="Producto")
public class Producto {
	
	@Id
	String codigo;
	String nombre;
	String marca;
	int cantidad;
	int precio;
	
	public Producto() {}
	
	public Producto(String codigo,String nombre,String marca,int cantidad,int precio) {
	  this.codigo=codigo;
	  this.nombre=nombre;
	  this.marca=marca;
	  this.cantidad=cantidad;
	  this.precio=precio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	

}
