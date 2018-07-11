package com.scp.bank.Bank_System;
import java.util.Scanner;

public class OptionsClass {
	 
	static void get(Bank bank)
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter which operation you want to perform (1.CreatAccount 2.UpdateBalance 3.DeleteAccount "
				+ "4.getDetails 5.getInterest 6.getBal 7.TotalCustomers 8.TotalInterest 9.exit)");
		int i=sc.nextInt();
		
		switch(i)
		{
				case 1: bank.CreateAccount();
						break;
				case 2:bank.UpdateBalance();
						break;
				case 3:bank.DeleteAccount();
						break;
				case 4: bank.getDetails();
						break;
				case 5:
					 	double interest=bank.getInterest();
					 	System.out.println("Interest on Your current Balance Rs:"+interest);
						break;
				case 6:
						double bal=bank.getBal();
						System.out.println("your current Balance Rs :"+bal);
						break;
				case 7:
						bank.getCustomerDetails();
						break;
				case 8:
						double tot=bank.totalInterest();
						System.out.println("Total interest till date :"+tot);
						break;
				case 9:
						System.out.println("Please to Served you...");
						System.exit(0);
				default:
							System.out.println("Do you want us to serve you more:");
		}
		}
		

	}
}
