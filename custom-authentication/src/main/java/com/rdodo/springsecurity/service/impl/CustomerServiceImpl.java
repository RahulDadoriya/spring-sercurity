package com.rdodo.springsecurity.service.impl;

import com.rdodo.springsecurity.model.Customer;
import com.rdodo.springsecurity.repository.CustomerRepository;
import com.rdodo.springsecurity.repository.UserRepository;
import com.rdodo.springsecurity.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Customer saveCustomer(Customer customer) {
        customer.setPassword(passwordEncoder.encode(customer.getPassword()));
        return customerRepository.save(customer);
    }

    @Override
    public Customer getCustomerByCustomerName(String customerName) {
        return customerRepository.findCustomerByCustomerName(customerName);
    }

    @Override
    public List<Customer> getAllCustomerList() {
        return customerRepository.findAll();
    }
}
