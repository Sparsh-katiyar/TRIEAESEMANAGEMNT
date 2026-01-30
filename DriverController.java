package com.example.Trip.Ease.Controller;

import com.example.Trip.Ease.Service.DriverService;
import com.example.Trip.Ease.dto.request.DriverRequest;
import com.example.Trip.Ease.dto.responce.DriverResponce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Driver")
public class DriverController {

    @Autowired
    DriverService driverService;
@PostMapping("/add")

    public DriverResponce addDriver(@RequestBody DriverRequest driverRequest){
        return driverService.addDriver(driverRequest);
    }
}
