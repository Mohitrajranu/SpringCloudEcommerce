package com.devd.spring.bookstorecatalogservice.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author: Devaraj Reddy,
 * Date : 2019-06-06
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductRequest {

    @NotNull(message = "productName should not be null!")
    @NotEmpty(message = "productName should not be empty!")
    private String productName;

    private String description;

    @Min(value = 0)
    private double price;

    private String imageId;

    @NotNull(message = "productCategoryId should not be null!")
    @NotEmpty(message = "productCategoryId should not be empty!")
    private String productCategoryId;

    private int availableItemCount;

}
