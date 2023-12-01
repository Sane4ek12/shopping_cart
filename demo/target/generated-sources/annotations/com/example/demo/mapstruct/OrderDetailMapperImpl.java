package com.example.demo.mapstruct;

import com.example.demo.dto.OrderDetailDTO;
import com.example.demo.models.OrderDetail;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-02T02:25:14+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 18.0.1.1 (Oracle Corporation)"
)
@Component
public class OrderDetailMapperImpl implements OrderDetailMapper {

    @Override
    public OrderDetail dtoToDetail(OrderDetailDTO orderDetailDTO) {
        if ( orderDetailDTO == null ) {
            return null;
        }

        OrderDetail.OrderDetailBuilder orderDetail = OrderDetail.builder();

        orderDetail.id( orderDetailDTO.getId() );
        orderDetail.orderId( orderDetailDTO.getOrderId() );
        orderDetail.productId( orderDetailDTO.getProductId() );
        orderDetail.price( orderDetailDTO.getPrice() );
        orderDetail.quantity( orderDetailDTO.getQuantity() );

        return orderDetail.build();
    }

    @Override
    public OrderDetailDTO detailToDto(OrderDetail orderDetail) {
        if ( orderDetail == null ) {
            return null;
        }

        OrderDetailDTO.OrderDetailDTOBuilder orderDetailDTO = OrderDetailDTO.builder();

        orderDetailDTO.id( orderDetail.getId() );
        orderDetailDTO.orderId( orderDetail.getOrderId() );
        orderDetailDTO.productId( orderDetail.getProductId() );
        orderDetailDTO.price( orderDetail.getPrice() );
        orderDetailDTO.quantity( orderDetail.getQuantity() );

        return orderDetailDTO.build();
    }
}
