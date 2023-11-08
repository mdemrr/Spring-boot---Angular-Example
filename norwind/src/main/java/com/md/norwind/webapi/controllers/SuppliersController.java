package com.md.norwind.webapi.controllers;

import com.md.norwind.business.abstracts.projections.supplier.SupplierInfo;
import com.md.norwind.business.abstracts.services.SupplierService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/suppliers")
@RequiredArgsConstructor
public class SuppliersController {

    private final SupplierService supplierService;
    @GetMapping("get-all")
    List<SupplierInfo> getAll()
    {
        return supplierService.getAll() ;
    }
}
