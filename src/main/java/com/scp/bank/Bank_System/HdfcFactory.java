package com.scp.bank.Bank_System;

public class HdfcFactory extends BankFactory{

	@Override
	public Bank getFactory() {
		// TODO Auto-generated method stub
		return new HdfcBank();
	}

}
