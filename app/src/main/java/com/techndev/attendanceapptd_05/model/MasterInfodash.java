
package com.techndev.attendanceapptd_05.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MasterInfodash {

    @SerializedName("master_id")
    @Expose
    private Integer masterId;
    @SerializedName("country_id")
    @Expose
    private Integer countryId;
    @SerializedName("division_id")
    @Expose
    private Integer divisionId;
    @SerializedName("district_id")
    @Expose
    private Integer districtId;
    @SerializedName("upozila_id")
    @Expose
    private Integer upozilaId;
    @SerializedName("union_id")
    @Expose
    private Integer unionId;
    @SerializedName("ministry_id")
    @Expose
    private Integer ministryId;
    @SerializedName("director_id")
    @Expose
    private Object directorId;
    @SerializedName("organization_name")
    @Expose
    private String organizationName;
    @SerializedName("sub_domain")
    @Expose
    private String subDomain;
    @SerializedName("domain")
    @Expose
    private String domain;
    @SerializedName("admin_user")
    @Expose
    private String adminUser;
    @SerializedName("admin_password")
    @Expose
    private String adminPassword;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("logo")
    @Expose
    private String logo;
    @SerializedName("template")
    @Expose
    private Object template;
    @SerializedName("mobile")
    @Expose
    private String mobile;
    @SerializedName("phone")
    @Expose
    private Object phone;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("user_limit")
    @Expose
    private Integer userLimit;
    @SerializedName("is_active")
    @Expose
    private Integer isActive;
    @SerializedName("database_name")
    @Expose
    private String databaseName;
    @SerializedName("db_host")
    @Expose
    private Object dbHost;
    @SerializedName("db_username")
    @Expose
    private Object dbUsername;
    @SerializedName("db_password")
    @Expose
    private Object dbPassword;

    public Integer getMasterId() {
        return masterId;
    }

    public void setMasterId(Integer masterId) {
        this.masterId = masterId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Integer divisionId) {
        this.divisionId = divisionId;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public Integer getUpozilaId() {
        return upozilaId;
    }

    public void setUpozilaId(Integer upozilaId) {
        this.upozilaId = upozilaId;
    }

    public Integer getUnionId() {
        return unionId;
    }

    public void setUnionId(Integer unionId) {
        this.unionId = unionId;
    }

    public Integer getMinistryId() {
        return ministryId;
    }

    public void setMinistryId(Integer ministryId) {
        this.ministryId = ministryId;
    }

    public Object getDirectorId() {
        return directorId;
    }

    public void setDirectorId(Object directorId) {
        this.directorId = directorId;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getSubDomain() {
        return subDomain;
    }

    public void setSubDomain(String subDomain) {
        this.subDomain = subDomain;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getAdminUser() {
        return adminUser;
    }

    public void setAdminUser(String adminUser) {
        this.adminUser = adminUser;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Object getTemplate() {
        return template;
    }

    public void setTemplate(Object template) {
        this.template = template;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Object getPhone() {
        return phone;
    }

    public void setPhone(Object phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getUserLimit() {
        return userLimit;
    }

    public void setUserLimit(Integer userLimit) {
        this.userLimit = userLimit;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public Object getDbHost() {
        return dbHost;
    }

    public void setDbHost(Object dbHost) {
        this.dbHost = dbHost;
    }

    public Object getDbUsername() {
        return dbUsername;
    }

    public void setDbUsername(Object dbUsername) {
        this.dbUsername = dbUsername;
    }

    public Object getDbPassword() {
        return dbPassword;
    }

    public void setDbPassword(Object dbPassword) {
        this.dbPassword = dbPassword;
    }

}
