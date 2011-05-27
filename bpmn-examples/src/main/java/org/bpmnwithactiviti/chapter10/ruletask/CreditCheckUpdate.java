package org.bpmnwithactiviti.chapter10.ruletask;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
import org.bpmnwithactiviti.chapter10.model.LoanApplicant;
import org.bpmnwithactiviti.chapter10.model.LoanApplication;

public class CreditCheckUpdate implements JavaDelegate {

	public void execute(DelegateExecution execution) {		
		LoanApplicant applicant = (LoanApplicant) execution.getVariable("loanApplicant");
		LoanApplication la = new LoanApplication();
		la.setApplicant(applicant);
		execution.setVariable("loanApplication", la);
	}

}
