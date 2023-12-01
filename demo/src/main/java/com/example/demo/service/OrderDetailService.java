package com.example.demo.service;

import com.example.demo.dto.OrderDetailDTO;
import com.example.demo.mapstruct.OrderDetailMapperImpl;
import com.example.demo.repository.OrderDetailsRepository;
import com.example.demo.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderDetailService {

    private final OrderDetailsRepository orderDetailsRepository;
    private final ProductRepository productRepository;
    private final OrderDetailMapperImpl orderDetailMapper;

    public OrderDetailDTO addPosition(OrderDetailDTO toCreate) {
        int price = productRepository.findById(toCreate.getProductId()).get().getPrice();
        toCreate.setPrice(price);
        return orderDetailMapper.detailToDto(orderDetailsRepository.saveAndFlush(orderDetailMapper.dtoToDetail(toCreate)));
    }

    public void deletePosition(long id) {
        orderDetailsRepository.deleteById(id);
    }

    public List<OrderDetailDTO> showAllByID(long id) {
        return orderDetailsRepository.findAllByOrderId(id).stream().map(orderDetailMapper::detailToDto).toList();
    }
}
