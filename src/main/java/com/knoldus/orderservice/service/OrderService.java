package com.knoldus.orderservice.service;

import com.knoldus.orderservice.model.Order;
import com.knoldus.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    
    public Order placeOder(Order order){
        return orderRepository.save(order);
    }
    
    public Order getOrder(Long orderId){
        return orderRepository.getById(orderId);
    }
    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }
    public Order updateOrderStatus(Order order){
        return orderRepository.save(order);
    }
    
    public Order getOrderForPayment(){
        return orderRepository.findTopByOrderByIdDesc();
    }
}
