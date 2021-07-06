import java.util.*;
import java.lang.*;
import java.io.*;

/* Two Points to Remember
1. Class must implement Clone() method whose Clone Object has to be Created
2. Class whose Clone object to be Created must implement java.lang.Cloneable Interface
   otherwise it will throw CloneNotSupportedException when we call Clone() method.

*/

class Test implements Cloneable{
	
	int a,b;
	public Object clone() throws CloneNotSupportedException{
		
		return super.clone();
	} 
	
}
public class Solution  
{   
public static void main (String[] args) throws java.lang.Exception
	{	
		Test t=new Test();
		
		Test t1=t;
		
		Test t2=(Test)t.clone();
		System.out.println(t.hashCode()+" "+t1.hashCode()+" "+t2.hashCode());
	}

	
}


























/*
String s="4021 1234 567 1024";	

*/