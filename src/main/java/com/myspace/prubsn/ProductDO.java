package com.myspace.prubsn;


import java.io.Serializable;

public class ProductDO implements Serializable
{
    private static final long serialVersionUID = 1L;
    private String voucherCode;
    private String discountType;
    private Boolean isVoucherApplicable;
    private String sldFromSI_LIFE;
    private String prdBasicId;
    private String prdName;
    private String txtPrmRate;
    private String anualPremium;
    private String annualyWakalahCertChg;
    private Long baseSI;
    private Long riderSI;
    private Double monthlyPremium;
    private Double semiannWakalahCertChg;
    private Double singlePremium;
    private Double semiannuallyPremium;
    private Double gstOnRider;
    private Double serviceTax;
    private Double totalGST;
    private Double quartlyWakalahCertChg;
    private Double totalPremium;
    private Double quarterlyPremium;
    private Double riderPremium;
    private Double gstOnBase;
    private Double basePremium;
    private Double dailyPremium;
    private Double monthlyWakalahCertChg;
    private String lineOfBusines;
    private VoucherDO voucherDO;
    private String decision;
    private String remarks;
    private String ruleName;
    private Double discountedAmount;
    private Double baseDiscountAmount;
    private Double riderDiscountAmount;
    private Double amountPayable;
    private Boolean discountOnBase;
    private Boolean discountOnRider;
    private Boolean discountOnBaseNRider;
    private Boolean discountOnTotalExTax;
    private Boolean discountOnTotalInTax;
    private Double maxDiscountAllowed;
    private String discountRoundOff;
    private String discountRoundUp;
    private String discountRoundDown;
    
    public String getDiscountRoundUp() {
        return this.discountRoundUp;
    }
    
    public void setDiscountRoundUp(final String discountRoundUp) {
        this.discountRoundUp = discountRoundUp;
    }
    
    public String getDiscountRoundDown() {
        return this.discountRoundDown;
    }
    
    public void setDiscountRoundDown(final String discountRoundDown) {
        this.discountRoundDown = discountRoundDown;
    }
    
    public String getDiscountRoundOff() {
        return this.discountRoundOff;
    }
    
    public void setDiscountRoundOff(final String discountRoundOff) {
        this.discountRoundOff = discountRoundOff;
    }
    
    public static long getSerialversionuid() {
        return 1L;
    }
    
    public String getVoucherCode() {
        return this.voucherCode;
    }
    
    public void setVoucherCode(final String voucherCode) {
        this.voucherCode = voucherCode;
    }
    
    public Boolean getIsVoucherApplicable() {
        return this.isVoucherApplicable;
    }
    
    public void setIsVoucherApplicable(final Boolean isVoucherApplicable) {
        this.isVoucherApplicable = isVoucherApplicable;
    }
    
    public String getSldFromSI_LIFE() {
        return this.sldFromSI_LIFE;
    }
    
    public void setSldFromSI_LIFE(final String sldFromSI_LIFE) {
        this.sldFromSI_LIFE = sldFromSI_LIFE;
    }
    
    public String getPrdBasicId() {
        return this.prdBasicId;
    }
    
    public void setPrdBasicId(final String prdBasicId) {
        this.prdBasicId = prdBasicId;
    }
    
    public String getPrdName() {
        return this.prdName;
    }
    
    public void setPrdName(final String prdName) {
        this.prdName = prdName;
    }
    
    public String getTxtPrmRate() {
        return this.txtPrmRate;
    }
    
    public void setTxtPrmRate(final String txtPrmRate) {
        this.txtPrmRate = txtPrmRate;
    }
    
    public String getAnualPremium() {
        return this.anualPremium;
    }
    
    public void setAnualPremium(final String anualPremium) {
        this.anualPremium = anualPremium;
    }
    
    public String getAnnualyWakalahCertChg() {
        return this.annualyWakalahCertChg;
    }
    
    public void setAnnualyWakalahCertChg(final String annualyWakalahCertChg) {
        this.annualyWakalahCertChg = annualyWakalahCertChg;
    }
    
    public Long getBaseSI() {
        return this.baseSI;
    }
    
    public void setBaseSI(final Long baseSI) {
        this.baseSI = baseSI;
    }
    
    public Long getRiderSI() {
        return this.riderSI;
    }
    
    public void setRiderSI(final Long riderSI) {
        this.riderSI = riderSI;
    }
    
    public Double getMonthlyPremium() {
        return this.monthlyPremium;
    }
    
    public void setMonthlyPremium(final Double monthlyPremium) {
        this.monthlyPremium = monthlyPremium;
    }
    
    public Double getSemiannWakalahCertChg() {
        return this.semiannWakalahCertChg;
    }
    
    public void setSemiannWakalahCertChg(final Double semiannWakalahCertChg) {
        this.semiannWakalahCertChg = semiannWakalahCertChg;
    }
    
    public Double getSinglePremium() {
        return this.singlePremium;
    }
    
    public void setSinglePremium(final Double singlePremium) {
        this.singlePremium = singlePremium;
    }
    
    public Double getSemiannuallyPremium() {
        return this.semiannuallyPremium;
    }
    
    public void setSemiannuallyPremium(final Double semiannuallyPremium) {
        this.semiannuallyPremium = semiannuallyPremium;
    }
    
    public Double getGstOnRider() {
        return this.gstOnRider;
    }
    
    public void setGstOnRider(final Double gstOnRider) {
        this.gstOnRider = gstOnRider;
    }
    
