package com.flmfoods.model;

import jakarta.persistence.*;
import lombok.*;


import java.util.*;

@Entity
@Table(name= "delivery_person")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryPerson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long deliveryPersonId;

    private String deliveryPersonName;

    private String aadharNum;

    private String phoneNum;

    private String email;

    private boolean isAvailable;

    private double rating;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "deliveryPerson")
    private List<DeliveryAssignment> deliveryAssignments;
}
