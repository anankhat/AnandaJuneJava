package com.company.workdone;
import java.util.Scanner;
public class Home {
	
	
        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            System.out.println ("Enter The Number :" n);
            int n=sc.nextInt();            
            String output="";
            if(n%2==1){
              ans = "Weird";
            }
            else {
                if (n >= 2 && n <= 5) {
                    ans = "Not Weird";
                } else if (n >= 6 && n <= 20) {
                    ans = "Weird";
                } else {
                    ans = "Not Weird";
                }
            
     
            }
            System.out.println(ans);
            
        }
    }


If num is odd,print weired
If num is even and inclusive range of 2 to 5 ,print not weired

If num is even and inclusive range of 6 to 20 ,print weired

If num is even and  greater than , print not weired

