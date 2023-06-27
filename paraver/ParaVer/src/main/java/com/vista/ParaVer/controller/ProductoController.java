package com.vista.ParaVer.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vista.ParaVer.entity.Producto;
import com.vista.ParaVer.service.ProductoService;




@RestController
@RequestMapping("/ruta")
@CrossOrigin("http://localhost:4200")
public class ProductoController {
	
	@Autowired
	private ProductoService servicio;

	@GetMapping("/productos")
	public List<Producto> ver() {
		
		return servicio.ver();
	}
	
	@PostMapping
	public Producto registrar(@RequestBody Producto producto) {
		return servicio.registrar(producto);
	}
	
}
