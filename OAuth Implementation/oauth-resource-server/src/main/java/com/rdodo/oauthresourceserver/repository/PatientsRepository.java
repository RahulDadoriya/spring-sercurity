package com.rdodo.oauthresourceserver.repository;

import com.rdodo.oauthresourceserver.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class PatientsRepository {
    public List<Patient> findAllPatients() {
        return Arrays.asList(new Patient("Alex Browning", 45, 'M'),
                new Patient("Jesicca Simpsons", 33, 'F'),
                new Patient("Monti Carlo", 35, 'F'));
    }
}
