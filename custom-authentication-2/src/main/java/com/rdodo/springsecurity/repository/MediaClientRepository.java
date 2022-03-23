package com.rdodo.springsecurity.repository;

import com.rdodo.springsecurity.model.MediaClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface MediaClientRepository extends JpaRepository<MediaClient, Integer> {
}
