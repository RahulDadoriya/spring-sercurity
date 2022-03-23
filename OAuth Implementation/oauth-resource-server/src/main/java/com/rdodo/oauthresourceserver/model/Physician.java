package com.rdodo.oauthresourceserver.model;

public class Physician {

    private int id = 1000;
    private String physicianName;
    private String physicianSpeciality;

    public Physician() {
    }

    public Physician(String physicianName, String physicianSpeciality) {
        ++this.id;
        this.physicianName = physicianName;
        this.physicianSpeciality = physicianSpeciality;
    }

    public int getId() {
        return id;
    }

    public String getPhysicianName() {
        return physicianName;
    }

    public void setPhysicianName(String physicianName) {
        this.physicianName = physicianName;
    }

    public String getPhysicianSpeciality() {
        return physicianSpeciality;
    }

    public void setPhysicianSpeciality(String physicianSpeciality) {
        this.physicianSpeciality = physicianSpeciality;
    }
}
