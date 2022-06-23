package com.lic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public String addCustomer(Customer customer){
        customerRepository.save(customer);
        return "OK";
    }
}
