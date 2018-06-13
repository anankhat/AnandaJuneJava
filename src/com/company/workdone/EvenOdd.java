package com.company.workdone;
import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String[] args)
	{
		

	int n;
 
    Scanner sc=new Scanner(System.in);
     
    System.out.print("Enter any integer number: ");
    n=sc.nextInt();
    sc.close();

    

    if(n%2 ==1)
    {
    	System.out.println("Weired");
      }
      else {
          if (n >= 2 && n <= 5) 
          {
        	  System.out.println("Not Weired");
             
          } 
          else if (n >= 6 && n <= 20) {
              System.out.println("Weired");
          } else {
       System.out.println("Not Weired");
          }
      
       
      }

}
}
