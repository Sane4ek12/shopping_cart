package com.example.demo.enums;

public enum OrderStatus {
    CREATED("CREATED"),
    PROCESSING("PROCESSING"),
    CANCELLED("CANCELLED"),
    SHIPPED("SHIPPED");
    private String status;

    OrderStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
