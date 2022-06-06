package com.reverside.kutloano.dao;

import com.reverside.kutloano.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
