package com.example.demo.enums;

public enum PaymentMethod {
    CREDIT_CARD("CREDIT_CARD"),
    PAY_PAL("PAY_PAL"),
    ON_RECEIPT("ON_RECEIPT");
    private String method;

    PaymentMethod(String method) {
        this.method = method;
    }

    public String getMethod() {
        return method;
    }
}
