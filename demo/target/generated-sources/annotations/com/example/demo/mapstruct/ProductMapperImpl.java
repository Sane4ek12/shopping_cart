package com.example.demo.mapstruct;

import com.example.demo.dto.ProductDTO;
import com.example.demo.models.Product;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-02T02:25:14+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 18.0.1.1 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Product dtoToProduct(ProductDTO productDTO) {
        if ( productDTO == null ) {
            return null;
        }

        Product.ProductBuilder product = Product.builder();

        product.id( productDTO.getId() );
        product.name( productDTO.getName() );
        product.price( productDTO.getPrice() );
        product.description( productDTO.getDescription() );
        product.inStock( productDTO.isInStock() );

        return product.build();
    }

    @Override
    public ProductDTO productToDto(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDTO.ProductDTOBuilder productDTO = ProductDTO.builder();

        productDTO.id( product.getId() );
        productDTO.name( product.getName() );
        productDTO.price( product.getPrice() );
        productDTO.description( product.getDescription() );
        productDTO.inStock( product.isInStock() );

        return productDTO.build();
    }
}
