package com.rdodo.springsecurity.controller;

import com.rdodo.springsecurity.model.Customer;
import com.rdodo.springsecurity.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/")
public class HomeController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/home")
    public ResponseEntity<String> showHome() {
        return new ResponseEntity<String>("Welcome to Custom Spring Authentication.", HttpStatus.OK);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer) {
        return new ResponseEntity<Customer>(customerService.saveCustomer(customer), HttpStatus.CREATED);
    }

    @GetMapping(value = "/admin/all")
    public ResponseEntity<List<Customer>> showAllCustomer() {
        return new ResponseEntity<List<Customer>>(customerService.getAllCustomerList(), HttpStatus.OK);
    }

    @GetMapping(value = "/user/{customerName}")
    public ResponseEntity<Customer> showCustomer(@PathVariable("customerName") String customerName) {
        return new ResponseEntity<Customer>(customerService.getCustomerByCustomerName(customerName), HttpStatus.OK);
    }
}
