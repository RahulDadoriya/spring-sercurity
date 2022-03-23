package com.rdodo.springsecurity.service.Impl;

import com.rdodo.springsecurity.model.MediaClient;
import com.rdodo.springsecurity.repository.MediaClientRepository;
import com.rdodo.springsecurity.service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class MediaServiceImpl implements MediaService {

    @Autowired
    private MediaClientRepository mediaClientRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public MediaClient saveMediaClientUser(MediaClient mediaClient) {
        mediaClient.setPassword(passwordEncoder.encode(mediaClient.getPassword()));
        mediaClient.setUserType("media");
        mediaClient.setUserCreatedDate(LocalDate.now());
        return mediaClientRepository.save(mediaClient);
    }
}
