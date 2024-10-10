package com.sumtechlabs.orderservice.service;
import com.sumtechlabs.orderservice.entity.Order;
import com.sumtechlabs.orderservice.repository.OrderRepository;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl  implements OrderService{

	@Autowired
	OrderRepository orderRepository;
	
	  @Override
	    public ArrayList<Order> getOrdersData() {
	        return (ArrayList<Order>) orderRepository.findAll();
	    }
	  
	    public HashMap<String, Order> getOrdersDataHashMap() {
	    	ArrayList<Order> orders = (ArrayList<Order>) orderRepository.findAll();

	        HashMap<String, Order> ordersHashMap = new HashMap<>();

	        for (Order o : orders) {
	            ordersHashMap.put(o.getId()+"", o); // ID como clave, Order como valor
	        }

	        return ordersHashMap;
	    }
}
