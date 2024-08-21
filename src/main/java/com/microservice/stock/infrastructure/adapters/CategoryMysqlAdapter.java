package com.microservice.stock.infrastructure.adapters;

import com.microservice.stock.domain.model.Category;
import com.microservice.stock.domain.spi.ICategoryPersistencePort;
import com.microservice.stock.infrastructure.adapters.mappers.ICategoryMapper;
import com.microservice.stock.infrastructure.adapters.repositories.ICategoryRepository;
import com.microservice.stock.infrastructure.exceptions.CategoryExceptions;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.data.domain.Sort;
import com.microservice.stock.infrastructure.adapters.entities.CategoryEntity;

@Component
public class CategoryMysqlAdapter implements ICategoryPersistencePort {

    private final ICategoryRepository categoryRepository;
    private final ICategoryMapper categoryMapper;

    public CategoryMysqlAdapter(ICategoryRepository categoryRepository, ICategoryMapper categoryMapper) {
        this.categoryRepository = categoryRepository;
        this.categoryMapper = categoryMapper;
    }

    @Override
    public void saveCategory(Category category) {
        categoryRepository.save(categoryMapper.toCategoryEntity(category));
    }

    @Override
    public boolean existsByName(String name) {
        return categoryRepository.existsByName(name);
    }

    @Override
    public Page<Category> getCategories(String order, Pageable pageable) {
        if (order.equalsIgnoreCase("asc")){
            return mapCategoryEntityToCategory(categoryRepository.findAll(sortPageAscending(pageable)));
        }
        if (order.equalsIgnoreCase("dsc")){
            return mapCategoryEntityToCategory(categoryRepository.findAll(sortPageDescending(pageable)));
        }
        throw new CategoryExceptions("Ordenamiento no valido");
    }

    private Pageable sortPageDescending(Pageable pageable) {
        Sort sort = Sort.by("name").descending();
        return PageRequest.of(pageable.getPageNumber(), pageable.getPageSize(), sort);
    }

    private Pageable sortPageAscending(Pageable pageable) {
        Sort sort = Sort.by("name").ascending();
        return PageRequest.of(pageable.getPageNumber(), pageable.getPageSize(), sort);
    }

    private Page<Category>mapCategoryEntityToCategory(Page<CategoryEntity> page){
        return page.map(categoryMapper::toCategory);
    }
    }





