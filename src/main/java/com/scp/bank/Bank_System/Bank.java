package com.scp.bank.Bank_System;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public abstract class Bank {
	static Scanner sc=new Scanner(System.in);
	public static List<Customer> li=new LinkedList<Customer>();
	abstract double getBal();
	abstract double getInterest();
	abstract void getDetails();
	abstract void getCustomerDetails();
	abstract double totalInterest();
	
	
	public static void CreateAccount() {
		// TODO Auto-generated method stub
		String name="";
		long no;
		int id;
		String address="",type="";
		double bal;
		Random rc=new Random();
		id=rc.nextInt(7000)+1;
		System.out.println("Enter your name:");
		name=sc.next();
		System.out.println("Enter your address:");
		address=sc.next();
		System.out.println("Enter your mobile no:");
		no=sc.nextLong();
		System.out.println("Enter your Bank Name :");
		type=sc.next();
		System.out.println("Enter Balance you want to add :");
		bal=sc.nextDouble();
		//Customer c=Customer.getCustomer(id,name,address,no,bal,type);
		Customer c=new Customer(id,name, address, no, bal,type);
		li.add(c);
		System.out.println("Account created.. ");
		System.out.println("your Account Id : "+id);
		
	}
	
		static public void DeleteAccount() {
		// TODO Auto-generated method stub
		System.out.println("Enter your bank id:");
		int id=sc.nextInt();
		for(Customer c:li)
		{
			if(c.getId()==id)
			{
				li.remove(c);
			}
			else {
				System.out.println("Account with this id doesnt exist");
			}
			
		}
		System.out.println("you have successfully deleted your account...");
		
	}
		
	static public void UpdateBalance() {
			// TODO Auto-generated method stub
			System.out.println("Enter your Bank Id:");
			int id=sc.nextInt();
			for(Customer c:li)
			{
					
					if(c.getId()==id)
					{
						System.out.println("You want to Deposite/Withdrow:");
						String str=sc.next();
						if(str.equalsIgnoreCase("Deposite"))
						{
							System.out.println("Enter Money You want to deposite:");
							double deposite=sc.nextDouble();
							c.setBal(c.getBal()+deposite);
						}
						if(str.equalsIgnoreCase("Withdrow"))
						{
							System.out.println("Enter Money You want to Withdrow:");
							double deposite=sc.nextDouble();
							c.setBal(c.getBal()-deposite);
						}
						System.out.println("successfully Updated");
					
			}
			

	}
}
}	
	

