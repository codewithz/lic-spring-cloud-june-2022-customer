package com.lic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    RestTemplate restTemplate;

    public String addCustomer(Customer customer){
        Customer savedCustomer=customerRepository.save(customer);

        String url="http://localhost:10010/api/v2/lic/fraudcheck/{id}";

        Integer id=savedCustomer.getId().intValue();
        FraudCheckHistory fruad=restTemplate.getForObject(
                url,FraudCheckHistory.class,id
        );

        String result=fruad.getFraudster()?"Fraud Customer":"OK";

        return result;
    }
}
