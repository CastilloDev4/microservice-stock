package com.microservice.stock.application.handler;

import com.microservice.stock.application.dto.request.CategoryRequestDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICategoryHandler {

    void saveCategory(CategoryRequestDTO category);
    Page<CategoryRequestDTO> getCategories(String order, Pageable pageable);


}
