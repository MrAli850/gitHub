package com.example.HomeworkAboutInnerJoinWithSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;
    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }



    public CustomerEntity createCustomer(String name, String surname, String email) {
        CustomerEntity customer = new CustomerEntity();
        customer.setName(name);
        customer.setSurname(surname);
        customer.setEmail(email);
        return customerRepository.save(customer);
    }

    public CustomerEntity getCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }
}

