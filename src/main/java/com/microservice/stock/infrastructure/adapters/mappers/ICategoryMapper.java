package com.microservice.stock.infrastructure.adapters.mappers;
import com.microservice.stock.infrastructure.adapters.entities.CategoryEntity;
import org.mapstruct.Mapper;
import com.microservice.stock.domain.model.Category;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel = "spring")


public interface ICategoryMapper {
        @Mapping(target = "name",source = "name")
        @Mapping(target = "description",source = "description")
        CategoryEntity toCategoryEntity(Category category);




}
