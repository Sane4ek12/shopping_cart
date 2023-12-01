package com.example.demo.mapper;

import com.example.demo.dto.OrderDetailDTO;
import com.example.demo.models.OrderDetail;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Component
public class OrderDetailMapper {
    public OrderDetail dtoToDetail(OrderDetailDTO orderDetailDTO){
        return OrderDetail
                .builder()
                .id(orderDetailDTO.getId())
                .orderId(orderDetailDTO.getOrderId())
                .productId(orderDetailDTO.getProductId())
                .price(orderDetailDTO.getPrice())
                .quantity(orderDetailDTO.getQuantity())
                .build();
    }
    public OrderDetailDTO detailToDto(OrderDetail orderDetail){
        return OrderDetailDTO
                .builder()
                .id(orderDetail.getId())
                .orderId(orderDetail.getOrderId())
                .productId(orderDetail.getProductId())
                .price(orderDetail.getPrice())
                .quantity(orderDetail.getQuantity())
                .build();
    }
}
