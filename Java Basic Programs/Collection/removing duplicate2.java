//But in this the order doesnt get preserved
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
	System.out.println("Before:"+ls+"\n\n");
		Set<String> st=new HashSet<String>();
		st.addAll(ls);
		ls.clear();
		ls.addAll(st);
		

		System.out.println("After:"+ls);	
	}

}




/*  		Here is the variton in the code*/


class cube
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);	

		List<Object> ls=new ArrayList<Object>();
		
		ls.add("Java");
		ls.add("AS");
		ls.add("va");
		ls.add("Java");
		ls.add("5");
		ls.add(1);
		ls.add("2");
		ls.add("5");
	System.out.println("Before:"+ls+"\n\n");
		Set<Object> st=new HashSet<Object>();
		st.addAll(ls);
		ls.clear();
		ls.addAll(st);
		

		System.out.println("After:"+ls);	
	}



}