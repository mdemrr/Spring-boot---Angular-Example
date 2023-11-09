package com.md.norwind.business.abstracts.projections.product;

import com.md.norwind.entities.concrites.SupplierDto;
import lombok.*;

import java.io.Serializable;

/**
 * DTO for {@link com.md.norwind.entities.concrites.Product}
 */
@Setter
@Getter

@AllArgsConstructor

public class ProductDto2  {
   private  Integer id;
   private String productName;
   private String supplierCompanyName;

    //SupplierDto supplier;
}