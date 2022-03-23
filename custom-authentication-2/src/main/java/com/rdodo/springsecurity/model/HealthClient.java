package com.rdodo.springsecurity.model;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class HealthClient extends User{
    private String healthClientName;
    private String healhClientAddress;

    public HealthClient() {
        super();
    }

    public HealthClient(String fullName, String email, String password, String[] authorities, String role, String healthClientName, String healhClientAddress) {
        super(fullName, email, password, authorities, role, "health");
        this.healthClientName = healthClientName;
        this.healhClientAddress = healhClientAddress;
    }

    public String getHealthClientName() {
        return healthClientName;
    }

    public void setHealthClientName(String healthClientName) {
        this.healthClientName = healthClientName;
    }

    public String getHealhClientAddress() {
        return healhClientAddress;
    }

    public void setHealhClientAddress(String healhClientAddress) {
        this.healhClientAddress = healhClientAddress;
    }
}
