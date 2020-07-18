package com.chhaya.loginapi.api.model.request;

import java.io.Serializable;

public class UserLoginRequestModel implements Serializable {

    private String email;
    private String password;

    public UserLoginRequestModel() {
    }

    public UserLoginRequestModel(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserLoginRequestModel{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
