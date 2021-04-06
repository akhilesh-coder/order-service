package com.spring.aws.cicd.example;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class OrderDao {

    public List<Order> getOrders(){
        return Stream.of(new Order("101","Mobile",10,25000),
                new Order("102","AC",20,1000000),
                new Order("103","TV",8,25000)
        ).collect(Collectors.toList());
    }
}
