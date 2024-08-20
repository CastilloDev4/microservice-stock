package com.microservice.stock.application.dto.response;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class CategoryResponseDTO {

        private Long categoryId;
        private String name;
        private String description;

}
