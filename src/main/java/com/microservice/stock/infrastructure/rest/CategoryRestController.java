package com.microservice.stock.infrastructure.rest;


import com.microservice.stock.infrastructure.exceptions.CategoryExceptions;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.microservice.stock.application.dto.request.CategoryRequestDTO;
import org.springframework.http.HttpStatus;

import com.microservice.stock.application.handler.ICategoryHandler;



@RestController
@RequestMapping("/api/category")
public class CategoryRestController {

    private final ICategoryHandler categoryHandler;

    // Constructor manual para inyección de dependencias
    public CategoryRestController(ICategoryHandler categoryHandler) {
        this.categoryHandler = categoryHandler;
    }



    @PostMapping("/categoria")
    public ResponseEntity<String> saveCategory(@RequestBody CategoryRequestDTO category) {
        try {
            categoryHandler.saveCategory(category);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (CategoryExceptions e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("EL nombre ya existe");
        }
    }



}
