package com.rdodo.springsecurity.service;

import com.rdodo.springsecurity.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsersList();
    List<User> getAllUserByUserType(String userType);
}
