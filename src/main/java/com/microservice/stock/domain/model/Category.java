package com.microservice.stock.domain.model;
import static com.microservice.stock.domain.model.constant.CategoryConstant.LENGTH_NAME;
import static com.microservice.stock.domain.model.constant.CategoryConstant.LENGTH_DESCRIPTION;
public class Category {

    private Long id;
    private String name;
    private String description;

    public Category(Long id, String name, String description) {

        if (name == null || name.isEmpty() || name.length() > LENGTH_NAME ) {
            throw new IllegalArgumentException("El nombre no puede estar nulo o exceder 50 caracteres.");
        }
        if (description == null || description.isEmpty() || description.length() > LENGTH_DESCRIPTION) {
            throw new IllegalArgumentException("La descripción no puede estar nula, o exceder los 90 caracteres.");

        }


        this.id = id;
        this.name = name;
        this.description = description;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
