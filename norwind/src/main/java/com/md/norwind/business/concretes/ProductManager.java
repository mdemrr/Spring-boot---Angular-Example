package com.md.norwind.business.concretes;

import com.md.norwind.business.abstracts.projections.product.ProductDTO;
import com.md.norwind.business.abstracts.projections.product.ProductDto2;
import com.md.norwind.business.abstracts.projections.product.ProductInfo;
import com.md.norwind.business.abstracts.projections.product.ProductTestInfo;
import com.md.norwind.business.abstracts.services.ProductService;
import com.md.norwind.repositories.abstracts.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductManager implements ProductService {
    public  final ProductRepository productRepository;
    @Override
    public List<ProductInfo> getAll() {
        return productRepository.findBy(ProductInfo.class);
    }

    @Override
    public List<ProductTestInfo> getAllTest() {

        return productRepository.findBy(ProductTestInfo.class);
    }

    @Override
    public List<ProductDTO> getAllDTO() {
        var result =productRepository.findBy(ProductDTO.class);
        for (ProductDTO dto : result)
        {
            dto.setProductName("mehmet");
        }

        return result;
    }

}
