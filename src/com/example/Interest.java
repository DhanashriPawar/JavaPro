package com.example;

public class Interest {
	
	private float totalAmount;
	private float baseAmount;
	private int numberOfYears;
	private int rateOfInterest;

	public float calculateInterest(Accounts acc){
		
		totalAmount=baseAmount+(numberOfYears*rateOfInterest);
		System.out.println("saving total amount>>>>>>>>"+totalAmount);

		return totalAmount;

		
	}
	

	public float savinginterest(float baseAmount){
		
		totalAmount=baseAmount+(1*rateOfInterest);
		System.out.println("saving total  amount for one year>>>>>"+totalAmount);
		return totalAmount;
	}
	


}
