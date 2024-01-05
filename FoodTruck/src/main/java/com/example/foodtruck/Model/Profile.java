package com.example.foodtruck.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Profile {
    @Id
    private Integer id;
    private String name;
    private String address;
    private String description;
    private LocalDateTime AccountCreationDate =LocalDateTime.now();
    ;

    @OneToOne
    @MapsId
    @JsonIgnore
    private User user;
}
