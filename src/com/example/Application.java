package com.example;

import java.util.Scanner;

public class Application {
	
 static float baseAmount;

public static void main(String args[]){
	
	float rateOfInterest=0;
	int numberOfYears=0;
	
	Accounts acc=new Accounts("abc",23421,"abc@dspl.com");
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter base amount");
	baseAmount=scan.nextFloat();
	System.out.println("Enter number of years");
	numberOfYears = scan.nextInt();

	Saving savacc=new Saving();
	savacc.setBaseAmount(100);
	
	Accounts.displyAccountInfo();
	//savacc.savinginterest(baseAmount);
	//savacc.savinginterest(baseAmount,numberOfYears);
	
	Current curracc=new Current();
	Accounts.displyAccountInfo();
	curracc.currentinterest(baseAmount);
	curracc.currentinterest(baseAmount,numberOfYears);

}
}
