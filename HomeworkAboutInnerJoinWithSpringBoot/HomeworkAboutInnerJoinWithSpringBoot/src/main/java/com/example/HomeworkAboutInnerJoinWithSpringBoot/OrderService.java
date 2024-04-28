package com.example.HomeworkAboutInnerJoinWithSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public OrderEntity createOrder(Long customerId, Long productId) {
        OrderEntity order = new OrderEntity();
        order.setCustomerId(customerId);
        order.setProductId(productId);
        return orderRepository.save(order);
    }
}

