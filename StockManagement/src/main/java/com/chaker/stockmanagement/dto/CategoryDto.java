package com.chaker.stockmanagement.dto;

import com.chaker.stockmanagement.model.Category;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CategoryDto {
    private Integer id;

    private String code;

    private String designation;

    @JsonIgnore
    private List<ArticleDto> listeArticles;

    public CategoryDto fromEntity(Category category){
        if(category == null){
            return null;
            //TODO throw an exception
        }

        return CategoryDto.builder()
                .code(category.getCode())
                .designation(category.getDesignation())
                .id(category.getId())
                .build();
    }
    public Category toEntity(CategoryDto categoryDto){
        if (categoryDto == null){
            return null;
            //TODO throw an exception
        }
        return Category.builder()
                .code(categoryDto.getCode())
                .designation(categoryDto.getDesignation())
                .build();
    }
}
