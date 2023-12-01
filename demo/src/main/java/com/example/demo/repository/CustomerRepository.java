package com.example.demo.repository;

import com.example.demo.models.Customer;
import com.example.demo.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
