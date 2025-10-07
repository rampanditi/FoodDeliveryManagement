package com.flmfoods.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.*;

@Entity
@Table(name= "delivery_assignments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryAssignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long deliveryAssignmentId;

    private String status;

    private LocalTime assignedTime;

    private long orderId;

    @ManyToOne
    @JoinColumn(name = "delivery_person_id", nullable = false)
    private DeliveryPerson deliveryPerson;
}
