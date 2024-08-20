package com.microservice.stock.application.handler.IMPL;

import com.microservice.stock.application.dto.request.CategoryRequestDTO;
import com.microservice.stock.application.handler.ICategoryHandler;
import com.microservice.stock.application.mapper.ICategoryMapperDTO;
import com.microservice.stock.domain.api.ICategoryServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
public class CategoryHandlerIMPL implements ICategoryHandler {

    private final ICategoryServicePort categoryServicePort;
    private final ICategoryMapperDTO categoryMapperDTO;

    public CategoryHandlerIMPL(ICategoryServicePort categoryServicePort, ICategoryMapperDTO categoryMapperDTO) {
        this.categoryServicePort = categoryServicePort;
        this.categoryMapperDTO = categoryMapperDTO;
    }

    @Override
    public void saveCategory(CategoryRequestDTO category) {
        categoryServicePort.saveCategory(categoryMapperDTO.toCategory(category));
    }
}
