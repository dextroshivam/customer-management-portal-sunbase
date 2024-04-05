package com.customermanagementportal3.repository;

import com.customermanagementportal3.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    public Customer findByLoginId(String loginId);
}
