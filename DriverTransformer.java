package com.example.Trip.Ease.Tranformer;

import com.example.Trip.Ease.dto.request.DriverRequest;
import com.example.Trip.Ease.dto.responce.DriverResponce;
import com.example.Trip.Ease.model.Driver;



public class DriverTransformer {

    public static Driver driverRequestToDriver(DriverRequest driverRequest){
        return Driver.builder()
                .name(driverRequest.getName())
                        .age(driverRequest.getAge())
                                        .emailId(driverRequest.getEmailId())
                .build();
    }
    public static DriverResponce driverToDriverResponce(Driver driver){
        return DriverResponce.builder()
                .driverid(driver.getDriverId())
                .name(driver.getName())
                .age(driver.getAge())
                .emailId(driver.getEmailId())
                .build();
    }
}
