package com.microservice.stock.infrastructure.adapters.repositories;
import com.microservice.stock.infrastructure.adapters.entities.CategoryEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Pageable;

public interface ICategoryRepository extends JpaRepository<CategoryEntity, Long> {



    boolean existsByName(String name);
    Page<CategoryEntity> findAll(Pageable pageable);



}
