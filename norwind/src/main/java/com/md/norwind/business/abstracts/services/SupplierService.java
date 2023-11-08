package com.md.norwind.business.abstracts.services;

import com.md.norwind.business.abstracts.projections.supplier.SupplierInfo;

import java.util.List;

public interface  SupplierService  {
    List<SupplierInfo> getAll();
}
