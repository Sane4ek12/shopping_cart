package com.example.demo.mapstruct;

import com.example.demo.dto.OrderDetailDTO;
import com.example.demo.models.OrderDetail;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderDetailMapper {
    OrderDetail dtoToDetail(OrderDetailDTO orderDetailDTO);
    OrderDetailDTO detailToDto(OrderDetail orderDetail);
}
