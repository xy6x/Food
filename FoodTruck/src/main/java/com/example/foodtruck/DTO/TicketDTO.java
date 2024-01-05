package com.example.foodtruck.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TicketDTO {
    private String status;
    private Integer food_truck_id;
    private Integer order_id;

}
