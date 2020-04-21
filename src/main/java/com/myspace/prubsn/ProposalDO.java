package com.myspace.prubsn;

public class ProposalDO {
	private Integer proposalId;
	private MemberDetailsDO memberDetails;
	private ContractHolderDO contractHolder;
	private ProductDO productDO;

	@org.kie.api.definition.type.Label("discountOnBaseNRider")
	private java.lang.Boolean discountOnBaseNRider;

	@org.kie.api.definition.type.Label(value = "RuleName")
	private java.lang.String ruleName;
	@org.kie.api.definition.type.Label(value = "Decision")
	private java.lang.String decision;
	@org.kie.api.definition.type.Label(value = "Remarks")
	private java.lang.String remarks;

	public Integer getProposalId() {
		return this.proposalId;
	}

	public void setProposalId(final Integer proposalId) {
		this.proposalId = proposalId;
	}

	public MemberDetailsDO getMemberDetails() {
		return this.memberDetails;
	}

	public void setMemberDetails(final MemberDetailsDO memberDetails) {
		this.memberDetails = memberDetails;
	}

	public ContractHolderDO getContractHolder() {
		return this.contractHolder;
	}

	public void setContractHolder(final ContractHolderDO contractHolder) {
		this.contractHolder = contractHolder;
	}

	public ProductDO getProductDO() {
		return this.productDO;
	}

	public void setProductDO(final ProductDO productDO) {
		this.productDO = productDO;
	}

	public ProposalDO() {
	}

	public java.lang.Boolean getDiscountOnBaseNRider() {
		return this.discountOnBaseNRider;
	}

	public void setDiscountOnBaseNRider(java.lang.Boolean discountOnBaseNRider) {
		this.discountOnBaseNRider = discountOnBaseNRider;
	}

	public java.lang.String getRuleName() {
		return this.ruleName;
	}

	public void setRuleName(java.lang.String ruleName) {
		this.ruleName = ruleName;
	}

	public java.lang.String getDecision() {
		return this.decision;
	}

	public void setDecision(java.lang.String decision) {
		this.decision = decision;
	}

	public java.lang.String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(java.lang.String remarks) {
		this.remarks = remarks;
	}

	public ProposalDO(java.lang.Integer proposalId,
			com.myspace.prubsn.MemberDetailsDO memberDetails,
			com.myspace.prubsn.ContractHolderDO contractHolder,
			com.myspace.prubsn.ProductDO productDO,
			java.lang.Boolean discountOnBaseNRider, java.lang.String ruleName,
			java.lang.String decision, java.lang.String remarks) {
		this.proposalId = proposalId;
		this.memberDetails = memberDetails;
		this.contractHolder = contractHolder;
		this.productDO = productDO;
		this.discountOnBaseNRider = discountOnBaseNRider;
		this.ruleName = ruleName;
		this.decision = decision;
		this.remarks = remarks;
	}
}
