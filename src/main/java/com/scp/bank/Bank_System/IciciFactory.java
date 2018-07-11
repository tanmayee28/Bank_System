package com.scp.bank.Bank_System;

public class IciciFactory extends BankFactory{

	@Override
	public Bank getFactory() {
		// TODO Auto-generated method stub
		return new IciciBank();
	}

}
