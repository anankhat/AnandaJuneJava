package com.company.dayfour;
import java.util.Scanner;


public class FibacSeries {
	
	public static void main (String [] args)
	{
		int num1,num2,num3,num4;
		num1=num2=1;


	
		System.out.println("Enter the Series of Fibonacie");
		Scanner fib  = new Scanner(System.in);
		int fibonace=fib.nextInt();

	
		for (num1 = 1; num1 <= fibonace; num1++) {

			num3 = num1 + num2;
			num1= num2;
			num2= num3;
		
		System.out.println( num1);
	}
}
}

/*


int count =15;
int num1= 0;
int num2 =1;

for (int i-1; i<-count;++1)
{
system.out.println(num1 +"")

int sumof PrevTwo=num1+num2;
num1=num2;
num2=sumOfPrevTwo;

}
}

*/