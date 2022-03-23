package com.rdodo.springsecurity.service.impl;

import com.rdodo.springsecurity.model.Users;
import com.rdodo.springsecurity.repository.CustomerRepository;
import com.rdodo.springsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
        Users user = userRepository.findUsersByUserId(userId);
        System.out.println(user);
        return Optional.ofNullable(user).get();
    }
}
