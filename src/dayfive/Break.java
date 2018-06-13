package dayfive;

public class Break {
	
	public static void main (String [] args)
	
	{
		int num=0;
		while (num <=100)
		{
			System.out.println("Value of Num"+num);
			if(num==8)
			{
				break;
			}
				num++;
			}
			
			System.out.println("Out of While");
		}
	}

