import java.util.*;
import java.lang.*;
import java.io.*;


public class Solution
{
public static void main (String[] args) throws java.lang.Exception
	{
				//System.out.println();
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter String:");
				String s=sc.next();
				s=s.toUpperCase();
				System.out.println("Enter Key:");
				int key=sc.nextInt();
				String ss="";
				for(int i=0;i<s.length();i++)
				{
					int k=(int)s.charAt(i);
					
					k=((k-key-65)%26);
					
					if(k<0){
								k=26+k;
								
					}
						ss+=String.valueOf((char)(k+65));
				}
				
					System.out.println("Decrypted:"+ss);
	}
	
}











 