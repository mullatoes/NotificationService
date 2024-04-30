package com.service.property.paymentsbillingservice.utils;

import lombok.Data;

@Data
public class UnSuccessfulWrapper {
    private String status;
    private String message;

    public UnSuccessfulWrapper(String status, String message) {
        this.status = status;
        this.message = message;
    }
}