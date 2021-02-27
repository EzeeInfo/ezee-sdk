package com.ezeeinfo.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Authorization {

    private final String authToken;

    private final String sessionToken;

    @JsonCreator
    public Authorization(@JsonProperty("authToken") final String authToken, @JsonProperty("sessionToken") final String sessionToken) {
        this.authToken = authToken;
        this.sessionToken = sessionToken;
    }

    public String getAuthToken() {
        return authToken;
    }

    public String getSessionToken() {
        return sessionToken;
    }

    @Override
    public String toString() {
        return "Authorization{" +
                "authToken='" + authToken + '\'' +
                ", sessionToken='" + sessionToken + '\'' +
                '}';
    }
}
