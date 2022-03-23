package com.rdodo.oauthresourceserver.repository;

import com.rdodo.oauthresourceserver.model.Physician;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class PhysicianRepository {

    public List<Physician> findAllPhysician() {
        return Arrays.asList(new Physician("Dr. Jackal", "General Physician"),
                new Physician("Dr. Octopus", "Cardiologist"),
                new Physician("Dr. Lithium", "Pediatrics"),
                new Physician("Dr. Semmons", "Gynaecologist"));
    }
}
