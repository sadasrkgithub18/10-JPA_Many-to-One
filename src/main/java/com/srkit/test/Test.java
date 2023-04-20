package com.srkit.test;

import com.srkit.dao.LoanDAO;
import com.srkit.dao.impl.LoanDAOImpl;
import com.srkit.entity.Customer;
import com.srkit.entity.Loan;

public class Test 
{

	public static void main(String[] args) 
	{
	
		
		LoanDAO dao = new LoanDAOImpl(); 
		
		// Invoke saveLoan()
		
		/*
		Loan pLoan = new Loan();
		pLoan.setLoanId(101101);
		pLoan.setLoanType("PERSONAL LOAN");
		pLoan.setAmount(500000.00);
		
		
		Loan vLoan = new Loan();
		vLoan.setLoanId(202202);
		vLoan.setLoanType("VEHICLE LOAN");
		vLoan.setAmount(200000.00);
		
		Loan hLoan = new Loan();
		hLoan.setLoanId(303303);
		hLoan.setLoanType("HOME LOAN");
		hLoan.setAmount(1555000.00);
		
		
		Customer customer = new Customer();
		customer.setCustomerId(101);
		customer.setCustomerName("Manish");
		
		
		pLoan.setCustomer(customer);
		vLoan.setCustomer(customer);
		hLoan.setCustomer(customer);

		dao.saveLoan(pLoan);
		dao.saveLoan(vLoan);
		dao.saveLoan(hLoan);

		
		*/
		
		
		// Call fetchLoanDetailsById()
		
		/*
		 * Loan loan = dao.fetchLoanDetailsById(303303); System.out.println(loan);
		 * Customer c = loan.getCustomer(); System.out.println(c);
		 * 
		 */
		
		// call removeLoan()
		
		// dao.removeLoan(202202);
		
		
		
		
		
	}

}
