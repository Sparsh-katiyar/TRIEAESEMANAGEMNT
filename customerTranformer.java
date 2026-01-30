package com.example.Trip.Ease.Tranformer;

import com.example.Trip.Ease.dto.request.customerRequest;
import com.example.Trip.Ease.dto.responce.customerResponce;
import com.example.Trip.Ease.model.Customer;

import java.util.List;

public class customerTranformer {
    public static Customer CustomerRequestToCustomer(customerRequest customerRequest){
       /* Customer customer = new Customer();
        customer.setName(customerRequest.SetName());
        customer.setAge(customerRequest.getAge());
        customer.setEmailId(customerRequest.getEmailId());
        customer.setGender(customerRequest.getGender());*/
        return Customer.builder()
                .name(customerRequest.getName())
                .age(customerRequest.getAge())
                .emailId(customerRequest.getEmailId())
                .gender(customerRequest.getGender())
                .build();
    }
    public static customerResponce CustomerToCustomerResponce(Customer customer){
        return customerResponce.builder()
                .name(customer.getName())
                .age(customer.getAge())
                .emailId(customer.getEmailId())
                .build();
    }


}
