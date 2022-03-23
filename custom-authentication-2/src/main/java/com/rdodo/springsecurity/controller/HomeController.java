package com.rdodo.springsecurity.controller;

import com.rdodo.springsecurity.model.AutomobileClient;
import com.rdodo.springsecurity.model.HealthClient;
import com.rdodo.springsecurity.model.MediaClient;
import com.rdodo.springsecurity.model.User;
import com.rdodo.springsecurity.service.AutomobileService;
import com.rdodo.springsecurity.service.HealthService;
import com.rdodo.springsecurity.service.MediaService;
import com.rdodo.springsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/")
public class HomeController {

    @Autowired
    private MediaService mediaService;
    @Autowired
    private HealthService healthService;
    @Autowired
    private AutomobileService automobileService;
    @Autowired
    private UserService userService;

    @GetMapping(value = "/home")
    public ResponseEntity<String> showHome() {
        return new ResponseEntity<String>("Welcome to Home", HttpStatus.OK);
    }

    @PostMapping(value = "/media/save")
    public ResponseEntity<MediaClient> saveMediaUser(@RequestBody MediaClient mediaClient) {
        return new ResponseEntity<MediaClient>(mediaService.saveMediaClientUser(mediaClient), HttpStatus.CREATED);
    }

    @PostMapping(value = "/auto/save")
    public ResponseEntity<AutomobileClient> saveAutomobileUser(@RequestBody AutomobileClient automobileClient) {
        return new ResponseEntity<AutomobileClient>(automobileService.saveAutomobileClientUser(automobileClient), HttpStatus.CREATED);
    }

    @PostMapping(value = "/health/save")
    public ResponseEntity<HealthClient> saveHealthUser(@RequestBody HealthClient healthClient) {
        return new ResponseEntity<HealthClient>(healthService.saveHealthClientUser(healthClient), HttpStatus.CREATED);
    }

    @GetMapping(value = "/admin/all")
    public ResponseEntity<List<User>> getAllUser() {
        return new ResponseEntity<List<User>>(userService.getAllUsersList(), HttpStatus.FOUND);
    }

    @GetMapping(value = "/user/list/{userType}")
    public ResponseEntity<List<User>> getAllUserType(@PathVariable("userType") String userType) {
        return new ResponseEntity<List<User>>(userService.getAllUserByUserType(userType), HttpStatus.FOUND);
    }

}
