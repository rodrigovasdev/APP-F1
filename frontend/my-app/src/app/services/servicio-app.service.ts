import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {Observable} from "rxjs";


@Injectable({
  providedIn: 'root'
})
export class ServicioAppService {

  constructor(private httpClient:HttpClient) {
  }

  obtenerInfo(): Observable<any>{
      let url = "http://localhost:8080/api/results"
      return this.httpClient.get(url);
  }
}
