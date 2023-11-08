package com.md.norwind.repositories.abstracts;

import com.md.norwind.entities.concrites.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
  //<U> List<U> findProjectBy(Class<U> uClass);
  <U> List<U> findBy(Class<U> uClass);
}