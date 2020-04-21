package com.majesco.prubsn.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.kie.api.KieServices;
import org.kie.api.command.BatchExecutionCommand;
import org.kie.api.command.Command;
import org.kie.api.command.KieCommands;
import org.kie.api.runtime.ExecutionResults;
import org.kie.server.api.marshalling.MarshallingFormat;
import org.kie.server.api.model.ServiceResponse;
import org.kie.server.client.KieServicesClient;
import org.kie.server.client.KieServicesConfiguration;
import org.kie.server.client.KieServicesFactory;
import org.kie.server.client.RuleServicesClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.majesco.prubsn.controller.DroolsController;
import com.myspace.prubsn.ContractHolderDO;
import com.myspace.prubsn.DroolsRequest;
import com.myspace.prubsn.MemberDetailsDO;
import com.myspace.prubsn.NomineeDetailsDO;
import com.myspace.prubsn.ProductDO;
import com.myspace.prubsn.ProposalDO;
import com.myspace.prubsn.QuestionaireDetailsDO;
import com.myspace.prubsn.VoucherDO;
import com.myspace.prubsn.detailedquotetwo;

@Service("DroolsService")
public class DroolsServiceImpl {
	private static final Logger logger = LoggerFactory.getLogger(DroolsController.class);
	private static final MarshallingFormat FORMAT = MarshallingFormat.JAXB;
	
	@SuppressWarnings("deprecation")
	public ServiceResponse<ExecutionResults> executeRules(DroolsRequest droolsRequest) throws Exception {
		ServiceResponse<ExecutionResults> response = null;
		try {
			KieServicesConfiguration cfg = KieServicesFactory.newRestConfiguration(droolsRequest.getUrl(), droolsRequest.getUsername(), droolsRequest.getPassword());
			cfg.setMarshallingFormat(FORMAT);
			Set<Class<?>> extraClasses = new HashSet<Class<?>>();
			extraClasses.add(detailedquotetwo.class);extraClasses.add(ContractHolderDO.class);extraClasses.add(MemberDetailsDO.class);extraClasses.add(NomineeDetailsDO.class);
			extraClasses.add(ProductDO.class);extraClasses.add(ProposalDO.class);extraClasses.add(QuestionaireDetailsDO.class);extraClasses.add(VoucherDO.class);
			cfg.addJaxbClasses(extraClasses);
			KieServicesClient kieServicesClient = KieServicesFactory.newKieServicesClient(cfg);
			List<Command<?>> commands = new ArrayList<Command<?>>();
			KieCommands commandsFactory = KieServices.Factory.get().getCommands();
			if (droolsRequest.getDetailedquotetwo()!=null) {
				commands.add(commandsFactory.newInsert(droolsRequest.getDetailedquotetwo(), "detailedquotetwo"));
			}
			if (droolsRequest.getContractHolderDO()!=null) {
				commands.add(commandsFactory.newInsert(droolsRequest.getContractHolderDO(), "ContractHolderDO"));
			}
			if (droolsRequest.getMemberDetailsDO()!=null) {
				commands.add(commandsFactory.newInsert(droolsRequest.getMemberDetailsDO(), "MemberDetailsDO"));
			}
			if (droolsRequest.getNomineeDetailsDO()!=null) {
				commands.add(commandsFactory.newInsert(droolsRequest.getNomineeDetailsDO(), "NomineeDetailsDO"));
			}
			if (droolsRequest.getProductDO()!=null) {
				commands.add(commandsFactory.newInsert(droolsRequest.getProductDO(), "ProductDO"));
			}
			if (droolsRequest.getProposalDO()!=null) {
				commands.add(commandsFactory.newInsert(droolsRequest.getProposalDO(), "ProposalDO"));
			}
			if (droolsRequest.getQuestionaireDetailsDO()!=null) {
				commands.add(commandsFactory.newInsert(droolsRequest.getQuestionaireDetailsDO(), "QuestionaireDetailsDO"));
			}
			if (droolsRequest.getVoucherDO()!=null) {
				commands.add(commandsFactory.newInsert(droolsRequest.getVoucherDO(), "VoucherDO"));		
			}
			if (droolsRequest.getRuleSources()!=null) {
				for (String ruleName : droolsRequest.getRuleSources()) {
					commands.add(KieServices.Factory.get().getCommands().newAgendaGroupSetFocus(ruleName));
				}
			}
			commands.add(commandsFactory.newGetObjects("get-adapter"));
			BatchExecutionCommand batchExecution = commandsFactory.newBatchExecution(commands, droolsRequest.getSession());
			RuleServicesClient ruleServicesClient = kieServicesClient.getServicesClient(RuleServicesClient.class);
			response = ruleServicesClient.executeCommandsWithResults(droolsRequest.getContainer(),
					batchExecution);
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		
		return response;
	}

}
