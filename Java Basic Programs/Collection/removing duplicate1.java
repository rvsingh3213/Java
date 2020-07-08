import java.util.*;

//Finding all the Substrings of String



class cube
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);	

		List<String> ls=new ArrayList<String>();
		
		ls.add("Java");
		ls.add("AS");
		ls.add("va");
		ls.add("Java");
		ls.add("5");
		ls.add("1");
		ls.add("2");
		ls.add("5");
	
		System.out.println("Before removing="+ls+"\n\n");

		for(int i=0;i<ls.size();i++)
		 {
			for(int j=i+1;j<ls.size();j++)
			{
				if(ls.get(i).equals(ls.get(j)))
				 { ls.remove(j); j--;  }

				
			}		 


     		  }
		

		System.out.println("After:"+ls);	
	}



}