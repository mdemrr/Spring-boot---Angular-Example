package com.md.norwind.business.concretes;

import com.md.norwind.business.abstracts.projections.supplier.SupplierInfo;
import com.md.norwind.business.abstracts.services.SupplierService;
import com.md.norwind.repositories.abstracts.SupplierRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Getter
@Setter
public class SupplierManagar implements SupplierService {
    private final SupplierRepository supplierRepository;

    @Override
    public List<SupplierInfo> getAll() {
       // ArrayList<SupplierInfo> supplierInfos = new ArrayList<>();
       // supplierRepository.findAllProject().forEach(r->supplierInfos.add( (SupplierInfo) r));
       // return supplierInfos;
       return supplierRepository.findProjectBy(SupplierInfo.class);
    }
}
