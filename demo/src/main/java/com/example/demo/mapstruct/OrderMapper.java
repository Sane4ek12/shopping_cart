package com.example.demo.mapstruct;

import com.example.demo.dto.OrderDTO;
import com.example.demo.models.Order;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    Order dtoToOrder(OrderDTO orderDTO);
    OrderDTO orderToDto(Order order);
}
