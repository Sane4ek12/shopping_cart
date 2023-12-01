package com.example.demo.controllers;

import com.example.demo.dto.OrderDetailDTO;
import com.example.demo.service.OrderDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/details")
@RequiredArgsConstructor
public class OrderDetailController {

    private final OrderDetailService orderDetailService;

    @PostMapping("")
    public OrderDetailDTO addPosition(@RequestBody OrderDetailDTO toCreate) {
        return orderDetailService.addPosition(toCreate);
    }

    @DeleteMapping("/{id}")
    public void deletePosition(@PathVariable("id") long id) {
        orderDetailService.deletePosition(id);
    }

    @GetMapping("/{orderId}")
    public List<OrderDetailDTO> showAllByID(@PathVariable("orderId") long id) {
        return orderDetailService.showAllByID(id);
    }
}
