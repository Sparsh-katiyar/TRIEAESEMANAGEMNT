package com.example.Trip.Ease.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table
@Builder
public class Driver {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "driver_id")
    private int driverId;
    private String name;
    private int age;
   private  String emailId;
@OneToMany(cascade = CascadeType.ALL)
        @JoinColumn
    List<Booking> bookings=new ArrayList<>();
@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn
Cab cab;

}
