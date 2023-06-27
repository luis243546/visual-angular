package com.vista.ParaVer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vista.ParaVer.entity.Producto;
import com.vista.ParaVer.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService{

	@Autowired
	ProductoRepository productoService;
	
	@Override
	public List<Producto> ver() {
		return productoService.findAll();
	}

	@Override
	public Producto registrar(Producto producto) {
		// TODO Auto-generated method stub
		return productoService.save(producto);
	}

}
