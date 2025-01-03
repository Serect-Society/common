package com.ss.common.response;

import java.io.Serializable;

public class ApiResponse implements Serializable {
    String message;

    public ApiResponse() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
