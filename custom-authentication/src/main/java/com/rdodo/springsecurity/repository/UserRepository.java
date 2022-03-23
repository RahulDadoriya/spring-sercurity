package com.rdodo.springsecurity.repository;

import com.rdodo.springsecurity.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
    Users findUsersByUserId(String userId);

}
