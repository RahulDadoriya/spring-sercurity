package com.rdodo.springsecurity.model;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class MediaClient extends User{
    private String mediaName;
    private String mediaAddress;

    public MediaClient() {
        super();
    }

    public MediaClient(String fullName, String email, String password, String[] authorities, String role, String mediaName, String mediaAddress) {
        super(fullName, email, password, authorities, role, "media");
        this.mediaName = mediaName;
        this.mediaAddress = mediaAddress;
    }

    public String getMediaName() {
        return mediaName;
    }

    public void setMediaName(String mediaName) {
        this.mediaName = mediaName;
    }

    public String getMediaAddress() {
        return mediaAddress;
    }

    public void setMediaAddress(String mediaAddress) {
        this.mediaAddress = mediaAddress;
    }
}
