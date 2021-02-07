package com.rentmanager.exception;

import java.util.Map;

public final class RentManagerServerException extends RentManagerException {

    private final String developerMessage;
    private final Integer errorCode;
    private final String moreInfoUri;
    private final String exception;
    private final String details;
    private final String innerException;
    private final Map<String, Object> additionalData;

    public RentManagerServerException(final String userMessage, final String developerMessage, final Integer errorCode,
                                      final String moreInfoUri, final String exception, final String details, final String innerException, final Map<String, Object> additionalData) {
        super(userMessage, null);
        this.developerMessage = developerMessage;
        this.errorCode = errorCode;
        this.moreInfoUri = moreInfoUri;
        this.exception = exception;
        this.details = details;
        this.innerException = innerException;
        this.additionalData = additionalData;
    }

    public String getDeveloperMessage() {
        return developerMessage;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public String getMoreInfoUri() {
        return moreInfoUri;
    }

    public String getException() {
        return exception;
    }

    public String getDetails() {
        return details;
    }

    public String getInnerException() {
        return innerException;
    }

    public Map<String, Object> getAdditionalData() {
        return additionalData;
    }

}