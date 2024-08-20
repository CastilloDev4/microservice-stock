package com.microservice.stock.application.handler;

import com.microservice.stock.application.dto.request.CategoryRequestDTO;

public interface ICategoryHandler {

    void saveCategory(CategoryRequestDTO category);

}
