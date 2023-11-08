import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {ProductModel} from "../models/ProductModel";
import {Observable} from "rxjs";


@Injectable({
  providedIn: 'root'
})
export class ProductService {

  private baseUrl :String = "http://127.0.0.1:8080/api/";
  constructor(private http : HttpClient) {}
  public getAll () : Observable<ProductModel[]>
  {
    return this.http.get<ProductModel[]>(this.baseUrl+ "products/get-all",
      {
        headers: {"AllowedOrigin": "*" ,"AllowedHeader":"*","AllowedMethod":"*"}
      }

      );
  }
}
