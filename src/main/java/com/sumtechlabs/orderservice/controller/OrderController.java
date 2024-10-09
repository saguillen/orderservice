package com.sumtechlabs.orderservice.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sumtechlabs.orderservice.entity.IEntity;


@RestController
public class OrderController {
	
	@GetMapping(path = "/api/orderservice/order",  produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<IEntity> getOrderData() {
		
		//TODO: Complete the code according what we request.
		//1 - Create a Collection of Orders
		//2 - Retrieve Order Entity info by Id number 100 .
		//3 - Filter Order by Client.
		//4 - Validate 
		
		return null;
	}

}
