package com.vista.ParaVer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vista.ParaVer.entity.Producto;


@Repository
public interface ProductoRepository extends JpaRepository<Producto, String>{

}
