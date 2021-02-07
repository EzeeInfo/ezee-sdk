package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;
import java.util.Date;
import java.util.List;

@JavaBean(defaultProperty = "Units")
public class Unit {

    @JsonProperty("UnitID")
    public Integer unitID;
    @JsonProperty("PropertyID")
    public Integer propertyID;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Comment")
    public String comment;
    @JsonProperty("UnitTypeID")
    public Integer unitTypeID;
    @JsonProperty("SortOrder")
    public Integer sortOrder;
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
    @JsonProperty("Addresses")
    public List<Address> addresses = null;
    @JsonProperty("CurrentOccupants")
    public List<CurrentOccupant> currentOccupants = null;

}