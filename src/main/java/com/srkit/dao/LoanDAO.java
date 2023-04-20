package com.srkit.dao;

import com.srkit.entity.Loan;

public interface LoanDAO 
{

	void saveLoan(Loan loan);
	
	Loan fetchLoanDetailsById(Integer loanId);
	
	void removeLoan(Integer loanId);
	
	
}
