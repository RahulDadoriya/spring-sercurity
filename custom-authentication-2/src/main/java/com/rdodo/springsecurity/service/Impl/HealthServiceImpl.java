package com.rdodo.springsecurity.service.Impl;

import com.rdodo.springsecurity.model.HealthClient;
import com.rdodo.springsecurity.repository.HealthClientRepository;
import com.rdodo.springsecurity.service.HealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class HealthServiceImpl implements HealthService {

    @Autowired
    private HealthClientRepository healthClientRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public HealthClient saveHealthClientUser(HealthClient healthClient) {
        healthClient.setPassword(passwordEncoder.encode(healthClient.getPassword()));
        healthClient.setUserType("health");
        healthClient.setUserCreatedDate(LocalDate.now());
        return healthClientRepository.save(healthClient);
    }
}
