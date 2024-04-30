package com.service.property.tenantmanagementservice.utils;

import lombok.Data;

@Data
public class UnSuccessfulWrapper<T> {
    private String status;
    private String message;

    public UnSuccessfulWrapper(String status, String message) {
        this.status = status;
        this.message = message;
    }
}
