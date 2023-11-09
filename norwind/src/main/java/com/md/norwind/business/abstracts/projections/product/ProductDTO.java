package com.md.norwind.business.abstracts.projections.product;

import com.md.norwind.business.abstracts.projections.supplier.SupplierInfo;
import com.md.norwind.entities.concrites.Category;
import com.md.norwind.entities.concrites.Supplier;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Getter
@Setter
public class ProductDTO {
    private Integer id;
    private String productName;
    private Integer supplierId;
    private String supplierAddress;
    private Category category;
    private Supplier supplier;
}
