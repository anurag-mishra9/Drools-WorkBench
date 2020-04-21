package com.myspace.prubsn;

import java.util.List;

public class DroolsRequest {
	private detailedquotetwo detailedquotetwo;
	private	ContractHolderDO contractHolderDO;
	private MemberDetailsDO memberDetailsDO;
	private NomineeDetailsDO nomineeDetailsDO;
	private QuestionaireDetailsDO questionaireDetailsDO;
	private ProposalDO proposalDO;
	private ProductDO productDO;
	private VoucherDO voucherDO;
	private String url;
	private String username;
	private String password;
	private String container;
	private String session;
	private List<String> ruleSources;
	
	public List<String> getRuleSources() {
		return ruleSources;
	}
	public void setRuleSources(List<String> ruleSources) {
		this.ruleSources = ruleSources;
	}
	public ContractHolderDO getContractHolderDO() {
		return contractHolderDO;
	}
	public void setContractHolderDO(ContractHolderDO contractHolderDO) {
		this.contractHolderDO = contractHolderDO;
	}
	public MemberDetailsDO getMemberDetailsDO() {
		return memberDetailsDO;
	}
	public void setMemberDetailsDO(MemberDetailsDO memberDetailsDO) {
		this.memberDetailsDO = memberDetailsDO;
	}
	public NomineeDetailsDO getNomineeDetailsDO() {
		return nomineeDetailsDO;
	}
	public void setNomineeDetailsDO(NomineeDetailsDO nomineeDetailsDO) {
		this.nomineeDetailsDO = nomineeDetailsDO;
	}
	public QuestionaireDetailsDO getQuestionaireDetailsDO() {
		return questionaireDetailsDO;
	}
	public void setQuestionaireDetailsDO(QuestionaireDetailsDO questionaireDetailsDO) {
		this.questionaireDetailsDO = questionaireDetailsDO;
	}
	public ProposalDO getProposalDO() {
		return proposalDO;
	}
	public void setProposalDO(ProposalDO proposalDO) {
		this.proposalDO = proposalDO;
	}
	public ProductDO getProductDO() {
		return productDO;
	}
	public void setProductDO(ProductDO productDO) {
		this.productDO = productDO;
	}
	public VoucherDO getVoucherDO() {
		return voucherDO;
	}
	public void setVoucherDO(VoucherDO voucherDO) {
		this.voucherDO = voucherDO;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public detailedquotetwo getDetailedquotetwo() {
		return detailedquotetwo;
	}
	public void setDetailedquotetwo(detailedquotetwo detailedquotetwo) {
		this.detailedquotetwo = detailedquotetwo;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContainer() {
		return container;
	}
	public void setContainer(String container) {
		this.container = container;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	@Override
	public String toString() {
		return "DroolsRequest [detailedquotetwo=" + detailedquotetwo + ", url="
				+ url + ", username=" + username + ", password=" + password
				+ ", container=" + container + ", session=" + session + "]";
	}
	
	
	

}
