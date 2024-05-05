package com.example.HomeworkAboutInnerJoinWithSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CustomerRepository customerRepository;

    public List<CustomerEntity> findCustomersWithOrders() {
        return orderRepository.findCustomersWithOrders();
    }

    public OrderEntity createOrder(Long customerId, Long productId) {
        OrderEntity order = new OrderEntity();
        order.setCustomerId(customerId);
        order.setProductId(productId);
        return orderRepository.save(order);
    }
}





