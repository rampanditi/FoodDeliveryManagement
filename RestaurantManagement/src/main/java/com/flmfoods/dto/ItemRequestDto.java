package com.flmfoods.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemRequestDto {

    private String itemName;

    private double itemPrice;

    private String itemType;

    private String itemCategory;
}
