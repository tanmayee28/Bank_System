package com.scp.bank.Bank_System;

public class GetBankFactory {
	public static Bank getBankFactory(BankFactory factory)
	{
		return factory.getFactory();
	}
}
