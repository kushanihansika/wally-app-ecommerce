package com.example.order_service.dto;

import java.math.BigDecimal;

public record OrderItemResponse(
        String sku,
        int quantity,
        BigDecimal unitPrice
) {}
