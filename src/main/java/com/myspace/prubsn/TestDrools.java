package com.myspace.prubsn;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.kie.api.KieBase;
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

public class TestDrools {
	private static final MarshallingFormat FORMAT = MarshallingFormat.JAXB;
public static void main(String[] args) {
	detailedquotetwo detailedquotetwo = new detailedquotetwo();
	String url = "http://localhost:8080/kie-server/services/rest/server";
	String username = "kieserver";
	String password = "kieserver1!";
	String container = "PruBSN";
	String session = "ksession";
	KieServicesConfiguration cfg = KieServicesFactory.newRestConfiguration(url, username, password);
	cfg.setMarshallingFormat(FORMAT);
	Set<Class<?>> extraClasses = new HashSet<Class<?>>();

	extraClasses.add(detailedquotetwo.class);
	cfg.addJaxbClasses(extraClasses);
	KieServicesClient kieServicesClient = KieServicesFactory.newKieServicesClient(cfg);
	List<Command<?>> commands = new ArrayList<Command<?>>();
	KieCommands commandsFactory = KieServices.Factory.get().getCommands();
	commands.add(commandsFactory.newInsert(detailedquotetwo, "detailedquotetwo"));
	commands.add(commandsFactory.newFireAllRules());
	commands.add(commandsFactory.newGetObjects("get-adapter"));
	BatchExecutionCommand batchExecution = commandsFactory.newBatchExecution(commands, session);
	RuleServicesClient ruleServicesClient = kieServicesClient.getServicesClient(RuleServicesClient.class);
	ServiceResponse<ExecutionResults> response = ruleServicesClient.executeCommandsWithResults(container,
			batchExecution);
	detailedquotetwo detailed_quote = (detailedquotetwo) response.getResult().getValue("detailedquotetwo");
	
}
}