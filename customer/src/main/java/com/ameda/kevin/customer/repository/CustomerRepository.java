package com.ameda.kevin.customer.repository;

import com.ameda.kevin.customer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository  extends JpaRepository<Customer,Long> {
    Customer findByCustomerId(Long customerId);
}
