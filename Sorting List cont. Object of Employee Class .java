import java.util.*;
import java.lang.*;
import java.io.*;


class Emp {
	
	public String a;
	public int b;
	
	
	
	Emp(String a,int b){
		this.a=a;
		this.b=b;
	}
	
	public String getA(){return this.a;}
	public int getId(){return this.b;}
	
}
 
public class Solution  
{  
public static void main (String[] args) throws java.lang.Exception
	{
		Emp e1=new Emp("acf",1);
		Emp e2=new Emp("abc",1);
		Emp e3=new Emp("aaa",1);
		Emp e4=new Emp("aaa",3);	
		ArrayList<Emp> list=new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		System.out.println("Before sorting");
		for(Emp e:list)
		{
			System.out.println(e.a+":"+e.b);
		}
		
		System.out.println("After sorting");
		Collections.sort(list,new Comparator<Emp>(){
			@Override
			public int compare(Emp e,Emp ee){
				int a=e.getA().compareTo(ee.getA());
				
				if(a==0){
				    ((Integer)e.getId()).compareTo((Integer)ee.getId());
				    
				}
				return a;
			}
			
		});
					  
		for(Emp e:list)
		{
			System.out.println(e.a+":"+e.b);
		}
		
	}

	
}