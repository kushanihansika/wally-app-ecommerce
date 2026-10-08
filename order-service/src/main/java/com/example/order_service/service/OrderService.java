package com.example.order_service.service;

import com.example.order_service.dto.CreateOrderRequest;
import com.example.order_service.dto.OrderResponse;

import java.util.List;
import java.util.UUID;

public interface OrderService {

    OrderResponse createOrder(CreateOrderRequest request);

    OrderResponse getOrder(UUID orderId);

    List<OrderResponse> getOrdersByCustomer(String customerId);
}
