package com.example.Trip.Ease.Controller;

import com.example.Trip.Ease.Enum.Gender;
import com.example.Trip.Ease.Service.CustomerService;
import com.example.Trip.Ease.dto.request.customerRequest;
import com.example.Trip.Ease.dto.responce.customerResponce;
import com.example.Trip.Ease.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/customer")
public class CustomerController {
    @Autowired  // Connectwith Service
    CustomerService customerService;
    /*@PostMapping("/add")// APIEndPoint
    public Customer addCustomer (@RequestBody Customer customer){
        return customerService.addCustomer(customerRequest);
    }*/
    //@GetMapping("get/customer-id/{id}")
  /*  public Customer getcustomer(@PathVariable("id")int customerId){

        return customerService.getcustomer(customerId);
    }*/
    @PostMapping("/add")
    public customerResponce addcustomer(@RequestBody customerRequest customerRequest){
        return customerService.addCustomer(customerRequest);

    }
    @GetMapping("/get/customer-id/{id}")
    public customerResponce getCustomer(@PathVariable int customerId) {
        return customerService.getcustomer(customerId);
    }
    @GetMapping("/get/gender/{gender}")
    public List<customerResponce> getAllByGender(@PathVariable("gender") Gender gender){
        return customerService.getAllByGender(gender);
    }
     /*@GetMapping("/get")
 /*   public List<customerResponce> getAllByGenderAndAge (@RequestParam("Gender") Gender gender ,
                                                        @RequestParam("age") int age) {
         return customerService.getAllByGenderAndAge(gender, age);
     }*/
 /*   @GetMapping("/get-by-age-greater-than")
    public List<customerResponce> getAllByGenderAndAgeGreatorThan(@RequestParam("Gender") Gender gender ,
                                                                   @RequestParam("age") int age){
        return customerService.getAllByGenderAndAgeGreatorThan(gender,age);
    }

}*/
@GetMapping("/get-by-age-greater-than")
public List<customerResponce> getAllByGenderAndAgeGreatorThan(@RequestParam("Gender") String gender ,
                                                              @RequestParam("age") int age){
    return customerService.getAllByGenderAndAgeGreatorThan(gender,age);
}

}
