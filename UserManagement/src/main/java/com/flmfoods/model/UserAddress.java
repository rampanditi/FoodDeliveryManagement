package com.flmfoods.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name= "user_address")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userAddressId;

    private String doorNo;

    private String street;

    private String landmark;

    private String city;

    private String district;

    private String state;

    private String pincode;

    private String addressType;

}
