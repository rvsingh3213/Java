
//https://www.codechef.com/problems/MISSING

import java.util.ArrayList;
import java.lang.*;
import java.io.*;
import java.util.*;
class Codechef {
   public static void main(String args[]){
     
	 Scanner sc=new Scanner(System.in);
	
	 int N=sc.nextInt();
	 
	 int x=0;
	 x=sc.nextInt();
	 int k=0;
	 int flag=0;
	 for(int i=1;i<N;i++)
	 {	
		k=sc.nextInt();
		if(flag==1)
			continue;
		 if((x+2)==k)
		{x+=2;	continue;}
			
		else{
			flag=1;
			x=x+2;
		}
			
	 }
	 
	 
	 int y=0;
	 int f2=0;
	 y=sc.nextInt();
	 for(int i=1;i<N;i++)
	 {	
		k=sc.nextInt();
		if(f2==1)
			continue;
		 if((y+2)==k)
		{y+=2;	continue;}
			
		else{
			f2=1;
			y=y+2;
		}
			
	 }
	 
	 System.out.println(x+" "+y);
   }
   
}
