package com.example.aggregate.repository;

import com.example.aggregate.domain.Customer;
import com.example.aggregate.domain.Customer;

import java.util.List;

public interface CustomerRepository {
    void add(Customer customer);
    Customer getById(int id);
    List<Customer> get();
    void update(Customer customer);
    void delete(int id);
}

