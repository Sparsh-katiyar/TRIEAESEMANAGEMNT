package com.example.Trip.Ease.Service;

import com.example.Trip.Ease.CustomerNotFoundException;
import com.example.Trip.Ease.Enum.Gender;
import com.example.Trip.Ease.Repository.CustomerRepository;
import com.example.Trip.Ease.Tranformer.customerTranformer;
import com.example.Trip.Ease.dto.request.customerRequest;
import com.example.Trip.Ease.dto.responce.customerResponce;
import com.example.Trip.Ease.model.Customer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import javax.management.Query;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    //  customertransformer customertransformer= new customertransformer();


    public customerResponce addCustomer(customerRequest customerRequest) {
        //RequestDTO -> Entity
        Customer customer = customerTranformer.CustomerRequestToCustomer(customerRequest);

        //save entity to Db
        Customer savedcustomer = customerRepository.save(customer);
        // saved entity to respoce DTO
        return customerTranformer.CustomerToCustomerResponce(customer);


    }

    public customerResponce getcustomer(int customerId) {
        Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
        if (optionalCustomer.isEmpty()) {
            throw new CustomerNotFoundException("Invalid Customer Id");
        }
        Customer savedCustomer = optionalCustomer.get();
        // saved entity to respoce DTO
        return customerTranformer.CustomerToCustomerResponce(savedCustomer);

    }


    public List<customerResponce> getAllByGender(Gender gender) {
        List<Customer> customers = customerRepository.findByGender(gender);
        // entity ----> resposce dto
        List<customerResponce> customerResponce = new ArrayList<>();
        for (Customer Customer : customers) {
            customerResponce.add(customerTranformer.CustomerToCustomerResponce(Customer));
        }
        return customerResponce;
    }

    /*public List<customerResponce> getAllByGenderAndAge(Gender gender, int age) {
        List<Customer> customers = customerRepository.findByAllGenderAndAge(gender, age);
        List<customerResponce> customerResponce = new ArrayList<>();
        for (Customer Customer : customers) {
            customerResponce.add(customerTranformer.CustomerToCustomerResponce(Customer));
        }

        return customerResponce;
    }*/

/*
    public List<customerResponce> getAllByGenderAndAgeGreatorThan(Gender gender, int age) {
        List<Customer> customers = customerRepository.findByGenderAndAgeGreaterThan(gender, age);
        List<customerResponce> customerResponce = new ArrayList<>();
        for (Customer Customer : customers) {
            customerResponce.add(customerTranformer.CustomerToCustomerResponce(Customer));
        }

        return customerResponce;
    }*/
    public List<customerResponce> getAllByGenderAndAgeGreatorThan(String gender, int age) {
        List<Customer> customers = customerRepository.findByGenderAndAgeGreaterThan(gender, age);
        List<customerResponce> customerResponce = new ArrayList<>();
        for (Customer Customer : customers) {
            customerResponce.add(customerTranformer.CustomerToCustomerResponce(Customer));
        }

        return customerResponce;
    }
}


/*
@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public customerResponce addCustomer(customerRequest customerRequest) {

        Customer customer = customerTranformer.CustomerRequestToCustomer(customerRequest);

        Customer savedCustomer = customerRepository.save(customer);

        return customerTranformer.CustomerToCustomerResponce(savedCustomer);
    }

    public customerResponce getcustomer(int customerId) {

        Optional<Customer> optionalCustomer = customerRepository.findById(customerId);

        if (optionalCustomer.isEmpty()) {
            throw new CustomerNotFoundException("Invalid Customer Id");
        }

        Customer customer = optionalCustomer.get();

        return customerTranformer.CustomerToCustomerResponce(customer);
    }
}
*/
