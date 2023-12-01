package com.example.demo.service;

import com.example.demo.dto.OrderDTO;
import com.example.demo.enums.OrderStatus;
import com.example.demo.mapstruct.OrderMapperImpl;
import com.example.demo.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    private final OrderMapperImpl orderMapper;

    public OrderDTO createOrder(OrderDTO toCreate) {
        return orderMapper.orderToDto(orderRepository.save(orderMapper.dtoToOrder(toCreate)));
    }

    public void deleteOrder(long orderId) {
        orderRepository.deleteById(orderId);
    }

    public OrderDTO changeOrderStatus(long id, OrderStatus orderStatus) {
        return orderRepository.findById(id).map(order -> {
            order.setOrderStatus(orderStatus);
            return orderMapper.orderToDto(orderRepository.save(order));
        }).get();
    }

    public OrderDTO showOrderByID(long id) {
        return orderRepository.findById(id).map(orderMapper::orderToDto).get();
    }
}
