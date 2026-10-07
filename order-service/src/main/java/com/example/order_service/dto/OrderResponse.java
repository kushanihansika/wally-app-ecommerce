package com.example.order_service.dto;

import com.example.order_service.entity.OrderStatus;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.UUID;

public record OrderResponse(
        UUID orderId,
        OrderStatus status,
        String customerId,
        String customerEmail,
        List<OrderItemResponse> items,
        BigDecimal totalAmount,
        String currency,
        Instant createdAt,
        Instant updatedAt
) {}