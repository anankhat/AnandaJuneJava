package com.company.workdone;
import java.util.Scanner;

public class SimpleCalculator {
	public static void main (String []args)
	{
	
	 Scanner calculator =new Scanner(System.in);
	 int num1;
	 int num2;
	 
	 int Sum;
	 int Subtract;
	 int Multiplication;
	 float Division;
	 
	 System.out.println("Please Enter The First Number : ");
	 num1 =calculator .nextInt();
	 calculator .nextLine();
	 
	 System.out.println("Please Enter The Second Number : ");
	 num2 =calculator .nextInt();
	 calculator .nextLine();
	 
	 Sum = (num1 + num2);
     System.out.println("The Sumation is :" + Sum);
     
     Subtract = (num1 - num2);
     System.out.println("The Substraction is : " + Subtract);
     
     Multiplication= (num1*num2);
     System.out.println("The Multiplication is : " + Multiplication);
     
	 Division = (num1/num2);
	 System.out.println("The Diviion is : " + Division );
	 
	 

}

}


