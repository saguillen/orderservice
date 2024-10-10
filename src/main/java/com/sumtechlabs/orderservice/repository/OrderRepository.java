package com.sumtechlabs.orderservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sumtechlabs.orderservice.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
