package com.majesco.prubsn.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.kie.api.runtime.ExecutionResults;
import org.kie.server.api.model.ServiceResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.majesco.prubsn.service.DroolsServiceImpl;
import com.myspace.prubsn.ContractHolderDO;
import com.myspace.prubsn.DroolsRequest;
import com.myspace.prubsn.MemberDetailsDO;
import com.myspace.prubsn.NomineeDetailsDO;
import com.myspace.prubsn.ProductDO;
import com.myspace.prubsn.ProposalDO;
import com.myspace.prubsn.QuestionaireDetailsDO;
import com.myspace.prubsn.VoucherDO;
import com.myspace.prubsn.detailedquotetwo;

@Controller
public class DroolsController {

	@Autowired
	DroolsServiceImpl droolsServiceImpl;

	private static final Logger logger = LoggerFactory.getLogger(DroolsController.class);

	@RequestMapping(value = "/drule/invokeGuvnorRules", method = RequestMethod.POST)
	public @ResponseBody Map<String, Object> executeRules(@RequestBody Map<String, Object> request) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		DroolsRequest droolsRequest=new DroolsRequest();
		Object detailedquotetwoObj=null;
		Object contractHolderDOObj = null;
		Object memberDetailsDOObj = null;
		Object nomineeDetailsDOObj = null;
		Object productDOObj = null;
		Object proposalDOObj = null;
		Object questionaireDetailsDOObj = null;
		Object voucherDOObj = null;
		
	    String Kie_username = null;
	    String Kie_password = null;
	    String Kie_url = null;
	    String Kie_container = null;
	    String Kie_session = null;

		ObjectMapper mapper = new ObjectMapper();

