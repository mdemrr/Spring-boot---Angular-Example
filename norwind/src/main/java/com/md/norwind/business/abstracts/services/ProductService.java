package com.md.norwind.business.abstracts.services;

import com.md.norwind.business.abstracts.projections.product.ProductDTO;
import com.md.norwind.business.abstracts.projections.product.ProductDto2;
import com.md.norwind.business.abstracts.projections.product.ProductInfo;
import com.md.norwind.business.abstracts.projections.product.ProductTestInfo;

import java.util.List;

public interface ProductService {
    List<ProductInfo> getAll();
    List<ProductTestInfo> getAllTest();

    List<ProductDTO> getAllDTO();
}
