package com.vivamentor.api.authentication.model;

import java.util.Date;

public class User {


    private int rollNo;


    private String username;

    private String password;

    private String email;

    private String mobileNo;

    private Date createdOn;

    private Date lastLogin;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
        }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    @Override
    public String toString() {
        return "User [rollNo=" + rollNo + ", username=" + username + ", password=" + password + ", email=" + email
                + ", mobileNo=" + mobileNo + ", createdOn=" + createdOn + ", lastLogin=" + lastLogin + "]";
    }
}