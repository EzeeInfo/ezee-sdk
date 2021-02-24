package com.ezeeinfo.exception;

import java.util.List;

public class BusManagerClientException extends BusManagerException {

    private final String code;

    public BusManagerClientException(final String code, final String message) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}