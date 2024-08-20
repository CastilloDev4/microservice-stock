package com.microservice.stock.application.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.validation.constraints.NotNull;



@Getter
@Setter
public class CategoryRequestDTO {

    public CategoryRequestDTO(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @NotBlank(message = "El nombre de categoria no puede estar vacio")
    @Size(max = 50, message = "El nombre de categoria no puede exceder los 50 caracteres")
    public String name;

    @NotBlank(message = "La descripcion de categoria no puede estar vacia")
    @Size(max = 90, message = "La descripcion de categoria no puede exceder los 90 caracteres")
    public String description;
}
