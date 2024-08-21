package com.microservice.stock.domain.api;

import com.microservice.stock.domain.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface ICategoryServicePort {

    void saveCategory (Category category);
    boolean existsByName(String name);
    Page<Category> getCategories(String order, Pageable Pageable);





}
