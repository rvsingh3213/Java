//concepts used argument passing.use of this keyword,returning object

import java.util.*;

class Distance
{
int feet,inch;

		Distance()
		{feet=inch=0;}

		Distance add(Distance d2)
	{	Distance temp=new Distance();
		temp.feet=this.feet+d2.feet;
		temp.inch=this.inch+d2.inch;
		if(temp.inch>=12)
		{
		temp.feet++;
		temp.inch-=12;
		}
		
			
	       return temp;

	}


}
	
public class cube
{

public static void main(String args[])
{ 
Scanner sc=new Scanner(System.in);
Distance d1=new Distance();	
Distance d2=new Distance();
System.out.println("Enter DIS1:\n"+"Feet1:");
d1.feet=sc.nextInt();
System.out.println("Enter DIS1:\n"+"inch1:");
d1.inch=sc.nextInt();
System.out.println("Enter DIS2:\n"+"Feet2:");
d2.feet=sc.nextInt();
System.out.println("Enter DIS2:\n"+"inch2:");
d2.inch=sc.nextInt();
Distance d3=d1.add(d2);

System.out.println("D3 feet:"+d3.feet+"\n inch"+d3.inch);
}

}