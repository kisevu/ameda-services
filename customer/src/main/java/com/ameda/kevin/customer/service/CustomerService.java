package com.ameda.kevin.customer.service;

import com.ameda.kevin.customer.entity.Customer;
import com.ameda.kevin.customer.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer registerCustomer(Customer customer) {
        log.info("inside the register customer of service class.{}");
       return  customerRepository.save(customer);
    }

    public Customer findCustomer(Long  customerId) {
        log.info("inside the find customer method of the service class.{}");
        return customerRepository.findByCustomerId(customerId);
    }
}
