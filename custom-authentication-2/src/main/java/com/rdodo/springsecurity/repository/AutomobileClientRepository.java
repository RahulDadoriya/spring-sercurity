package com.rdodo.springsecurity.repository;

import com.rdodo.springsecurity.model.AutomobileClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface AutomobileClientRepository extends JpaRepository<AutomobileClient, Integer> {
}
