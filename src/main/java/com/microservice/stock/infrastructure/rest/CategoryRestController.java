package com.microservice.stock.infrastructure.rest;


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
    public ResponseEntity<Void> saveCategory(@RequestBody CategoryRequestDTO category) {
        categoryHandler.saveCategory(category);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    // Endpoint de prueba
    @GetMapping("/hello")
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Hello, World!");
    }
}
