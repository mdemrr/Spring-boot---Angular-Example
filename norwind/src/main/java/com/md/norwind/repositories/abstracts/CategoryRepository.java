package com.md.norwind.repositories.abstracts;

import com.md.norwind.entities.concrites.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    <U> List<U> findBy(Class<U> uClass);
}