package com.company.dayTwo;

public class DataTypes {

	public static void main (String[] args)

{
		int num1 =100;
		int num2=20;
		/*Basic Arthematic */
		
		System.out.println("num1 + num 2 :" + (num1 + num2));
		
		System.out.println("num1 - num 2 :" + (num1 - num2));
		System.out.println("num1 * num2 : " + (num1 * num2));
		System.out.println("num1 / num2 : " + (num1 / num2));
		System.out.println("num1 % num2 : " + (num1 % num2));
		
		
		/*Assignment Variable */
		
		//=,+=,-=,*=,/= and %=   Preceed by the variable that is at first
		
		num2 = num1;
		System.out.println("Please Check the number :" + num2);
		
		num2 += num1;
		System.out.println(num2);
		
		num2 -= num1;
		System.out.println(num2);
		
		num2 *= num1;
		System.out.println(num2);
		
		num2 /= num1;
		System.out.println(num2);
		
		num2 %= num1;
		System.out.println(num2);
		
		/* AutoIncrement and Auto Decrement */
		
		int num3=1;
		System.out.println (++num3);
		
		int num4=1;
		System.out.println(-- num4);
		
		//Logical Operators
		
		boolean b1 =true;
		boolean b2 =false;
		
		System.out.println(b1 && b2);
		System.out.println(b1||b2);
		System.out.println (!(b1 && b2);
		
		
				
}	
}
