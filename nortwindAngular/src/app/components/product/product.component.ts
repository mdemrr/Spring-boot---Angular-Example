import { Component } from '@angular/core';
import {ProductService} from "../../services/product.service";
import {ProductModel} from "../../models/ProductModel";

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent {

  public products: ProductModel[] = [];
  constructor(private productService : ProductService) {
  }
  public getProductsClick()
  {
    this.productService.getAll().subscribe(products=> {
        this.products = products;
        console.log(products);
      }
    );
  }
  getProductById(id:number) :ProductModel
  {
    return this.products.find(r=>r.id ===id) as ProductModel
  }
  getProducts() : ProductModel[]
  {
    return this.products;
  }

  protected readonly ProductModel = ProductModel;
}
