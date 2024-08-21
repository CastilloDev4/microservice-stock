package com.microservice.stock.domain.spi;
import com.microservice.stock.domain.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICategoryPersistencePort {
    void  saveCategory (Category category);
    boolean existsByName(String name);
    Page<Category> getCategories(String order, Pageable Pageable);

}
