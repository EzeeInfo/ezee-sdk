package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ScreeningReport {

    @JsonProperty("FileID")
    public Integer fileID;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("IsDepotUsed")
    public Boolean isDepotUsed;
    @JsonProperty("Path")
    public String path;
    @JsonProperty("Extension")
    public String extension;
    @JsonProperty("Token")
    public String token;
    @JsonProperty("CreateDate")
    public String createDate;
    @JsonProperty("UpdateDate")
    public String updateDate;
    @JsonProperty("CreateUserID")
    public Integer createUserID;
    @JsonProperty("UpdateUserID")
    public Integer updateUserID;
    @JsonProperty("DownloadURL")
    public String downloadURL;

}