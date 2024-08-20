package com.microservice.stock.domain.usecase;

import com.microservice.stock.domain.api.ICategoryServicePort;
import com.microservice.stock.domain.model.Category;
import com.microservice.stock.domain.spi.ICategoryPersistencePort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;




@Component
public class CategoryUserCase implements ICategoryServicePort {


    //dependency injection

    private final ICategoryPersistencePort categoryPersistencePort;

    public CategoryUserCase(ICategoryPersistencePort categoryPersistencePort) {
        this.categoryPersistencePort = categoryPersistencePort;
    }


    @Override
    public void saveCategory(Category category) {
        categoryPersistencePort.saveCategory(category);
    }

    @Override
    public boolean existsByName(String name) {
        return categoryPersistencePort.existsByName(name);

    }
}
