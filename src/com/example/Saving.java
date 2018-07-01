package com.example;



public class Saving extends Accounts {


	private float baseAmount;
    private float totalAmount;
	
   
	public Saving(){
		super(name, account_number, email);
		this.rateOfInterest=6;
	
	}
		
	public float getBaseAmount() {
		return baseAmount;
	}

	public void setBaseAmount(float baseAmount) {
		this.baseAmount = baseAmount;
	}

	public float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}

public float savinginterest(float baseAmount){
		
		totalAmount=baseAmount+(1*rateOfInterest);
		System.out.println("saving total  amount for one year>>>>>"+totalAmount);
		return totalAmount;
	}
	

public float calculateInterest(float baseAmount,int numberOfYears){
	
	totalAmount=baseAmount+(numberOfYears*rateOfInterest);
	System.out.println("saving total amount>>>>>>>>"+totalAmount);

	return totalAmount;

	
}
	
}
