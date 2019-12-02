package com.productapp.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productapp.model.entities.Reviews;

@Repository
public interface ReviewsRepository extends JpaRepository<Reviews, Long>{

}
