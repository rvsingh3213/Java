import java.util.*;

//Checking Lexicographical order od two Strings



class cube
{
	public static void main(String args[])
	{
		String s1="bcdf";
		String s2="bcdef";
		int check=0;
		check=s1.compareTo(s2);
		System.out.println(check+"\n");
		if(check>0)
	          {
			System.out.println(s2+"::"+s1);	   
		  }
		
		else if(check<0)
		  {
			System.out.println(s1+"::"+s2);	  
	
		  }	
		else
		System.out.println("Same Words");

		
					

		

	}



}