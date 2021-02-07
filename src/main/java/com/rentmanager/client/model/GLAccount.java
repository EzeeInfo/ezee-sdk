package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;
import java.util.List;


@JavaBean(defaultProperty = "GLAccounts")
public class GLAccount {

    @JsonProperty("GLAccountID")
    public Integer gLAccountID;
    @JsonProperty("ParentGLAccount")
    public ParentGLAccount parentGLAccount;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("Reference")
    public String reference;
    @JsonProperty("GLAccountType")
    public String gLAccountType;
    @JsonProperty("CAMRecoveryChargeType")
    public CAMRecoveryChargeType cAMRecoveryChargeType;
    @JsonProperty("CAMReconcileChargeType")
    public CAMReconcileChargeType cAMReconcileChargeType;
    @JsonProperty("SortOrder")
    public Integer sortOrder;
    @JsonProperty("CreateUser")
    public CreateUser createUser;
    @JsonProperty("UpdateUser")
    public UpdateUser updateUser;
    @JsonProperty("ChildGLAccounts")
    public List<Object> childGLAccounts = null;
    @JsonProperty("GeneraLedgerAccountType")
    public GeneraLedgerAccountType generaLedgerAccountType;
    @JsonProperty("GeneralLedgerAccountType")
    public GeneralLedgerAccountType generalLedgerAccountType;
    @JsonProperty("ChartOfAccountsMappingLinks")
    public List<Object> chartOfAccountsMappingLinks = null;
    @JsonProperty("UserBanks")
    public List<Object> userBanks = null;
    @JsonProperty("NachaODFIBank")
    public NachaODFIBank nachaODFIBank;

}