package com.scp.bank.Bank_System;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class HdfcBank extends Bank{
	Scanner sc=new Scanner(System.in);
	static double totint;
	@Override
	double getBal() {
		double bal=0.0;
		System.out.println("Enter your id");
		int i=sc.nextInt();
	
		for(Customer c:li)
		{
			if(c.getId()==i)
			{
				bal=c.getBal();
			}
		}
		return bal ;
	}

	@Override
	double getInterest() {
		// TODO Auto-generated method stub
		double interest=0.0;
		System.out.println("Enter your id:");
		int id=sc.nextInt();
		Iterator<Customer>itr=li.iterator();
		for(Customer c:li)
		{
			if(c.getId()==id)
			{
				 interest=c.getBal()*0.09;
				 c.setInterest(interest);
				 totint+=interest;
			}
		}
		
		return interest;
	}
	double totalInterest()
	{
		return totint;
	}
	 public void getCustomerDetails() {
		 List<Customer>list=new ArrayList<Customer>();
		if(li.isEmpty())
		{
			System.out.println("No details to show..");
		}
		
		for(Customer c:li)
		{
			if(c.getBanktype().equalsIgnoreCase("HDFC"))
				
				list.add(c);
				
		}
		System.out.println(list);
		}
	 public void getDetails()
		{
			System.out.println("Enter your Bank Id:");
			int id=sc.nextInt();
			if(li.isEmpty())
			{
				System.out.println("There are no details to show..");
			}
			System.out.println();
			for(Customer c:li)
			{
				if(c.getId()==id)
				{
					System.out.println(c);
					
				}

			}
		}


	
}


