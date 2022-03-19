package com.knoldus.orderservice.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Setter
@Getter
@Component
public class Payment {
    private Long id;
    private Long orderId;
    private String paymentDate;
    private String paymentMethod;
    private String transactionId;
    private String paymentStatus;
}
