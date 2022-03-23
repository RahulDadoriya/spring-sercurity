package com.rdodo.springsecurity.model;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class AutomobileClient extends User{
    private String automobileName;
    private String automobileAddress;

    public AutomobileClient() {
        super();
    }

    public AutomobileClient(String fullName, String email, String password, String[] authorities, String role, String automobileName, String automobileAddress) {
        super(fullName, email, password, authorities, role, "automobile");
        this.automobileName = automobileName;
        this.automobileAddress = automobileAddress;
    }

    public String getAutomobileName() {
        return automobileName;
    }

    public void setAutomobileName(String automobileName) {
        this.automobileName = automobileName;
    }

    public String getAutomobileAddress() {
        return automobileAddress;
    }

    public void setAutomobileAddress(String automobileAddress) {
        this.automobileAddress = automobileAddress;
    }
}
