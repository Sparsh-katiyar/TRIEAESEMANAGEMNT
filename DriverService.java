package com.example.Trip.Ease.Service;

import com.example.Trip.Ease.Repository.DriverRepository;
import com.example.Trip.Ease.Tranformer.DriverTransformer;
import com.example.Trip.Ease.dto.request.DriverRequest;
import com.example.Trip.Ease.dto.responce.DriverResponce;
import com.example.Trip.Ease.model.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverService {
    @Autowired
    DriverRepository driverRepository;

    public DriverResponce addDriver(DriverRequest driverRequest) {
      Driver driver = DriverTransformer.driverRequestToDriver(driverRequest);
      driverRepository.save(driver);
      Driver savedDriver= driverRepository.save(driver);
      return DriverTransformer.driverToDriverResponce(savedDriver);
    }
}
