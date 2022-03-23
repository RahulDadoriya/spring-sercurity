package com.rdodo.customauthenticationprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/")
public class HomeController {

    @GetMapping(value = "/data")
    public String data() {
        return "Some data";
    }
}
