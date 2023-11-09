package com.md.norwind.webapi.controllers;

import com.md.norwind.business.abstracts.projections.product.ProductDTO;
import com.md.norwind.business.abstracts.projections.product.ProductDto2;
import com.md.norwind.business.abstracts.projections.product.ProductInfo;
import com.md.norwind.business.abstracts.projections.product.ProductTestInfo;
import com.md.norwind.business.abstracts.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/products")
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders="*")
public class ProductsController {
    private final ProductService productService;
    @GetMapping("get-all")
    List<ProductInfo> getAll()
    {
       // var result = productService.getAll().toArray();
        return productService.getAll();
    }

    @GetMapping("get-test")
    List<ProductTestInfo> getTest()
    {
        List<ProductTestInfo> infos=productService.getAllTest();
        for (ProductTestInfo info : infos)
        {
           // info.setProductName("mehmet");
          //  info.setProductName("Mehmet");
        }
        return infos; //productService.getAllTest();
    }

    @GetMapping("get-dto")
    List<ProductDTO> getDTO()
    {
        return productService.getAllDTO();
    }
}
