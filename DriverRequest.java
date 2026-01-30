package com.example.Trip.Ease.dto.request;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class DriverRequest {
private String name;
private int age;
private  String emailId;

}
