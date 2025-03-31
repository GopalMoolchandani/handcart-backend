package com.backend.handcart.order_service.dto;

import com.backend.handcart.order_service.model.OrderLineItems;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderResponse {
    private long id;
    private String orderNumber;
    private List<OrderLineItems> orderLineItemsList;
}
