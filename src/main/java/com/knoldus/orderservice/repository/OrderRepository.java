package com.knoldus.orderservice.repository;

import com.knoldus.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
    public Order findTopByOrderByIdDesc();
}
