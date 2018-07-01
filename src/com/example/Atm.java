package com.example;

import java.util.Scanner;

public class Atm {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("What is name");
	    String name=sc.next();
	   System.out.println("address");
	   String address=sc.next();
	   System.out.println("Mobile");
	 long no=sc.nextLong();
	   System.out.println("Enter amount:");
	   int amt=sc.nextInt();
	   int th1=amt/1000; //1000 display
	   int th2=amt%1000;
	   System.out.println(th1);
	   int fh1=th2/500;  //500 display
	   int fh2=th2%500;
	   System.out.println(fh1);
	   int h1=fh2/100;
	   int h2=fh2%100;
	   System.out.println(h1);
	   System.out.println("Your Profile :"+"\nName--"+name+"\nAddress--"+address+"\nMobile no.--"+no);
	   System.out.println("Amount Withdrawn="+amt);
	   System.out.println("No. of notes:"+"\n1000:"+th1+"\n500:"+fh1+"\n100:"+h1);
	   
	}

}


















