package com.example.foodtruck.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AddressDTO {
    private  String address;
    private String startDate;
    private Integer NumberWeek;
    private String city;
    private String street;
    private Integer user_id;
}
