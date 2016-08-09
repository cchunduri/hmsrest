package com.chaitu.hmsrest.models;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Host is the one who is the owner of all Hostels. Under him lot of hostels will be running. <br />
 *
 * Created by chaitanya.
 */
@Entity
@Table(name = "HOST")
public class Host implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hostId")
    private int hostId;

    @Column(name = "hostName")
    private String hostName;

    @Column(name = "hostEmail")
    private String hostEmail;

    @Column(name = "hostPassword")
    private String hostPassword;

    @Column(name = "hostPicPath")
    private String hostPicPath;
    
    public int getHostId() {
        return hostId;
    }

    public void setHostId(int hostId) {
        this.hostId = hostId;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getHostEmail() {
        return hostEmail;
    }

    public void setHostEmail(String hostEmail) {
        this.hostEmail = hostEmail;
    }

    public String getHostPassword() {
        return hostPassword;
    }

    public void setHostPassword(String hostPassword) {
        this.hostPassword = hostPassword;
    }

    public String getHostPicPath() {
        return hostPicPath;
    }

    public void setHostPicPath(String hostPicPath) {
        this.hostPicPath = hostPicPath;
    }

    @Override
    public String toString() {
        return "Host{" +
                "hostId=" + hostId +
                ", hostName='" + hostName + '\'' +
                ", hostEmail='" + hostEmail + '\'' +
                ", hostPassword='" + hostPassword + '\'' +
                ", hostPicPath='" + hostPicPath + '\'' +
                '}' + "\n";
    }
}
