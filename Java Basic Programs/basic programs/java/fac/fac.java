import java.util.Scanner;


class fac
{


  	static int factorial(int f)
     {
 		int fac=1;
		for(int i=f;i>1;i--)
		fac=fac*i;

		return fac;
	}

public static void main(String arg[])
{
 Scanner sc=new Scanner(System.in);


System.out.println("Enter Number:"); 

int a=sc.nextInt();
int y=factorial(a);

System.out.println("\n\nFactorial is:"+ y );


sc.close();


}

}