package com.rdodo.springsecurity.service.Impl;

import com.rdodo.springsecurity.model.User;
import com.rdodo.springsecurity.repository.UserRepository;
import com.rdodo.springsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserDetailsService, UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findUserByEmail(email);
        return Optional.of(user).get();
    }

    @Override
    public List<User> getAllUsersList() {
        return userRepository.findAll();
    }

    @Override
    public List<User> getAllUserByUserType(String userType) {
        return userRepository.findAllUserByUserType(userType);
    }
}
