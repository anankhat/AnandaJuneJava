package com.company.dayfour;
import java.util.Scanner;

public class PrimeNumber 
{
	
	
	public static void main(String[] args)
	{
	
	int n;
	int  status=1;
	int num=3;
	
	Scanner Scan = new Scanner(System.in);
	n = Scan.nextInt();
	
	if (n>=1)
		
	{
		System.out.println("First" +n + "prime number are" );
		System.out.println(2);
	}
	
	for (int i=2;i<=n;)
	{
		for (int j=2 ;j <= Math.sqrt(num);j++)
		{
			if (num % j ==0)
			{
				status=0;
				break;
				
			}
		}
		if(status !=0)
		{
			System.out.println(num);
			i++;
		}
		status =1;
		num ++;
	}
	}
	

}

