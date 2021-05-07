package com.bosko.springrest.repository;

import com.bosko.springrest.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

//    Customer findById(Long id);
//    Customer findByLastName(String lastName);

}
