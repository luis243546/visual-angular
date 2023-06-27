import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Producto } from './producto';
import {Observable} from 'rxjs'
@Injectable({
  providedIn: 'root'
})
export class ProductoService {

  private baseURL = "Http://localhost:8080/ruta/productos"


  constructor(private httpClient : HttpClient) { 

  }

  obtenerListaDeProductos():Observable<Producto[]>{
    return this.httpClient.get<Producto[]>(`${this.baseURL}`);
  }
}
