//converting string to char array
//converting char array to uppecase

import java.util.*;



public class cube
{	
	
public static void main(String args[])
{ 
String s1="this is The lower case array";

char arr[]=s1.toCharArray();
for(int i=0;i<arr.length;i++)
arr[i]=Character.toUpperCase(arr[i]);

System.out.print("Uppercase arr[]:");
System.out.print(arr);

}



}

