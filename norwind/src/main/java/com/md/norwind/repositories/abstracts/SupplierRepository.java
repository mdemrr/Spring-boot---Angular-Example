package com.md.norwind.repositories.abstracts;

import com.md.norwind.entities.concrites.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
     //List<ProjectionInfo> findAllProject();
    <U> List<U> findProjectBy(Class<U> uClass);
}