package com.flmfoods.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressResponseDto {
    private long addressId;

    private String landmark;

    private String city;

    private String pincode;

    private String state;

}
