package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class HistoryAttachment {

    @JsonProperty("HistoryAttachmentID")
    public Integer historyAttachmentID;
    @JsonProperty("HistoryID")
    public Integer historyID;
    @JsonProperty("FileID")
    public Integer fileID;
    @JsonProperty("File")
    public File file;

}