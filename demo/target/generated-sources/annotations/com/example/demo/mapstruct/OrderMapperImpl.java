package com.example.demo.mapstruct;

import com.example.demo.dto.OrderDTO;
import com.example.demo.models.Order;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-02T02:25:14+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 18.0.1.1 (Oracle Corporation)"
)
@Component
public class OrderMapperImpl implements OrderMapper {

    @Override
    public Order dtoToOrder(OrderDTO orderDTO) {
        if ( orderDTO == null ) {
            return null;
        }

        Order.OrderBuilder order = Order.builder();

        order.id( orderDTO.getId() );
        order.orderDate( orderDTO.getOrderDate() );
        order.orderStatus( orderDTO.getOrderStatus() );
        order.paymentMethod( orderDTO.getPaymentMethod() );
        order.customerId( orderDTO.getCustomerId() );

        return order.build();
    }

    @Override
    public OrderDTO orderToDto(Order order) {
        if ( order == null ) {
            return null;
        }

        OrderDTO.OrderDTOBuilder orderDTO = OrderDTO.builder();

        orderDTO.id( order.getId() );
        orderDTO.orderDate( order.getOrderDate() );
        orderDTO.orderStatus( order.getOrderStatus() );
        orderDTO.paymentMethod( order.getPaymentMethod() );
        orderDTO.customerId( order.getCustomerId() );

        return orderDTO.build();
    }
}
