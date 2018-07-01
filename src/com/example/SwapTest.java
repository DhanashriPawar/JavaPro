import java.util.Scanner;


public class SwapTest {
	static int firstNo;
	static int secondNo;
	static int tempNo=0;
	public static void swap(){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter First no");
		firstNo=scan.nextInt();	
		System.out.println("Enter Second no");
		secondNo=scan.nextInt();
		System.out.println("Before swap............");
		display();
		
		tempNo=firstNo;
		firstNo=secondNo;
		secondNo=tempNo;
	}
	
	public static void display(){
		
		System.out.println("FirstNo-->"+firstNo);
		System.out.println("SecondNo-->"+secondNo);
		
		
	}

}
