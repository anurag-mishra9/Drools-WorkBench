package com.myspace.prubsn;


import java.io.Serializable;

public class VoucherDO implements Serializable
{
    private static final long serialVersionUID = 1L;
    private Long voucherId;
    private String voucherCode;
    private String effectiveFromDate;
    private String effectiveToDate;
    private String loginUserId;
    private String voucherType;
    private Long voucherFrom;
    private Long voucherTo;
    private Long maxAllowed;
    private String voucherStatus;
    private String voucherName;
    private String voucherDesc;
    private String lineOfBusiness;
    private String separator;
    private Long voucherPrdRuleMapId;
    private Long prdBasicId;
    private String ruleIds;
    private String searchFlag;
    private String voucherPrdRuleStatus;
    private String taskId;
    private Long usedCount;
    String componentType;
    
    public Long getVoucherId() {
        return this.voucherId;
    }
    
    public void setVoucherId(final Long voucherId) {
        this.voucherId = voucherId;
    }
    
    public String getVoucherCode() {
        return this.voucherCode;
    }
    
    public void setVoucherCode(final String voucherCode) {
        this.voucherCode = voucherCode;
    }
    
    public String getEffectiveFromDate() {
        return this.effectiveFromDate;
    }
    
    public void setEffectiveFromDate(final String date) {
        this.effectiveFromDate = date;
    }
    
    public String getEffectiveToDate() {
        return this.effectiveToDate;
    }
    
    public void setEffectiveToDate(final String date) {
        this.effectiveToDate = date;
    }
    
    public String getLoginUserId() {
        return this.loginUserId;
    }
    
    public void setLoginUserId(final String loginUserId) {
        this.loginUserId = loginUserId;
    }
    
    public String getVoucherType() {
        return this.voucherType;
    }
    
    public void setVoucherType(final String voucherType) {
        this.voucherType = voucherType;
    }
    
    public Long getVoucherFrom() {
        return this.voucherFrom;
    }
    
    public void setVoucherFrom(final Long voucherFrom) {
        this.voucherFrom = voucherFrom;
    }
    
    public Long getVoucherTo() {
        return this.voucherTo;
    }
    
    public void setVoucherTo(final Long voucherTo) {
        this.voucherTo = voucherTo;
    }
    
    public Long getMaxAllowed() {
        return this.maxAllowed;
    }
    
    public void setMaxAllowed(final Long maxAllowed) {
        this.maxAllowed = maxAllowed;
    }
    
    public String getVoucherStatus() {
        return this.voucherStatus;
    }
    
    public void setVoucherStatus(final String voucherStatus) {
        this.voucherStatus = voucherStatus;
    }
    
    public String getVoucherName() {
        return this.voucherName;
    }
    
    public void setVoucherName(final String voucherName) {
        this.voucherName = voucherName;
    }
    
    public String getVoucherDesc() {
        return this.voucherDesc;
    }
    
    public void setVoucherDesc(final String voucherDesc) {
        this.voucherDesc = voucherDesc;
    }
    
    public String getLineOfBusiness() {
        return this.lineOfBusiness;
    }
    
    public void setLineOfBusiness(final String lineOfBusiness) {
        this.lineOfBusiness = lineOfBusiness;
    }
    
    public String getSeparator() {
        return this.separator;
    }
    
    public void setSeparator(final String separator) {
        this.separator = separator;
    }
    
    public Long getVoucherPrdRuleMapId() {
        return this.voucherPrdRuleMapId;
    }
    
    public void setVoucherPrdRuleMapId(final Long voucherPrdRuleMapId) {
        this.voucherPrdRuleMapId = voucherPrdRuleMapId;
    }
    
    public Long getPrdBasicId() {
        return this.prdBasicId;
    }
    
    public void setPrdBasicId(final Long prdBasicId) {
        this.prdBasicId = prdBasicId;
    }
    
    public String getRuleIds() {
        return this.ruleIds;
    }
    
    public void setRuleIds(final String ruleIds) {
        this.ruleIds = ruleIds;
    }
    
    public String getSearchFlag() {
        return this.searchFlag;
    }
    
    public void setSearchFlag(final String searchFlag) {
        this.searchFlag = searchFlag;
    }
    
    public String getVoucherPrdRuleStatus() {
        return this.voucherPrdRuleStatus;
    }
    
    public void setVoucherPrdRuleStatus(final String voucherPrdRuleStatus) {
        this.voucherPrdRuleStatus = voucherPrdRuleStatus;
    }
    
    public String getTaskId() {
        return this.taskId;
    }
    
    public void setTaskId(final String taskId) {
        this.taskId = taskId;
    }
    
    public String getComponentType() {
        return this.componentType;
    }
    
    public void setComponentType(final String componentType) {
        this.componentType = componentType;
    }
    
    public Long getUsedCount() {
        return this.usedCount;
    }
    
    public void setUsedCount(final Long usedCount) {
        this.usedCount = usedCount;
    }
}
