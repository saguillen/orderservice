package com.sumtechlabs.orderservice.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.sumtechlabs.orderservice.entity.Order;

public interface OrderService {

	ArrayList<Order> getOrdersData();
	
	HashMap<String, Order> getOrdersDataHashMap();

	
}
