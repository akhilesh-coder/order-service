package com.spring.aws.cicd.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/orders")
public class SpringAwsCicdExampleApplication {

    @Autowired
	private OrderDao order;

    @GetMapping
	public List<Order> getOrders(){
		return order.getOrders();
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringAwsCicdExampleApplication.class, args);
	}

}
