package com.example.demo.mapstruct;

import com.example.demo.dto.ProductDTO;
import com.example.demo.models.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    Product dtoToProduct(ProductDTO productDTO);

    ProductDTO productToDto(Product product);
}
