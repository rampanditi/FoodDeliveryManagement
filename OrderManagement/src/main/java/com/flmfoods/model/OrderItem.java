package com.flmfoods.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name= "order_items")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderItemId;

    private int quantity;

    private long itemId;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
}
