package com.example.Trip.Ease.dto.responce;

import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder

public class customerResponce {
    private String name;
    private int age;
    private String emailId;



    public static void add(customerResponce customerResponce) {
    }
}
