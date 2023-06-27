import { Component, OnInit } from '@angular/core';
import { Producto } from '../producto';
import { ProductoService } from '../producto.service';

@Component({
  selector: 'app-producto',
  templateUrl: './producto.component.html',
  styleUrls: ['./producto.component.css']
})
export class ProductoComponent implements OnInit{
    
    productos : Producto[];

    constructor (private productoServicio:ProductoService){}

    ngOnInit(): void {
      this.obtenerProductos();
    }

    private obtenerProductos(){
      this.productoServicio.obtenerListaDeProductos().subscribe(dato =>{
        this.productos = dato;
      });
    }
  }


