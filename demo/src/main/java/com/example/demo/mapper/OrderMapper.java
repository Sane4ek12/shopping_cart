package com.example.demo.mapper;

import com.example.demo.dto.OrderDTO;
import com.example.demo.models.Order;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Component
public class OrderMapper {
    public Order dtoToOrder(OrderDTO orderDTO){
        return Order
                .builder()
                .id(orderDTO.getId())
                .orderStatus(orderDTO.getOrderStatus())
                .orderDate(orderDTO.getOrderDate())
                .customerId(orderDTO.getCustomerId())
                .paymentMethod(orderDTO.getPaymentMethod())
                .build();
    }
    public OrderDTO orderToDto(Order order){
        return OrderDTO
                .builder()
                .id(order.getId())
                .orderStatus(order.getOrderStatus())
                .orderDate(order.getOrderDate())
                .customerId(order.getCustomerId())
                .paymentMethod(order.getPaymentMethod())
                .build();
    }
}
