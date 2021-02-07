package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;


public class ManagementFeeHistory {

    @JsonProperty("ManagementFeeHistoryID")
    public Integer managementFeeHistoryID;
    @JsonProperty("PropertyID")
    public Integer propertyID;
    @JsonProperty("FromDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss")
    public Date fromDate;
    @JsonProperty("FeeDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss")
    public Date feeDate;
    @JsonProperty("PercentNetIncome")
    public Float percentNetIncome;
    @JsonProperty("FeeAmount")
    public Float feeAmount;
    @JsonProperty("PostingID")
    public Integer postingID;
    @JsonProperty("PercentTotalIncome")
    public Float percentTotalIncome;

}