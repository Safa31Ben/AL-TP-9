package com.javatechie.orderservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ORDER_TB")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    private int id;
    private String name;
    private int qty;
    private double price;
}
