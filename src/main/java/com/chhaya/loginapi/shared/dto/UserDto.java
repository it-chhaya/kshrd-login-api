package com.chhaya.loginapi.shared.dto;

import java.io.Serializable;

public class UserDto implements Serializable {

    private int id;
    private String userId;
    private String fullName;
    private String email;
    private String password;
    private boolean status;

    public UserDto() {}

    public UserDto(int id, String userId, String fullName, String email, String password, boolean status) {
        this.id = id;
        this.userId = userId;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                '}';
    }

}
