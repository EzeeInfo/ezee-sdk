package com.ezeeinfo.exception;

public final class BusManagerServerException extends BusManagerException {

    public final int statusCode;


    public BusManagerServerException(String message, final int statusCode) {
        super(message);
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }
}