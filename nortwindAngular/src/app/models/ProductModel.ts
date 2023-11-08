import {SupplierModel} from "./SupplierModel";

export class ProductModel
{
  public supplierId : number;
  public id : number;
  public productName : String;
  public supplier : SupplierModel;


  constructor(supplierId: number, id: number, productName: String, supplier: SupplierModel) {
    this.supplierId = supplierId;
    this.id = id;
    this.productName = productName;
    this.supplier = supplier;
  }
}