		try
		{
			Kie_username = (String)request.get("Kie_username");
			Kie_password = (String)request.get("Kie_password");
			Kie_url = (String)request.get("Kie_url");
			Kie_container = (String)request.get("Kie_container");
			Kie_session = (String)request.get("Kie_session");
			List<String> list = (List<String>) request.get("ruleSources");
			droolsRequest.setUrl(Kie_url);
			droolsRequest.setUsername(Kie_username);
			droolsRequest.setPassword(Kie_password);					
			droolsRequest.setSession(Kie_session);
			droolsRequest.setContainer(Kie_container);
			droolsRequest.setRuleSources(list);
			
			if (request.get("detailedquotetwo")!=null) {
				detailedquotetwoObj=(Object)request.get("detailedquotetwo");
				detailedquotetwo detailedquotetwo = (detailedquotetwo)mapper.convertValue(detailedquotetwoObj, Class.forName("com.myspace.prubsn.detailedquotetwo"));
				logger.debug(detailedquotetwo.toString());
				droolsRequest.setDetailedquotetwo(detailedquotetwo);
			}
			
			if (request.get("contractHolderDO")!=null) {
				contractHolderDOObj=(Object)request.get("contractHolderDO");
				ContractHolderDO contractHolderDO = (ContractHolderDO)mapper.convertValue(contractHolderDOObj, Class.forName("com.myspace.prubsn.ContractHolderDO"));
				logger.debug(contractHolderDO.toString());
				droolsRequest.setContractHolderDO(contractHolderDO);
			}
			
			if (request.get("memberDetailsDO")!=null) {
				memberDetailsDOObj=(Object)request.get("memberDetailsDO");
				MemberDetailsDO memberDetailsDO = (MemberDetailsDO)mapper.convertValue(memberDetailsDOObj, Class.forName("com.myspace.prubsn.MemberDetailsDO"));
				logger.debug(memberDetailsDO.toString());
				droolsRequest.setMemberDetailsDO(memberDetailsDO);
			}
			
			if (request.get("nomineeDetailsDO")!=null) {
				nomineeDetailsDOObj=(Object)request.get("nomineeDetailsDO");
				NomineeDetailsDO nomineeDetailsDO = (NomineeDetailsDO)mapper.convertValue(nomineeDetailsDOObj, Class.forName("com.myspace.prubsn.NomineeDetailsDO"));
				logger.debug(nomineeDetailsDO.toString());
				droolsRequest.setNomineeDetailsDO(nomineeDetailsDO);
			}
			
			if (request.get("productDO")!=null) {
				productDOObj=(Object)request.get("productDO");
				ProductDO productDO = (ProductDO)mapper.convertValue(productDOObj, Class.forName("com.myspace.prubsn.ProductDO"));
				logger.debug(productDO.toString());
				droolsRequest.setProductDO(productDO);
			}
			
			if (request.get("proposalDO")!=null) {
				proposalDOObj=(Object)request.get("proposalDO");
				ProposalDO proposalDO = (ProposalDO)mapper.convertValue(proposalDOObj, Class.forName("com.myspace.prubsn.ProposalDO"));
				logger.debug(proposalDO.toString());
				droolsRequest.setProposalDO(proposalDO);
			}
			
			if (request.get("questionaireDetailsDO")!=null) {
				questionaireDetailsDOObj=(Object)request.get("questionaireDetailsDO");
				QuestionaireDetailsDO questionaireDetailsDO = (QuestionaireDetailsDO)mapper.convertValue(questionaireDetailsDOObj, Class.forName("com.myspace.prubsn.QuestionaireDetailsDO"));
				logger.debug(questionaireDetailsDO.toString());
				droolsRequest.setQuestionaireDetailsDO(questionaireDetailsDO);
			}
			
			if (request.get("voucherDO")!=null) {
				voucherDOObj=(Object)request.get("voucherDO");
				VoucherDO voucherDO = (VoucherDO)mapper.convertValue(voucherDOObj, Class.forName("com.myspace.prubsn.VoucherDO"));
				logger.debug(voucherDO.toString());
				droolsRequest.setVoucherDO(voucherDO);
			}
			
			
			logger.info("*****Drools request Object" + droolsRequest.toString() + " ******");
			if(droolsRequest.getDetailedquotetwo()!=null)
			{
				ServiceResponse<ExecutionResults> response = droolsServiceImpl.executeRules(droolsRequest);
				
				
				if(response.getResult().getValue("detailedquotetwo")!=null)
				{
					detailedquotetwo detailed_quote_result = (detailedquotetwo) response.getResult().getValue("detailedquotetwo");
					logger.info(detailed_quote_result.toString());
					map.put("detailedquotetwo", detailed_quote_result );
				}
				if(response.getResult().getValue("ContractHolderDO")!=null)
				{
					ContractHolderDO contractHolderDO2 = (ContractHolderDO) response.getResult().getValue("ContractHolderDO");
					logger.info(contractHolderDO2.toString());
					map.put("ContractHolderDO", contractHolderDO2 );
				}
				if(response.getResult().getValue("MemberDetailsDO")!=null)
				{
					MemberDetailsDO memberDetailsDO2 = (MemberDetailsDO) response.getResult().getValue("MemberDetailsDO");
					logger.info(memberDetailsDO2.toString());
					map.put("MemberDetailsDO", memberDetailsDO2 );
				}
				if(response.getResult().getValue("NomineeDetailsDO")!=null)
				{
					NomineeDetailsDO nomineeDetailsDO2 = (NomineeDetailsDO) response.getResult().getValue("NomineeDetailsDO");
					logger.info(nomineeDetailsDO2.toString());
					map.put("NomineeDetailsDO", nomineeDetailsDO2 );
				}
				if(response.getResult().getValue("ProductDO")!=null)
				{
					ProductDO productDO2 = (ProductDO) response.getResult().getValue("ProductDO");
					logger.info(productDO2.toString());
					map.put("ProductDO", productDO2 );
				}
				if(response.getResult().getValue("ProposalDO")!=null)
				{
					ProposalDO proposalDO2 = (ProposalDO) response.getResult().getValue("ProposalDO");
					logger.info(proposalDO2.toString());
					map.put("ProposalDO", proposalDO2 );
				}
				if(response.getResult().getValue("QuestionaireDetailsDO")!=null)
				{
					QuestionaireDetailsDO questionaireDetailsDO2 = (QuestionaireDetailsDO) response.getResult().getValue("QuestionaireDetailsDO");
					logger.info(questionaireDetailsDO2.toString());
					map.put("QuestionaireDetailsDO", questionaireDetailsDO2 );
				}
				if(response.getResult().getValue("VoucherDO")!=null)
				{
					VoucherDO voucherDO2 = (VoucherDO) response.getResult().getValue("VoucherDO");
					logger.info(voucherDO2.toString());
					map.put("VoucherDO", voucherDO2 );
				}
				
			}
		
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
		return map;
	}
}
