package com.md.norwind.business.abstracts.projections.product;

import com.md.norwind.business.abstracts.projections.supplier.SupplierInfo;

/**
 * Projection for {@link com.md.norwind.entities.concrites.Product}
 */
public interface ProductInfo {
    Integer getId();

    String getProductName();

    Integer getSupplierId();

    SupplierInfo getSupplier();

}