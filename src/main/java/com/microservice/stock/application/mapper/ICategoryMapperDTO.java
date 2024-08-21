package com.microservice.stock.application.mapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import com.microservice.stock.application.dto.request.CategoryRequestDTO;
import com.microservice.stock.domain.model.Category;


@Mapper(componentModel = "spring")
public interface ICategoryMapperDTO {

    @Mapping(target = "name",source = "name")
    @Mapping(target = "description",source = "description")
    @Mapping(target = "id", ignore = true)
    Category toCategory(CategoryRequestDTO categoryRequestDto);

    @Mapping(target = "name",source = "name")
    @Mapping(target = "description",source = "description")

    CategoryRequestDTO toCategoryRequestDTO(Category category);

}
