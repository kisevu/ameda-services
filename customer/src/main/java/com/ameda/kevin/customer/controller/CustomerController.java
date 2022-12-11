package com.ameda.kevin.customer.controller;

import com.ameda.kevin.customer.entity.Customer;
import com.ameda.kevin.customer.service.CustomerService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
@Slf4j
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/register")
    public Customer registerCustomer(@RequestBody Customer customer){
        log.info("inside register customer of controller class{}");
        return customerService.registerCustomer(customer);
    }
    @GetMapping("/{customerId}")
    public Customer findCustomer(@PathVariable("customerId") Long  customerId){
        log.info("inside the find customer method of the controller class{}");
        return  customerService.findCustomer(customerId);
    }

}
