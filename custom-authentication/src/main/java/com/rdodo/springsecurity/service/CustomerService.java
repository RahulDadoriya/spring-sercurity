package com.rdodo.springsecurity.service;

import com.rdodo.springsecurity.model.Customer;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface CustomerService {
    Customer saveCustomer(Customer customer);
    Customer getCustomerByCustomerName(String userId);
    //Only accessible to admin rights
    List<Customer> getAllCustomerList();
}
