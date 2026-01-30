package com.example.Trip.Ease.dto.request;

import com.example.Trip.Ease.Enum.Gender;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class customerRequest {
    private String name;
    private int age;
    private String emailId;
    private Gender gender;

    public String SetName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmailId() {

        return emailId;
    }

    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }
}
