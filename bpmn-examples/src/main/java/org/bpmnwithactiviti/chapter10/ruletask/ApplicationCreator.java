package org.bpmnwithactiviti.chapter10.ruletask;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
import org.bpmnwithactiviti.chapter10.model.LoanApplicant;

public class ApplicationCreator implements JavaDelegate {

	public void execute(DelegateExecution execution) {
		LoanApplicant applicant = new LoanApplicant();
		applicant.setName((String) execution.getVariable("name"));
		applicant.setIncome((Integer) execution.getVariable("income"));
		applicant.setLoanAmount((Integer) execution.getVariable("loanAmount"));
		applicant.setEmailAddress((String) execution.getVariable("emailAddress"));
		execution.setVariable("loanApplicant", applicant);
	}

}
