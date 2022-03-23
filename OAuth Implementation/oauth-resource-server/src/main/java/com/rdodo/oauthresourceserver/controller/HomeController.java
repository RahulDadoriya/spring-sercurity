package com.rdodo.oauthresourceserver.controller;


import com.rdodo.oauthresourceserver.model.Patient;
import com.rdodo.oauthresourceserver.model.Physician;
import com.rdodo.oauthresourceserver.repository.PatientsRepository;
import com.rdodo.oauthresourceserver.repository.PhysicianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/")
public class HomeController {

    @Autowired
    private PatientsRepository patientsRepository;
    @Autowired
    private PhysicianRepository physicianRepository;

    @GetMapping(value = "list/patient")
    public ResponseEntity<List<Patient>> findAllPatiient() {
        return new ResponseEntity<>(patientsRepository.findAllPatients(), HttpStatus.OK);
    }

    @GetMapping(value = "list/physician")
    public ResponseEntity<List<Physician>> findAllPhysician() {
        return new ResponseEntity<>(physicianRepository.findAllPhysician(), HttpStatus.OK);
    }
}
