package com.rdodo.springsecurity.repository;

import com.rdodo.springsecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserByEmail(String email);
    List<User> findAllUserByUserType(String userType);
}
