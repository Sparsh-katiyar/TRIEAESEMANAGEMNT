package com.example.Trip.Ease.model;

import com.example.Trip.Ease.Enum.Gender;
import io.micrometer.observation.annotation.Observed;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Builder

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public int customerId;
    private String name;
    private int age;
    private String emailId;
    @Enumerated(value = EnumType.STRING)
    private Gender gender;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn
    List<Booking> booking = new ArrayList<>();


}
