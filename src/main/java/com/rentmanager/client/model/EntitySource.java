package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class EntitySource {

    @JsonProperty("ModelSource")
    public String modelSource;
    @JsonProperty("DisplayNameProperty")
    public String displayNameProperty;
    @JsonProperty("ValueProperty")
    public String valueProperty;
    @JsonProperty("EntityType")
    public String entityType;

}