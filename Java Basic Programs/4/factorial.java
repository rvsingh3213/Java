import java.util.*;


public class cube
{	static long fac(int n1)
	{
	if(n1==0)
	return 1;
	if(n1>0)
	return n1*fac(n1-1);
	else
	return 0;

	}
public static void main(String args[])
{ 
Scanner sc=new Scanner(System.in);
int n1;
long f;
System.out.print("Enter NUmber:");
n1=sc.nextInt();
f=fac(n1);
System.out.println("Fsctorial Of Number:"+f);
}

}