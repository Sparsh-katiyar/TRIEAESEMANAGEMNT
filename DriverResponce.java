package com.example.Trip.Ease.dto.responce;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class DriverResponce {
    private int driverid;
    private String name;
    private int age;
    private String emailId;

}
