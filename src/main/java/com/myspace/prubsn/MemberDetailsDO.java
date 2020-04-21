package com.myspace.prubsn;


import java.util.List;
import java.math.BigDecimal;
import java.io.Serializable;

public class MemberDetailsDO implements Serializable
{
    private static final long serialVersionUID = 1L;
    private Integer age;
    private String decision;
    private BigDecimal bmi;
    private int height;
    private Integer SI;
    private String remarks;
    private String ruleName;
    private String loading;
    private Integer noOfSticks;
    private Boolean isDisease;
    private Boolean isFamilyDisease;
    private Boolean isSurgery;
    private Boolean isFlying;
    private Boolean isDrug;
    private Boolean isApplication;
    private Boolean isCountry;
    private Boolean isPregnant;
    private Boolean isFemaleDisorder;
    private Boolean isChildDisorder;
    private Integer childAge;
    private BigDecimal childWeight;
    private Integer pregWeeks;
    private Integer pregmonths;
    private Boolean isFatca;
    private Boolean isPolitical;
    private Boolean isAmla;
    private Boolean isOtherNationality;
    private Boolean isCrs;
    private Integer cisc;
    private Integer pcwocRiderTerm;
    private Integer basicPlanSC;
    private Integer sumCovered;
    private Integer tsar;
    private Integer topUpContri;
    private String topUpContriType;
    private Integer minTopUpContri;
    private Integer maxTopUpContri;
    private Integer medicalTSAR;
    private Integer nonMedicalTSAR;
    private Integer basicPlanTakafulContri;
    private Integer pcwocContri;
    private Integer totalTsar;
    private Boolean isJuvenile;
    private Integer juvenileAge;
    private String paymentMode;
    private Boolean isThirdPartyRelation;
    private String relationshipAllowed;
    private String requirement;
    private String transType;
    private String transId;
    private String status;
    private String stage;
    private String activityFlag;
    private String txtFromAge;
    private String smoker;
    private String gender;
    private String fromTerm;
    private String prmRate;
    private String fromSI;
    private String email;
    private String prdBasicId;
    private String AnnualPremium;
    private String MonthlyPremium;
    private String SinglePremium;
    private String SemiannuallyPremium;
    private String GSTOnRider;
    private String ServiceTax;
    private String TotalGST;
    private String TotalPremium;
    private String QuarterlyPremium;
    private String RiderPremium;
    private String GSTOnBase;
    private String BasePremium;
    private String DailyPremium;
    private String lineOfBusiness;
    private String proposalNo;
    private String fullName;
    private String dateOfBirth;
    private String NRIC1;
    private boolean isSmoker;
    private String sumAssured;
    private String occupation;
    private String otherOccupation;
    private String natureOfBusiness;
    private String otherBusiness;
    private String annualIncome;
    private String mobile;
    private String term;
    private String channelCode;
    private String userName;
    private String mailingAddsL1;
    private String mailingAddsL2;
    private String mailingPostCode;
    private String mailingCity;
    private String mailingState;
    private String homeAddsL1;
    private String homeAddsL2;
    private String homePostCode;
    private String homeCity;
    private String homeState;
    private String chkHomeAddress;
    private String share;
    private String name;
    private String NRIC;
    private String dob;
    private String nationality;
    private String relationship;
    private String isMinor;
    private String isAddresSame;
    private String address1;
    private String address2;
    private String postCode;
    private String city;
    private String state;
    private String sequence2;
    private String name1;
    private String NRIC2;
    private String dob1;
    private String nationality1;
    private String relationship1;
    private String isMinor1;
    private String productName;
    private String policyNo;
    private String riderApplicable;
    private List<QuestionaireDetailsDO> questionDetailsList;
    private List<NomineeDetailsDO> nomineeDetailsList;
    private Boolean isGutkhaPanCnsumr;
    private String guthkaPanQnty;
    private Long noOfMembers;
    
    public Long getNoOfMembers() {
        return this.noOfMembers;
    }
    
    public void setNoOfMembers(final Long noOfMembers) {
        this.noOfMembers = noOfMembers;
    }
    
    public Integer getAge() {
        return this.age;
    }
    
    public void setAge(final Integer age) {
        this.age = age;
    }
    
    public String getDecision() {
        return this.decision;
    }
    
    public void setDecision(final String decision) {
        this.decision = decision;
    }
    
    public BigDecimal getBmi() {
        return this.bmi;
    }
    
