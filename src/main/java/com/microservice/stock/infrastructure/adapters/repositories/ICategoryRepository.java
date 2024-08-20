package com.microservice.stock.infrastructure.adapters.repositories;
import com.microservice.stock.domain.model.Category;
import com.microservice.stock.infrastructure.adapters.entities.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<CategoryEntity, Long> {



    boolean existsByName(String name);



}
