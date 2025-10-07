package com.flmfoods.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Entity
@Table(name= "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;

    private String userName;

    private String phoneNum;

    private String email;

    private String password;

    @OneToMany
    @JoinColumn(name = "user_address_id")
    private List<UserAddress> userAddresses;
}
