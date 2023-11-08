export class SupplierModel
{
    public id :number;
    public address: String;
    public country : String;
    public region : String;
    public fax : String;
    public phone : String;
    public companyName : String;
    public contactTitle :String;
    public contactName :String;
    public postalCode : String;

  constructor(id: number, address: String, country: String, region: String, fax: String, phone: String, companyName: String, contactTitle: String, contactName: String, postalCode: String) {
    this.id = id;
    this.address = address;
    this.country = country;
    this.region = region;
    this.fax = fax;
    this.phone = phone;
    this.companyName = companyName;
    this.contactTitle = contactTitle;
    this.contactName = contactName;
    this.postalCode = postalCode;
  }
}
