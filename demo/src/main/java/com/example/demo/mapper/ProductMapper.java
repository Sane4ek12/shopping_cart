package com.example.demo.mapper;

import com.example.demo.dto.ProductDTO;
import com.example.demo.models.Product;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Component
public class ProductMapper {
    public Product dtoToProduct(ProductDTO productDTO) {
        return Product
                .builder()
                .id(productDTO.getId())
                .name(productDTO.getName())
                .price(productDTO.getPrice())
                .description(productDTO.getDescription())
                .inStock(productDTO.isInStock())
                .build();
    }

    public ProductDTO productToDto(Product product) {
        return ProductDTO
                .builder()
                .id(product.getId())
                .name(product.getName())
                .price(product.getPrice())
                .description(product.getDescription())
                .inStock(product.isInStock())
                .build();
    }
}
