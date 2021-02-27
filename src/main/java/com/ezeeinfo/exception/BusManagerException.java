package com.ezeeinfo.exception;

public class BusManagerException extends Exception {

    public BusManagerException(String message) {
        super(message);
    }

    public BusManagerException(String message, Throwable cause) {
        super(message, cause);
    }

}