//package com.knoldus.orderservice.service;
//
//import com.knoldus.orderservice.model.Order;
//import com.knoldus.orderservice.model.Payment;
//import com.knoldus.orderservice.repository.OrderRepository;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Service;
//
//import java.io.IOException;
//
//@Service
//public class ConsumerService {
//
//    @Autowired
//    OrderRepository orderRepository;
//
//    private final Logger logger = LoggerFactory.getLogger(ConsumerService.class);
//
//    @KafkaListener(topics = "order-status", groupId = "group_id")
//    public void consumeFromTopic(String status) throws IOException {
//        String statusArr[] = status.split("\\s");
//        Order order = orderRepository.findById(Long.valueOf(statusArr[1])).get();
//        order.setOrderStatus("order placed");
//        order.setOrderTrack("Processed");
//        if(statusArr[0].equals("2")){
//            order.setOrderTrack("Shipped");
//        }else if(statusArr[0].equals("3")){
//            order.setOrderTrack("Dispatched");
//        }else if(statusArr[0].equals("4")){
//            order.setOrderTrack("En Route");
//        }else if(statusArr[0].equals("5")){
//            order.setOrderTrack("Arrived");
//        }else {
//            logger.info("Invalid Input for tracking status");
//        }
//        orderRepository.save(order);
//        logger.info(String.format("#### -> Consumed Id -> %s",statusArr[0]+statusArr[1]));
//    }
//}
