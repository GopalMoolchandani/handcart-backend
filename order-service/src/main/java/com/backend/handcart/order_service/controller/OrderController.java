package com.backend.handcart.order_service.controller;

import com.backend.handcart.order_service.dto.OrderRequest;
import com.backend.handcart.order_service.dto.OrderResponse;
import com.backend.handcart.order_service.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/order")
@RequiredArgsConstructor
@Slf4j
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void placeOrder(@RequestBody OrderRequest orderRequest) {
        orderService.placeOrder(orderRequest);
        log.info("Order placed.............");
    }

}
