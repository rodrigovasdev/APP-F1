import { Component, OnInit} from '@angular/core';
import { Carrera} from '../../models/carrera.model';
import { CommonModule } from '@angular/common';
import { ServicioAppService } from '../../services/servicio-app.service';
import { HttpClientModule } from '@angular/common/http';
import { NgxPaginationModule } from 'ngx-pagination';


@Component({
  selector: 'app-lista',
  standalone: true,
  imports: [CommonModule, HttpClientModule,NgxPaginationModule],
  providers: [ServicioAppService],
  templateUrl: './lista.component.html',
  styleUrl: './lista.component.css'
})



export class ListaComponent{
  carreras: Carrera[] | any = [];
  itemsPorPagina = 10; 
  paginaActual = 1; 

  elementosSuperiores = [
    { nombre: 'Elemento Superior 1' },
    { nombre: 'Elemento Superior 2' }
  ];


  constructor(private service:ServicioAppService){
  }

  ngOnInit() {
    this.service.obtenerInfo().subscribe((valor) =>{
      console.log(valor)
      this.carreras = valor;

    })
  }

  cambiarPagina(nuevaPagina: number) {
    this.paginaActual = nuevaPagina;
}
}


