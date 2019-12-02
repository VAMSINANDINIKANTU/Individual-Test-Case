package com.productapp.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productapp.model.entities.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>{

}
