package com.example.demo.controllers;

import com.example.demo.dto.OrderDTO;
import com.example.demo.enums.OrderStatus;
import com.example.demo.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping(value = "")
    public OrderDTO createOrder(@RequestBody OrderDTO toCreate) {
        return orderService.createOrder(toCreate);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable("id") long id) {
        orderService.deleteOrder(id);
    }

    @PutMapping(value = "/{id}")
    public OrderDTO changeOrderStatus(@PathVariable("id") long id, @RequestParam OrderStatus orderStatus) {
        return orderService.changeOrderStatus(id, orderStatus);
    }

    @GetMapping(value = "/{id}")
    public OrderDTO showOrderByID(@PathVariable("id") long id) {
        return orderService.showOrderByID(id);
    }
}
