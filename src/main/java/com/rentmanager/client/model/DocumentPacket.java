package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;
import java.util.Date;
import java.util.List;


@JavaBean(defaultProperty = "DocumentPackets")
public class DocumentPacket {

    @JsonProperty("DocumentPacketID")
    public Integer documentPacketID;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("DocumentPacketType")
    public String documentPacketType;
    @JsonProperty("ParentType")
    public String parentType;
    @JsonProperty("SortOrder")
    public Integer sortOrder;
    @JsonProperty("IsAllUsers")
    public Boolean isAllUsers;
    @JsonProperty("CreateDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss")
    public Date createDate;
    @JsonProperty("CreateUserID")
    public Integer createUserID;
    @JsonProperty("UpdateDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss")
    public Date updateDate;
    @JsonProperty("UpdateUserID")
    public Integer updateUserID;
    @JsonProperty("ConcurrencyID")
    public Integer concurrencyID;
    @JsonProperty("Documents")
    public List<Document> documents = null;
    @JsonProperty("DocumentPacketProperties")
    public List<DocumentPacketProperty> documentPacketProperties = null;
    @JsonProperty("DocumentPacketUsers")
    public List<DocumentPacketUser> documentPacketUsers = null;
    @JsonProperty("DocumentPacketRoles")
    public List<Object> documentPacketRoles = null;

}