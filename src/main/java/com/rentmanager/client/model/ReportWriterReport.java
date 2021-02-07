package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;
import java.util.List;

@JavaBean(defaultProperty = "ReportWriterReports")
public class ReportWriterReport {

    @JsonProperty("ReportWriterReportID")
    public Integer reportWriterReportID;
    @JsonProperty("ReportTypeID")
    public String reportTypeID;
    @JsonProperty("MenuOption")
    public String menuOption;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("Title")
    public String title;
    @JsonProperty("Subtitle")
    public String subtitle;
    @JsonProperty("ExecuteBeforeReportScript")
    public String executeBeforeReportScript;
    @JsonProperty("ExecuteBeforeRecordScript")
    public String executeBeforeRecordScript;
    @JsonProperty("ExecuteAfterRecordScript")
    public String executeAfterRecordScript;
    @JsonProperty("PaperSize")
    public String paperSize;
    @JsonProperty("Orientation")
    public String orientation;
    @JsonProperty("MarginTop")
    public Float marginTop;
    @JsonProperty("MarginBottom")
    public Float marginBottom;
    @JsonProperty("MarginLeft")
    public Float marginLeft;
    @JsonProperty("MarginRight")
    public Float marginRight;
    @JsonProperty("TitleFontName")
    public String titleFontName;
    @JsonProperty("TitleFontSize")
    public Float titleFontSize;
    @JsonProperty("IsTitleFontBold")
    public Boolean isTitleFontBold;
    @JsonProperty("SubtitleFontName")
    public String subtitleFontName;
    @JsonProperty("SubtitleFontSize")
    public Float subtitleFontSize;
    @JsonProperty("CreateDate")
    public String createDate;
    @JsonProperty("CreateUserID")
    public Integer createUserID;
    @JsonProperty("UpdateDate")
    public String updateDate;
    @JsonProperty("UpdateUserID")
    public Integer updateUserID;
    @JsonProperty("CreateUser")
    public CreateUser createUser;
    @JsonProperty("UpdateUser")
    public UpdateUser updateUser;
    @JsonProperty("ConcurrencyID")
    public Integer concurrencyID;
    @JsonProperty("ReportWriterReportParameters")
    public List<ReportWriterReportParameter> reportWriterReportParameters = null;
    @JsonProperty("ReportWriterReportUsers")
    public List<Object> reportWriterReportUsers = null;
    @JsonProperty("ReportWriterReportRoles")
    public List<Object> reportWriterReportRoles = null;
    //    @JsonProperty("HeaderFile")
//    public HeaderFile headerFile;
    @JsonProperty("ReportWriterReportColumns")
    public List<Object> reportWriterReportColumns = null;
    @JsonProperty("SortOrder")
    public Integer sortOrder;

}