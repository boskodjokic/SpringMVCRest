package com.bosko.springrest.api.v1.mapper;

import com.bosko.springrest.api.v1.model.CategoryDTO;
import com.bosko.springrest.domain.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryDTO categoryToCategoryDTO(Category category);
}
