package com.rdodo.springsecurity.service.Impl;

import com.rdodo.springsecurity.model.AutomobileClient;
import com.rdodo.springsecurity.repository.AutomobileClientRepository;
import com.rdodo.springsecurity.service.AutomobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class AutomobileServiceImpl implements AutomobileService {
    @Autowired
    private AutomobileClientRepository automobileClientRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public AutomobileClient saveAutomobileClientUser(AutomobileClient automobileClient) {
        automobileClient.setPassword(passwordEncoder.encode(automobileClient.getPassword()));
        automobileClient.setUserType("automobile");
        automobileClient.setUserCreatedDate(LocalDate.now());
        return automobileClientRepository.save(automobileClient);
    }
}
