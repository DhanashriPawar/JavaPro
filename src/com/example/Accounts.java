package com.example;

public class Accounts {
	protected static String name;
	protected static int account_number;
	protected static String email;
	protected int rateOfInterest;
	protected static Branch branch;
	
	public Accounts(String name, int account_number,String email){		
		   this.name=name;
		   this.account_number=account_number;
		   this.email=email;
		   this.branch=branch;
	}
	public static String getName() {
		return name;
	}



	public static void setName(String name) {
		Accounts.name = name;
	}



	public static int getAccount_number() {
		return account_number;
	}



	public static void setAccount_number(int account_number) {
		Accounts.account_number = account_number;
	}



	public static String getEmail() {
		return email;
	}



	public static void setEmail(String email) {
		Accounts.email = email;
	}



	public int getRateOfInterest() {
		return rateOfInterest;
	}



	public void setRateOfInterest(int rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}



	public static Branch getBranch() {
		return branch;
	}



	public static void setBranch(Branch branch) {
		Accounts.branch = branch;
	}




	
	

	protected static void displyAccountInfo(){
		System.out.println("name >>"+name+"\naccount_number>>"+account_number+"\nemail>>"+email+"\nbranch.."+branch);
	}
	
	

	
}
