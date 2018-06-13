package com.company.dayTwo;

import java.util.Scanner;

public class FindLargetClass {
	
	public static void main(String[] args)
	
	{
		
		 Scanner num =new Scanner(System.in);
		int a ,b,c ;
		
		 System.out.println("Please Enter The First Number : ");
		 a =num .nextInt();
	
		 
		 System.out.println("Please Enter The Second Number : ");
		 b =num .nextInt();
	
		 System.out.println("Please Enter The Third Number : ");
		 c =num.nextInt();
		 
		 num.close();
		 
		 int temp =( a > b) ? a:b;
		 
		 int result =(c > temp) ? c :temp;
		 
		 System.out.println("Largets value is :" +result);
		 
		 
	}

}
