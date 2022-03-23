package com.rdodo.oauthresourceserver.model;

public class Patient {
    private int id = 100;
    private String patientName;
    private int patientAge;
    private char patientSex;

    public Patient() {
    }

    public Patient(String patientName, int patientAge, char patientSex) {
        ++this.id;
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.patientSex = patientSex;
    }

    public int getId() {
        return id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public char getPatientSex() {
        return patientSex;
    }

    public void setPatientSex(char patientSex) {
        this.patientSex = patientSex;
    }
}
