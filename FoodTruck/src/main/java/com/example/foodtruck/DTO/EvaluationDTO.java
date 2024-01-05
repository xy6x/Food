package com.example.foodtruck.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EvaluationDTO {
    private Integer number;
    private String comment;
    private Integer food_truck_id;
    private Integer ticket_order_id;
}
