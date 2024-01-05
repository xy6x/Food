package com.example.foodtruck.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "abs")
public class FoodTruck{
    @Id
    private Integer id;
    private String License;
    private String startDate;
    private Integer NumberOfEmployee;
    private String city;
    private String cond;
    @OneToOne(cascade = CascadeType.ALL,mappedBy = "foodTruck")
    @PrimaryKeyJoinColumn
    private Services services;

    @ManyToOne
    @JoinColumn(name = "evaluation_id",referencedColumnName = "id")
    @JsonIgnore
    private Evaluation evaluation;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "foodTruck")
    private Set<Ticket> ticket;

}
