package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;
import java.util.Date;
import java.util.List;

@JavaBean(defaultProperty = "Properties")
public class Property {

    @JsonProperty("PropertyID")
    public Integer propertyID;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("ShortName")
    public String shortName;
    @JsonProperty("BillingName1")
    public String billingName1;
    @JsonProperty("BillingName2")
    public String billingName2;
    @JsonProperty("ManagerName")
    public String managerName;
    @JsonProperty("IsActive")
    public Boolean isActive;
    @JsonProperty("PropertyType")
    public String propertyType;
    @JsonProperty("Email")
    public String email;
    @JsonProperty("TaxID")
    public String taxID;
    @JsonProperty("Comment")
    public String comment;
    @JsonProperty("IsSystemDefaultAssignedUser")
    public Boolean isSystemDefaultAssignedUser;
    @JsonProperty("CreateDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss")
    public Date createDate;
    @JsonProperty("UpdateDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss")
    public Date updateDate;
    @JsonProperty("CreateUserID")
    public Integer createUserID;
    @JsonProperty("UpdateUserID")
    public Integer updateUserID;
    @JsonProperty("ConcurrencyID")
    public Integer concurrencyID;
    @JsonProperty("Color")
    public Color color;
    @JsonProperty("IsLateChargeEnabled")
    public Boolean isLateChargeEnabled;
    @JsonProperty("IsEpayEnabled")
    public Boolean isEpayEnabled;
    @JsonProperty("EndorsementOverride")
    public String endorsementOverride;
    @JsonProperty("DefaultBankID")
    public Integer defaultBankID;
    @JsonProperty("PrimaryOwnerID")
    public Integer primaryOwnerID;
    @JsonProperty("PostingDay")
    public Integer postingDay;
    @JsonProperty("LastMonthlyPost")
    public String lastMonthlyPost;
    @JsonProperty("LastManagementFeePost")
    public String lastManagementFeePost;
    @JsonProperty("OccupancyUnitCount")
    public Integer occupancyUnitCount;
    @JsonProperty("AccountingClose")
    public List<Object> accountingClose = null;
    @JsonProperty("ServiceManagerAssignedUser")
    public ServiceManagerAssignedUser serviceManagerAssignedUser;
    @JsonProperty("CreateUser")
    public CreateUser createUser;
    @JsonProperty("UpdateUser")
    public UpdateUser updateUser;
    @JsonProperty("PhoneNumbers")
    public List<PhoneNumber> phoneNumbers = null;
    @JsonProperty("PrimaryPhoneNumber")
    public PrimaryPhoneNumber primaryPhoneNumber;
    @JsonProperty("DefaultBank")
    public DefaultBank defaultBank;
    @JsonProperty("PrimaryOwner")
    public PrimaryOwner primaryOwner;
    @JsonProperty("Addresses")
    public List<Address> addresses = null;
    @JsonProperty("PrimaryAddress")
    public PrimaryAddress primaryAddress;
    @JsonProperty("BillingAddress")
    public BillingAddress billingAddress;
    @JsonProperty("PropertyRentChargeTypes")
    public List<PropertyRentChargeType> propertyRentChargeTypes = null;
    @JsonProperty("ChargeTypeBanks")
    public List<Object> chargeTypeBanks = null;
    @JsonProperty("PropertyFloors")
    public List<Object> propertyFloors = null;
    @JsonProperty("RentChargeTypeItems")
    public List<RentChargeTypeItem> rentChargeTypeItems = null;
    @JsonProperty("Floors")
    public List<Object> floors = null;
    @JsonProperty("Banks")
    public List<Object> banks = null;
    @JsonProperty("PropertyBanks")
    public List<PropertyBank> propertyBanks = null;
    @JsonProperty("UnitTypeProperties")
    public List<UnitTypeProperty> unitTypeProperties = null;
    @JsonProperty("History")
    public List<History> history = null;
    @JsonProperty("UserDefinedValues")
    public List<UserDefinedValue> userDefinedValues = null;
    @JsonProperty("RecurringCharges")
    public List<Object> recurringCharges = null;
    @JsonProperty("RecurringChargeSummaries")
    public List<Object> recurringChargeSummaries = null;
    @JsonProperty("Units")
    public List<Unit> units = null;
    @JsonProperty("UserProperties")
    public List<UserProperty> userProperties = null;
    @JsonProperty("Users")
    public List<User> users = null;
    @JsonProperty("ScreeningSetting")
    public ScreeningSetting screeningSetting;
    @JsonProperty("LogoFile")
    public LogoFile logoFile;
    @JsonProperty("Images")
    public List<Object> images = null;
    @JsonProperty("ManagementFeeHistory")
    public List<ManagementFeeHistory> managementFeeHistory = null;
    @JsonProperty("ApplicationTemplates")
    public List<ApplicationTemplate> applicationTemplates = null;
    @JsonProperty("PropertyManagementFeeSetups")
    public List<PropertyManagementFeeSetup> propertyManagementFeeSetups = null;
    @JsonProperty("PropertyGroups")
    public List<Object> propertyGroups = null;
    @JsonProperty("PropertyGroupDetails")
    public List<Object> propertyGroupDetails = null;
    @JsonProperty("PropertyFiles")
    public List<Object> propertyFiles = null;
    @JsonProperty("HistorySystemNotes")
    public List<HistorySystemNote> historySystemNotes = null;
    @JsonProperty("UnitCount")
    public Integer unitCount;
    @JsonProperty("OccupiedUnitCount")
    public Integer occupiedUnitCount;
    @JsonProperty("VacantUnitCount")
    public Integer vacantUnitCount;
    @JsonProperty("OwnerCheckSetup")
    public OwnerCheckSetup ownerCheckSetup;
    @JsonProperty("PetTypeProperties")
    public List<Object> petTypeProperties = null;
    @JsonProperty("PetTypes")
    public List<Object> petTypes = null;
    @JsonProperty("LateFeeSetup")
    public LateFeeSetup lateFeeSetup;
    @JsonProperty("MakeReadyTemplateProperties")
    public List<Object> makeReadyTemplateProperties = null;
    @JsonProperty("TextNumbers")
    public List<Object> textNumbers = null;
    @JsonProperty("TextNumberProperties")
    public List<Object> textNumberProperties = null;
    @JsonProperty("RMVoIPCallHistory")
    public List<Object> rMVoIPCallHistory = null;
    @JsonProperty("MarketingValues")
    public List<MarketingValue> marketingValues = null;
    @JsonProperty("MarketingSetup")
    public List<MarketingSetup> marketingSetup = null;

}
