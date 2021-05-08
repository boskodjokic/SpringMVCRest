package com.bosko.springrest.api.v1.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class CategoryDTO {

    private Long id;

    @ApiModelProperty(value = "Name of the category", required = true)
    private String name;
}
