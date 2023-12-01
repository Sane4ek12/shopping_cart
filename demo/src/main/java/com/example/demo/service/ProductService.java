package com.example.demo.service;

import com.example.demo.dto.ProductDTO;
import com.example.demo.mapstruct.ProductMapperImpl;
import com.example.demo.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductMapperImpl productMapper;
    private final ProductRepository productRepository;

    public List<ProductDTO> showAllProducts() {
        return productRepository.findByInStock(true).stream().map(productMapper::productToDto).toList();
    }
}
