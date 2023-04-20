package com.srkit.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.srkit.dao.LoanDAO;
import com.srkit.entity.Loan;


public class LoanDAOImpl implements LoanDAO 
{
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
	

	@Override
	public void saveLoan(Loan loan) 
	{
	
		EntityManager em = factory.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		try 
		{
			em.merge(loan);
			t.commit();
			System.out.println("Loan details persisted into Database...");
		} 
		catch(Exception e) 
		{
			t.rollback();
			e.printStackTrace();
		}
		finally 
		{
			em.close();
		}

	}

	@Override
	public Loan fetchLoanDetailsById(Integer loanId)
	{
		EntityManager em = factory.createEntityManager();
		Loan loan = em.find(Loan.class, loanId);
		em.close();
		return loan;
	}

	@Override
	public void removeLoan(Integer loanId) 
	{
	
		EntityManager em = factory.createEntityManager();
		EntityTransaction t = em.getTransaction();
		Loan entity = em.find(Loan.class, loanId);
		t.begin();
		try 
		{
			em.remove(entity);
			t.commit();
			System.out.println("Loan Object is removed from Database");
		}
		catch(Exception e) 
		{
			t.rollback();
			e.printStackTrace();
		}
		finally 
		{
			em.close();
		}
	}

}
