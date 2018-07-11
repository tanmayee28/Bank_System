package com.scp.bank.Bank_System;

public class SbiFactory  extends BankFactory{

	@Override
	public Bank getFactory() {
		// TODO Auto-generated method stub
		return new SbiBank();
	}

}
