package com.example;

import java.util.Scanner;

public class Current extends Accounts{

	float baseAmount;
    float totalAmount;
	
	
	public Current(){
		super(name, account_number, email);
		
		this.rateOfInterest=9;
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
public float currentinterest(float baseAmount){
		
		totalAmount=baseAmount+(1*rateOfInterest);
		System.out.println("current total  amount for one year>>"+totalAmount);
		return totalAmount;
	}
	
	
	public float currentinterest(float baseAmount, int numberOfYears) {
		totalAmount=baseAmount+(numberOfYears*rateOfInterest);
		System.out.println("current total amount>>"+totalAmount);

		return totalAmount;

		
	
}
}