    public Double getServiceTax() {
        return this.serviceTax;
    }
    
    public void setServiceTax(final Double serviceTax) {
        this.serviceTax = serviceTax;
    }
    
    public Double getTotalGST() {
        return this.totalGST;
    }
    
    public void setTotalGST(final Double totalGST) {
        this.totalGST = totalGST;
    }
    
    public Double getQuartlyWakalahCertChg() {
        return this.quartlyWakalahCertChg;
    }
    
    public void setQuartlyWakalahCertChg(final Double quartlyWakalahCertChg) {
        this.quartlyWakalahCertChg = quartlyWakalahCertChg;
    }
    
    public Double getTotalPremium() {
        return this.totalPremium;
    }
    
    public void setTotalPremium(final Double totalPremium) {
        this.totalPremium = totalPremium;
    }
    
    public Double getQuarterlyPremium() {
        return this.quarterlyPremium;
    }
    
    public void setQuarterlyPremium(final Double quarterlyPremium) {
        this.quarterlyPremium = quarterlyPremium;
    }
    
    public Double getRiderPremium() {
        return this.riderPremium;
    }
    
    public void setRiderPremium(final Double riderPremium) {
        this.riderPremium = riderPremium;
    }
    
    public Double getGstOnBase() {
        return this.gstOnBase;
    }
    
    public void setGstOnBase(final Double gstOnBase) {
        this.gstOnBase = gstOnBase;
    }
    
    public Double getBasePremium() {
        return this.basePremium;
    }
    
    public void setBasePremium(final Double basePremium) {
        this.basePremium = basePremium;
    }
    
    public Double getDailyPremium() {
        return this.dailyPremium;
    }
    
    public void setDailyPremium(final Double dailyPremium) {
        this.dailyPremium = dailyPremium;
    }
    
    public Double getMonthlyWakalahCertChg() {
        return this.monthlyWakalahCertChg;
    }
    
    public void setMonthlyWakalahCertChg(final Double monthlyWakalahCertChg) {
        this.monthlyWakalahCertChg = monthlyWakalahCertChg;
    }
    
    public String getLineOfBusines() {
        return this.lineOfBusines;
    }
    
    public void setLineOfBusines(final String lineOfBusines) {
        this.lineOfBusines = lineOfBusines;
    }
    
    public VoucherDO getVoucherDO() {
        return this.voucherDO;
    }
    
    public void setVoucherDO(final VoucherDO voucherDO) {
        this.voucherDO = voucherDO;
    }
    
    public String getDecision() {
        return this.decision;
    }
    
    public void setDecision(final String decision) {
        this.decision = decision;
    }
    
    public String getRemarks() {
        return this.remarks;
    }
    
    public void setRemarks(final String remarks) {
        this.remarks = remarks;
    }
    
    public String getRuleName() {
        return this.ruleName;
    }
    
    public void setRuleName(final String ruleName) {
        this.ruleName = ruleName;
    }
    
    public String getDiscountType() {
        return this.discountType;
    }
    
    public void setDiscountType(final String discountType) {
        this.discountType = discountType;
    }
    
    public Double getDiscountedAmount() {
        return this.discountedAmount;
    }
    
    public void setDiscountedAmount(final Double discountedAmount) {
        this.discountedAmount = discountedAmount;
    }
    
    public Double getBaseDiscountAmount() {
        return this.baseDiscountAmount;
    }
    
    public void setBaseDiscountAmount(final Double baseDiscountAmount) {
        this.baseDiscountAmount = baseDiscountAmount;
    }
    
    public Double getRiderDiscountAmount() {
        return this.riderDiscountAmount;
    }
    
    public void setRiderDiscountAmount(final Double riderDiscountAmount) {
        this.riderDiscountAmount = riderDiscountAmount;
    }
    
    public Double getAmountPayable() {
        return this.amountPayable;
    }
    
    public void setAmountPayable(final Double amountPayable) {
        this.amountPayable = amountPayable;
    }
    
    public Boolean getDiscountOnBase() {
        return this.discountOnBase;
    }
    
    public void setDiscountOnBase(final Boolean discountOnBase) {
        this.discountOnBase = discountOnBase;
    }
    
    public Boolean getDiscountOnRider() {
        return this.discountOnRider;
    }
    
    public void setDiscountOnRider(final Boolean discountOnRider) {
        this.discountOnRider = discountOnRider;
    }
    
    public Boolean getDiscountOnTotalExTax() {
        return this.discountOnTotalExTax;
    }
    
    public void setDiscountOnTotalExTax(final Boolean discountOnTotalExTax) {
        this.discountOnTotalExTax = discountOnTotalExTax;
    }
    
    public Boolean getDiscountOnTotalInTax() {
        return this.discountOnTotalInTax;
    }
    
    public void setDiscountOnTotalInTax(final Boolean discountOnTotalInTax) {
        this.discountOnTotalInTax = discountOnTotalInTax;
    }
    
    public Double getMaxDiscountAllowed() {
        return this.maxDiscountAllowed;
    }
    
    public void setMaxDiscountAllowed(final Double maxDiscountAllowed) {
        this.maxDiscountAllowed = maxDiscountAllowed;
    }
    
    public Boolean getDiscountOnBaseNRider() {
        return this.discountOnBaseNRider;
    }
    
    public void setDiscountOnBaseNRider(final Boolean discountOnBaseNRider) {
        this.discountOnBaseNRider = discountOnBaseNRider;
    }
}
