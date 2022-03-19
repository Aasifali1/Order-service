package com.knoldus.orderservice.controller;

import com.knoldus.orderservice.model.Order;
import com.knoldus.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class OrderController {
    @Autowired
    OrderService orderService;
    
    @PostMapping("/orders")
    public Order placeOrder(@RequestBody Order order){
        order.setOrderStatus("pending");
        order.setDate(java.time.LocalDate.now().toString());
        return orderService.placeOder(order);
    }
    @PutMapping("/orders/{orderId}")
    public Order updateOrderStatus(@PathVariable("orderId") Long orderId, @RequestBody Order order){
        return orderService.updateOrderStatus(order);
    }
    @GetMapping("/orders/{orderId}")
    public Order getOrder(@PathVariable("orderId") long orderId){
        return orderService.getOrder(orderId);
    }
    @GetMapping("/orders")
    public List<Order> getAllOrders(){
        return orderService.getAllOrders();
    }
    
    @GetMapping("/orders/payment")
    public Order getLastOrder(){
        return orderService.getOrderForPayment();
    }
}
