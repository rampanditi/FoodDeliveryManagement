package com.flmfoods.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Entity
@Table(name= "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderId;

    private String status;

    private double orderPrice;

    private long userId;

    private long restaurantId;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "order")
    private List<OrderItem> orderItems;
}
