package dayfive;

public class MethodInput {
	public static void main(String [] args)
	{
		
		System.out.println(SleepIn(true,false));
		System.out.println(SleepIn (false,false));
		
		System.out.println(SleepIn(false,true));
		
	}
	
		public static boolean SleepIn(boolean weekday,boolean vacation)
				{
			if (weekday ==true && vacation == false)
			{
				return true;
				
			}
			else 
				return false ;
				}
		{
			
		}
	}


