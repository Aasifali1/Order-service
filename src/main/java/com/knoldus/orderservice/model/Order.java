package com.knoldus.orderservice.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "orders")
public class Order {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private Long customerId;
    private Long productId;
    private int quantity;
    private String orderStatus;
    private String orderTrack;
    private String date;
    private double amount;
}
