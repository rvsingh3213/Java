//String class finctions

//boolean equals()---to check equalit of 2 strings
//int length() ---to find length of string
//char charAt(index)---to get character at particular index



import java.util.*;


public class cube
{	
	
public static void main(String args[])
{ 

String s1="First String";
String s2="Second String";
System.out.println("S1="+s1);

System.out.println("S2="+s2);
if(s1.equals(s2))
System.out.println("Strings Are Equal");
else
System.out.println("Strings Are NOt Equal");

System.out.println("\n\nLength of S1:"+s1.length());
System.out.println("\nLength of S2:"+s2.length());

System.out.println("\n\nChar of S1 at index 3:"+s1.charAt(3));




}

}