package com.compnay.controlflow;
import java.util.Scanner;

public class PositiveNegativeNumber {
	
	public static void main(String[] args)
	{
		

	int num;
 
    Scanner sc=new Scanner(System.in);
     
    System.out.print("Enter any integer number: ");
    num=sc.nextInt();
    
    sc.close();
   
     
    if(num %2 == 0 && num >=100)
    {
        System.out.println(num +  " is even numner weired.");
    }
    
    
    else
    {
        System.out.println("Is odd number.");
}

}
}
	
	