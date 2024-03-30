package com.swiggy.payload;

import lombok.Data;

@Data
public class MenuDto {
    private long foodId;
    private String name;
    private String description;
    private double price;
}
