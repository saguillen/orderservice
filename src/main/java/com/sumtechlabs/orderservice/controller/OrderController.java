package com.sumtechlabs.orderservice.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import com.sumtechlabs.orderservice.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sumtechlabs.orderservice.entity.IEntity;
import com.sumtechlabs.orderservice.service.OrderService;


@RestController
public class OrderController {

	@Autowired
	OrderService orderService;

	@GetMapping(path = "/api/orderservice/order",  produces = { MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Order> getOrderData() {

		//  Crear una colección de pedidos
		ArrayList<Order> orders = orderService.getOrdersData();

		HashMap<String, Order> ordersHashmap = orderService.getOrdersDataHashMap();

		//TODO: Complete the code according what we request.
		//1 - Create a Collection of Orders
		//2 - Retrieve Order Entity info by Id number 100 .
		//3 - Filter Order by Client.
		//4 - Validate 

		try {

			Order orderToSearch = new Order();

			if(ordersHashmap.containsKey("100")) { // Order con ID 100

				orderToSearch = ordersHashmap.get("100");

			} else {

				return new ResponseEntity<>(HttpStatusCode.valueOf(204));
			}


			String clientName = "BMW"; // Busqueda por cliente especificado
			ArrayList<Order> filteredOrders = new ArrayList<>(); // Arreglo de Orders con el cliente especificado
			for (Order o : orders) {
				if (o.getAccount().equals(clientName)) {
					filteredOrders.add(o);
				}
			}

			// Valida que exista el Pedido con ID 100 y su cliente sea el especificado
			if(filteredOrders.isEmpty() || !filteredOrders.contains(orderToSearch)) {
				return new ResponseEntity<>(HttpStatusCode.valueOf(204)); // 204 No se encontraron Orders con ese Cliente
			}

			return new ResponseEntity<Order>(orderToSearch, HttpStatusCode.valueOf(200));

		} catch (Exception e) {

			return new ResponseEntity<>( HttpStatusCode.valueOf(500));

		}


	}


}
