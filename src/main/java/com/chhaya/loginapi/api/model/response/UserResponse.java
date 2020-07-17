package com.chhaya.loginapi.api.model.response;

public class UserResponse {

    private String userId;
    private String fullName;
    private String password;

    public UserResponse() {
    }

    public UserResponse(String userId, String fullName, String password) {
        this.userId = userId;
        this.fullName = fullName;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserResponse{" +
                "userId='" + userId + '\'' +
                ", fullName='" + fullName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
