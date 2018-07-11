package com.scp.bank.Bank_System;


public class Customer {

		private int id;
		private String name;
		private String Address;
		private long mobno;
		private double bal;
		private String banktype;
		private double interest;
		public Customer(int id,String name, String address, long mobno, double bal, String banktype) {
			super();
			this.id=id;
			this.name = name;
			Address = address;
			this.mobno = mobno;
			this.bal = bal;
			this.banktype = banktype;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
		public long getMobno() {
			return mobno;
		}
		public void setMobno(int mobno) {
			this.mobno = mobno;
		}
		public double getInterest() {
			return interest;
		}
		public void setInterest(double interest) {
			this.interest = interest;
		}
		public void setBal(double bal)
		{
			this.bal=bal;
		}
		public double getBal()
		{
			return bal;
		}
		public String getBanktype() {
			return banktype;
		}
		public void setBanktype(String banktype) {
			this.banktype = banktype;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
	/*	public static Customer getCustomer(int id, String name,String address, long mobno,double bal,String banktype )
		{
			return new Customer(id, name,  address, mobno,  bal, banktype);
		}*/
		@Override
		public String toString() {
			//return "Id :" + id +"\t"+"Name :" + name + "\t"+"Address :" + Address + "\t"+ "Contact No :" + mobno +"\t" +"Your Current Balance :"
				//	+ bal +"\t"+"Bank Name :" + banktype +"\n";
			return "ID"+"\t"+"NAME"+"\t"+"ADDRESS"+"\t"+"CONTACT NO"+"\t"+"CURRENT BAL "+" BANK "+"\t"+"INTEREST"+"\n"+id+"\t"+name+"\t"+Address+"\t"+mobno+"\t"+bal+"\t"+banktype+"\t"+interest+"\n";
		}
	
		
		
}
