package com.scp.bank.Bank_System;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MainBankClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=HibernateUtil.sessionFactory();
		Session se=factory.openSession();
		Transaction tr=se.beginTransaction();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Bank Name :");
		String str=sc.next();
		if(str.equalsIgnoreCase("SBI"))
		{
			BankFactory b=new SbiFactory();
			Bank bank=GetBankFactory.getBankFactory(b);
			OptionsClass.get(bank);
		}else if(str.equalsIgnoreCase("ICICI"))
		{
			BankFactory b=new IciciFactory();
			Bank bank=GetBankFactory.getBankFactory(b);
			OptionsClass.get(bank);
		}else if(str.equalsIgnoreCase("HDFC"))
		{
			BankFactory b=new HdfcFactory();
			Bank bank=GetBankFactory.getBankFactory(b);
			OptionsClass.get(bank);
		}
			
		HibernateUtil.flushNCommit(se, tr);
		factory.close();
		}

}
