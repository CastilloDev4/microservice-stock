package com.microservice.stock.domain.api;

import com.microservice.stock.domain.model.Category;
import com.microservice.stock.domain.usecase.CategoryUserCase;
import com.microservice.stock.infrastructure.adapters.CategoryMysqlAdapter;
import org.springframework.context.annotation.Bean;


public interface ICategoryServicePort {

    void saveCategory (Category category);
    boolean existsByName(String name);




}