    public void setBmi(final BigDecimal bmi) {
        this.bmi = bmi;
    }
    
    public Integer getSI() {
        return this.SI;
    }
    
    public void setSI(final Integer sI) {
        this.SI = sI;
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
    
    public String getLoading() {
        return this.loading;
    }
    
    public void setLoading(final String loading) {
        this.loading = loading;
    }
    
    public Integer getNoOfSticks() {
        return this.noOfSticks;
    }
    
    public void setNoOfSticks(final Integer noOfSticks) {
        this.noOfSticks = noOfSticks;
    }
    
    public Boolean getIsDisease() {
        return this.isDisease;
    }
    
    public void setIsDisease(final Boolean isDisease) {
        this.isDisease = isDisease;
    }
    
    public Boolean getIsFamilyDisease() {
        return this.isFamilyDisease;
    }
    
    public void setIsFamilyDisease(final Boolean isFamilyDisease) {
        this.isFamilyDisease = isFamilyDisease;
    }
    
    public Boolean getIsSurgery() {
        return this.isSurgery;
    }
    
    public void setIsSurgery(final Boolean isSurgery) {
        this.isSurgery = isSurgery;
    }
    
    public Boolean getIsFlying() {
        return this.isFlying;
    }
    
    public void setIsFlying(final Boolean isFlying) {
        this.isFlying = isFlying;
    }
    
    public Boolean getIsDrug() {
        return this.isDrug;
    }
    
    public void setIsDrug(final Boolean isDrug) {
        this.isDrug = isDrug;
    }
    
    public Boolean getIsApplication() {
        return this.isApplication;
    }
    
    public void setIsApplication(final Boolean isApplication) {
        this.isApplication = isApplication;
    }
    
    public Boolean getIsCountry() {
        return this.isCountry;
    }
    
    public void setIsCountry(final Boolean isCountry) {
        this.isCountry = isCountry;
    }
    
    public Boolean getIsPregnant() {
        return this.isPregnant;
    }
    
    public void setIsPregnant(final Boolean isPregnant) {
        this.isPregnant = isPregnant;
    }
    
    public Boolean getIsFemaleDisorder() {
        return this.isFemaleDisorder;
    }
    
    public void setIsFemaleDisorder(final Boolean isFemaleDisorder) {
        this.isFemaleDisorder = isFemaleDisorder;
    }
    
    public Boolean getIsChildDisorder() {
        return this.isChildDisorder;
    }
    
    public void setIsChildDisorder(final Boolean isChildDisorder) {
        this.isChildDisorder = isChildDisorder;
    }
    
    public Integer getChildAge() {
        return this.childAge;
    }
    
    public void setChildAge(final Integer childAge) {
        this.childAge = childAge;
    }
    
    public BigDecimal getChildWeight() {
        return this.childWeight;
    }
    
    public void setChildWeight(final BigDecimal childWeight) {
        this.childWeight = childWeight;
    }
    
    public Integer getPregWeeks() {
        return this.pregWeeks;
    }
    
    public void setPregWeeks(final Integer pregWeeks) {
        this.pregWeeks = pregWeeks;
    }
    
    public Boolean getIsFatca() {
        return this.isFatca;
    }
    
    public void setIsFatca(final Boolean isFatca) {
        this.isFatca = isFatca;
    }
    
    public Boolean getIsPolitical() {
        return this.isPolitical;
    }
    
    public void setIsPolitical(final Boolean isPolitical) {
        this.isPolitical = isPolitical;
    }
    
    public Boolean getIsAmla() {
        return this.isAmla;
    }
    
    public void setIsAmla(final Boolean isAmla) {
        this.isAmla = isAmla;
    }
    
    public Boolean getIsOtherNationality() {
        return this.isOtherNationality;
    }
    
    public void setIsOtherNationality(final Boolean isOtherNationality) {
        this.isOtherNationality = isOtherNationality;
    }
    
    public Boolean getIsCrs() {
        return this.isCrs;
    }
    
    public void setIsCrs(final Boolean isCrs) {
        this.isCrs = isCrs;
    }
    
    public Integer getCisc() {
        return this.cisc;
    }
    
    public void setCisc(final Integer cisc) {
        this.cisc = cisc;
    }
    
    public Integer getPcwocRiderTerm() {
        return this.pcwocRiderTerm;
    }
    
    public void setPcwocRiderTerm(final Integer pcwocRiderTerm) {
        this.pcwocRiderTerm = pcwocRiderTerm;
    }
    
    public Integer getBasicPlanSC() {
        return this.basicPlanSC;
    }
    
    public void setBasicPlanSC(final Integer basicPlanSC) {
        this.basicPlanSC = basicPlanSC;
    }
    
    public Integer getSumCovered() {
        return this.sumCovered;
    }
    
    public void setSumCovered(final Integer sumCovered) {
        this.sumCovered = sumCovered;
    }
    
    public Integer getTsar() {
        return this.tsar;
    }
    
    public void setTsar(final Integer tsar) {
        this.tsar = tsar;
    }
    
    public Integer getTopUpContri() {
        return this.topUpContri;
    }
    
    public void setTopUpContri(final Integer topUpContri) {
        this.topUpContri = topUpContri;
    }
    
    public String getTopUpContriType() {
        return this.topUpContriType;
    }
    
    public void setTopUpContriType(final String topUpContriType) {
        this.topUpContriType = topUpContriType;
    }
    
    public Integer getMinTopUpContri() {
        return this.minTopUpContri;
    }
    
    public void setMinTopUpContri(final Integer minTopUpContri) {
        this.minTopUpContri = minTopUpContri;
    }
    
    public Integer getMaxTopUpContri() {
        return this.maxTopUpContri;
    }
    
    public void setMaxTopUpContri(final Integer maxTopUpContri) {
        this.maxTopUpContri = maxTopUpContri;
    }
    
    public Integer getMedicalTSAR() {
        return this.medicalTSAR;
    }
    
    public void setMedicalTSAR(final Integer medicalTSAR) {
        this.medicalTSAR = medicalTSAR;
    }
    
    public Integer getNonMedicalTSAR() {
        return this.nonMedicalTSAR;
    }
    
    public void setNonMedicalTSAR(final Integer nonMedicalTSAR) {
        this.nonMedicalTSAR = nonMedicalTSAR;
    }
    
    public Integer getBasicPlanTakafulContri() {
        return this.basicPlanTakafulContri;
    }
    
    public void setBasicPlanTakafulContri(final Integer basicPlanTakafulContri) {
        this.basicPlanTakafulContri = basicPlanTakafulContri;
    }
    
    public Integer getPcwocContri() {
        return this.pcwocContri;
    }
    
    public void setPcwocContri(final Integer pcwocContri) {
        this.pcwocContri = pcwocContri;
    }
    
    public Integer getTotalTsar() {
        return this.totalTsar;
    }
    
    public void setTotalTsar(final Integer totalTsar) {
        this.totalTsar = totalTsar;
    }
    
    public Boolean getIsJuvenile() {
        return this.isJuvenile;
    }
    
    public void setIsJuvenile(final Boolean isJuvenile) {
        this.isJuvenile = isJuvenile;
    }
    
    public Integer getJuvenileAge() {
        return this.juvenileAge;
    }
    
    public void setJuvenileAge(final Integer juvenileAge) {
        this.juvenileAge = juvenileAge;
    }
    
    public String getPaymentMode() {
        return this.paymentMode;
    }
    
    public void setPaymentMode(final String paymentMode) {
        this.paymentMode = paymentMode;
    }
    
    public Boolean getIsThirdPartyRelation() {
        return this.isThirdPartyRelation;
    }
    
    public void setIsThirdPartyRelation(final Boolean isThirdPartyRelation) {
        this.isThirdPartyRelation = isThirdPartyRelation;
    }
    
    public String getRelationshipAllowed() {
        return this.relationshipAllowed;
    }
    
    public void setRelationshipAllowed(final String relationshipAllowed) {
        this.relationshipAllowed = relationshipAllowed;
    }
    
    public String getRequirement() {
        return this.requirement;
    }
    
    public void setRequirement(final String requirement) {
        this.requirement = requirement;
    }
    
    public String getTransType() {
        return this.transType;
    }
    
    public void setTransType(final String transType) {
        this.transType = transType;
    }
    
    public String getTransId() {
        return this.transId;
    }
    
    public void setTransId(final String transId) {
        this.transId = transId;
    }
    
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(final String status) {
        this.status = status;
    }
    
    public String getStage() {
        return this.stage;
    }
    
    public void setStage(final String stage) {
        this.stage = stage;
    }
    
    public String getActivityFlag() {
        return this.activityFlag;
    }
    
    public void setActivityFlag(final String activityFlag) {
        this.activityFlag = activityFlag;
    }
    
    public String getTxtFromAge() {
        return this.txtFromAge;
    }
    
    public void setTxtFromAge(final String txtFromAge) {
        this.txtFromAge = txtFromAge;
    }
    
    public String getSmoker() {
        return this.smoker;
    }
    
    public void setSmoker(final String smoker) {
        this.smoker = smoker;
    }
    
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(final String gender) {
        this.gender = gender;
    }
    
    public String getFromTerm() {
        return this.fromTerm;
    }
    
    public void setFromTerm(final String fromTerm) {
        this.fromTerm = fromTerm;
    }
    
    public String getPrmRate() {
        return this.prmRate;
    }
    
    public void setPrmRate(final String prmRate) {
        this.prmRate = prmRate;
    }
    
    public String getFromSI() {
        return this.fromSI;
    }
    
    public void setFromSI(final String fromSI) {
        this.fromSI = fromSI;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(final String email) {
        this.email = email;
    }
    
    public String getPrdBasicId() {
        return this.prdBasicId;
    }
    
    public void setPrdBasicId(final String prdBasicId) {
        this.prdBasicId = prdBasicId;
    }
    
    public String getAnnualPremium() {
        return this.AnnualPremium;
    }
    
    public void setAnnualPremium(final String annualPremium) {
        this.AnnualPremium = annualPremium;
    }
    
    public String getMonthlyPremium() {
        return this.MonthlyPremium;
    }
    
    public void setMonthlyPremium(final String monthlyPremium) {
        this.MonthlyPremium = monthlyPremium;
    }
    
    public String getSinglePremium() {
        return this.SinglePremium;
    }
    
    public void setSinglePremium(final String singlePremium) {
        this.SinglePremium = singlePremium;
    }
    
    public String getSemiannuallyPremium() {
        return this.SemiannuallyPremium;
    }
    
    public void setSemiannuallyPremium(final String semiannuallyPremium) {
        this.SemiannuallyPremium = semiannuallyPremium;
    }
    
    public String getGSTOnRider() {
        return this.GSTOnRider;
    }
    
    public void setGSTOnRider(final String gSTOnRider) {
        this.GSTOnRider = gSTOnRider;
    }
    
    public String getServiceTax() {
        return this.ServiceTax;
    }
    
    public void setServiceTax(final String serviceTax) {
        this.ServiceTax = serviceTax;
    }
    
    public String getTotalGST() {
        return this.TotalGST;
    }
    
    public void setTotalGST(final String totalGST) {
        this.TotalGST = totalGST;
    }
    
    public String getTotalPremium() {
        return this.TotalPremium;
    }
    
    public void setTotalPremium(final String totalPremium) {
        this.TotalPremium = totalPremium;
    }
    
    public String getQuarterlyPremium() {
        return this.QuarterlyPremium;
    }
    
    public void setQuarterlyPremium(final String quarterlyPremium) {
        this.QuarterlyPremium = quarterlyPremium;
    }
    
    public String getRiderPremium() {
        return this.RiderPremium;
    }
    
    public void setRiderPremium(final String riderPremium) {
        this.RiderPremium = riderPremium;
    }
    
    public String getGSTOnBase() {
        return this.GSTOnBase;
    }
    
    public void setGSTOnBase(final String gSTOnBase) {
        this.GSTOnBase = gSTOnBase;
    }
    
    public String getBasePremium() {
        return this.BasePremium;
    }
    
    public void setBasePremium(final String basePremium) {
        this.BasePremium = basePremium;
    }
    
    public String getDailyPremium() {
        return this.DailyPremium;
    }
    
    public void setDailyPremium(final String dailyPremium) {
        this.DailyPremium = dailyPremium;
    }
    
    public String getLineOfBusiness() {
        return this.lineOfBusiness;
    }
    
    public void setLineOfBusiness(final String lineOfBusiness) {
        this.lineOfBusiness = lineOfBusiness;
    }
    
    public String getProposalNo() {
        return this.proposalNo;
    }
    
    public void setProposalNo(final String proposalNo) {
        this.proposalNo = proposalNo;
    }
    
    public String getFullName() {
        return this.fullName;
    }
    
    public void setFullName(final String fullName) {
        this.fullName = fullName;
    }
    
    public String getDateOfBirth() {
        return this.dateOfBirth;
    }
    
    public void setDateOfBirth(final String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public String getNRIC1() {
        return this.NRIC1;
    }
    
    public void setNRIC1(final String nRIC1) {
        this.NRIC1 = nRIC1;
    }
    
    public boolean getIsSmoker() {
        return this.isSmoker;
    }
    
    public void setIsSmoker(final boolean isSmoker) {
        this.isSmoker = isSmoker;
    }
    
    public String getSumAssured() {
        return this.sumAssured;
    }
    
    public void setSumAssured(final String sumAssured) {
        this.sumAssured = sumAssured;
    }
    
    public String getOccupation() {
        return this.occupation;
    }
    
    public void setOccupation(final String occupation) {
        this.occupation = occupation;
    }
    
    public String getOtherOccupation() {
        return this.otherOccupation;
    }
    
    public void setOtherOccupation(final String otherOccupation) {
        this.otherOccupation = otherOccupation;
    }
    
    public String getNatureOfBusiness() {
        return this.natureOfBusiness;
    }
    
    public void setNatureOfBusiness(final String natureOfBusiness) {
        this.natureOfBusiness = natureOfBusiness;
    }
    
    public String getOtherBusiness() {
        return this.otherBusiness;
    }
    
    public void setOtherBusiness(final String otherBusiness) {
        this.otherBusiness = otherBusiness;
    }
    
    public String getAnnualIncome() {
        return this.annualIncome;
    }
    
    public void setAnnualIncome(final String annualIncome) {
        this.annualIncome = annualIncome;
    }
    
    public String getMobile() {
        return this.mobile;
    }
    
    public void setMobile(final String mobile) {
        this.mobile = mobile;
    }
    
    public String getTerm() {
        return this.term;
    }
    
    public void setTerm(final String term) {
        this.term = term;
    }
    
    public String getChannelCode() {
        return this.channelCode;
    }
    
    public void setChannelCode(final String channelCode) {
        this.channelCode = channelCode;
    }
    
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(final String userName) {
        this.userName = userName;
    }
    
    public String getMailingAddsL1() {
        return this.mailingAddsL1;
    }
    
    public void setMailingAddsL1(final String mailingAddsL1) {
        this.mailingAddsL1 = mailingAddsL1;
    }
    
    public String getMailingAddsL2() {
        return this.mailingAddsL2;
    }
    
    public void setMailingAddsL2(final String mailingAddsL2) {
        this.mailingAddsL2 = mailingAddsL2;
    }
    
    public String getMailingPostCode() {
        return this.mailingPostCode;
    }
    
    public void setMailingPostCode(final String mailingPostCode) {
        this.mailingPostCode = mailingPostCode;
    }
    
    public String getMailingCity() {
        return this.mailingCity;
    }
    
    public void setMailingCity(final String mailingCity) {
        this.mailingCity = mailingCity;
    }
    
    public String getMailingState() {
        return this.mailingState;
    }
    
    public void setMailingState(final String mailingState) {
        this.mailingState = mailingState;
    }
    
    public String getHomeAddsL1() {
        return this.homeAddsL1;
    }
    
    public void setHomeAddsL1(final String homeAddsL1) {
        this.homeAddsL1 = homeAddsL1;
    }
    
    public String getHomeAddsL2() {
        return this.homeAddsL2;
    }
    
    public void setHomeAddsL2(final String homeAddsL2) {
        this.homeAddsL2 = homeAddsL2;
    }
    
    public String getHomePostCode() {
        return this.homePostCode;
    }
    
    public void setHomePostCode(final String homePostCode) {
        this.homePostCode = homePostCode;
    }
    
    public String getHomeCity() {
        return this.homeCity;
    }
    
    public void setHomeCity(final String homeCity) {
        this.homeCity = homeCity;
    }
    
    public String getHomeState() {
        return this.homeState;
    }
    
    public void setHomeState(final String homeState) {
        this.homeState = homeState;
    }
    
    public String getChkHomeAddress() {
        return this.chkHomeAddress;
    }
    
    public void setChkHomeAddress(final String chkHomeAddress) {
        this.chkHomeAddress = chkHomeAddress;
    }
    
    public String getShare() {
        return this.share;
    }
    
    public void setShare(final String share) {
        this.share = share;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public String getNRIC() {
        return this.NRIC;
    }
    
    public void setNRIC(final String nRIC) {
        this.NRIC = nRIC;
    }
    
    public String getDob() {
        return this.dob;
    }
    
    public void setDob(final String dob) {
        this.dob = dob;
    }
    
    public String getNationality() {
        return this.nationality;
    }
    
    public void setNationality(final String nationality) {
        this.nationality = nationality;
    }
    
    public String getRelationship() {
        return this.relationship;
    }
    
    public void setRelationship(final String relationship) {
        this.relationship = relationship;
    }
    
    public String getIsMinor() {
        return this.isMinor;
    }
    
    public void setIsMinor(final String isMinor) {
        this.isMinor = isMinor;
    }
    
    public String getIsAddresSame() {
        return this.isAddresSame;
    }
    
    public void setIsAddresSame(final String isAddresSame) {
        this.isAddresSame = isAddresSame;
    }
    
    public String getAddress1() {
        return this.address1;
    }
    
    public void setAddress1(final String address1) {
        this.address1 = address1;
    }
    
    public String getAddress2() {
        return this.address2;
    }
    
    public void setAddress2(final String address2) {
        this.address2 = address2;
    }
    
    public String getPostCode() {
        return this.postCode;
    }
    
    public void setPostCode(final String postCode) {
        this.postCode = postCode;
    }
    
    public String getCity() {
        return this.city;
    }
    
    public void setCity(final String city) {
        this.city = city;
    }
    
    public String getState() {
        return this.state;
    }
    
    public void setState(final String state) {
        this.state = state;
    }
    
    public String getSequence2() {
        return this.sequence2;
    }
    
    public void setSequence2(final String sequence2) {
        this.sequence2 = sequence2;
    }
    
    public String getName1() {
        return this.name1;
    }
    
    public void setName1(final String name1) {
        this.name1 = name1;
    }
    
    public String getNRIC2() {
        return this.NRIC2;
    }
    
    public void setNRIC2(final String nRIC2) {
        this.NRIC2 = nRIC2;
    }
    
    public String getDob1() {
        return this.dob1;
    }
    
    public void setDob1(final String dob1) {
        this.dob1 = dob1;
    }
    
    public String getNationality1() {
        return this.nationality1;
    }
    
    public void setNationality1(final String nationality1) {
        this.nationality1 = nationality1;
    }
    
    public String getRelationship1() {
        return this.relationship1;
    }
    
    public void setRelationship1(final String relationship1) {
        this.relationship1 = relationship1;
    }
    
    public String getIsMinor1() {
        return this.isMinor1;
    }
    
    public void setIsMinor1(final String isMinor1) {
        this.isMinor1 = isMinor1;
    }
    
    public String getProductName() {
        return this.productName;
    }
    
    public void setProductName(final String productName) {
        this.productName = productName;
    }
    
    public String getPolicyNo() {
        return this.policyNo;
    }
    
    public void setPolicyNo(final String policyNo) {
        this.policyNo = policyNo;
    }
    
    public String getRiderApplicable() {
        return this.riderApplicable;
    }
    
    public void setRiderApplicable(final String riderApplicable) {
        this.riderApplicable = riderApplicable;
    }
    
    public Integer getPregmonths() {
        return this.pregmonths;
    }
    
    public void setPregmonths(final Integer pregmonths) {
        this.pregmonths = pregmonths;
    }
    
    public int getHeight() {
        return this.height;
    }
    
    public void setHeight(final int height) {
        this.height = height;
    }
    
    public List<QuestionaireDetailsDO> getQuestionDetailsList() {
        return this.questionDetailsList;
    }
    
    public void setQuestionDetailsList(final List<QuestionaireDetailsDO> questionDetailsList) {
        this.questionDetailsList = questionDetailsList;
    }
    
    public List<NomineeDetailsDO> getNomineeDetailsList() {
        return this.nomineeDetailsList;
    }
    
    public void setNomineeDetailsList(final List<NomineeDetailsDO> nomineeDetailsList) {
        this.nomineeDetailsList = nomineeDetailsList;
    }
    
    public Boolean isGutkhaPanCnsumr() {
        return this.isGutkhaPanCnsumr;
    }
    
    public void setGutkhaPanCnsumr(final Boolean isGutkhaPanCnsumr) {
        this.isGutkhaPanCnsumr = isGutkhaPanCnsumr;
    }
    
    public String getGuthkaPanQnty() {
        return this.guthkaPanQnty;
    }
    
    public void setGuthkaPanQnty(final String guthkaPanQnty) {
        this.guthkaPanQnty = guthkaPanQnty;
    }
}
