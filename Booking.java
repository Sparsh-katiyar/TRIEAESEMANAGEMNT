package com.example.Trip.Ease.model;

import com.example.Trip.Ease.Enum.TripStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity

public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int boookingId;
    private String pickup;
    private String destination;
    double tripDistanceInKm;
    private TripStatus tripstatus;

    double billamount;
    @CreationTimestamp
    Date bookedAt;
    @UpdateTimestamp
    Date lastUpdateAt;


}
