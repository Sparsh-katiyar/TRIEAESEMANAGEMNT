package com.example.Trip.Ease.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity

public class Cab {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     int CabId;
     String CabNumber;
     String CabModel;
    double perKmRate;
    boolean isavailble=true;


}
