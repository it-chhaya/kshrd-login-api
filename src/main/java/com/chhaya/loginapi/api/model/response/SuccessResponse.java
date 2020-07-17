package com.chhaya.loginapi.api.model.response;

import org.springframework.http.HttpStatus;

import java.sql.Timestamp;

public class SuccessResponse<T> {

    private String message;
    private T data;
    private HttpStatus status;
    private Timestamp timestamp;

    public SuccessResponse() {
    }

    public SuccessResponse(String message, T data, HttpStatus status, Timestamp timestamp) {
        this.message = message;
        this.data = data;
        this.status = status;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "SuccessResponse{" +
                "message='" + message + '\'' +
                ", data=" + data +
                ", status=" + status +
                ", timestamp=" + timestamp +
                '}';
    }

}
