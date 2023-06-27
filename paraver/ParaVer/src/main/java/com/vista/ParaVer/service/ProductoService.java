package com.vista.ParaVer.service;

import java.util.List;

import com.vista.ParaVer.entity.Producto;

public interface ProductoService {
	public List<Producto> ver();
	public Producto registrar(Producto producto);

}
