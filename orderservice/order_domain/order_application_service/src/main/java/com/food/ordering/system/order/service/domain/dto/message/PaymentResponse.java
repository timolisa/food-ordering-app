package com.food.ordering.system.order.service.domain.dto.message;

import com.simba.domain.valueobject.PaymentStatusVO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
public class PaymentResponse {
    private String id;
    private String sagaId;
    private String orderId;
    private String paymentId;
    private String customerId;
    private BigDecimal price;
    private Instant createdAt;
    private PaymentStatusVO paymentStatus;
    private List<String> failureMessages;
}
