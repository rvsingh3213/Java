import java.util.Scanner;

class arm
{

public static void main(String arg[])
{
 Scanner sc=new Scanner(System.in);


System.out.println("Enter Number:"); 
int a=sc.nextInt();

int r,s=0;
int real=a;
while(a!=0)
{ r=a%10;
  s=s+r*r*r;
  a=a/10;

};

int k=2;
System.out.println("k="+(k^3));


System.out.println("S="+s);
System.out.println("real="+real);

if(real==s)
System.out.println("Yes Armstrong number");
else
System.out.println("Not Armstrong number");

sc.close();



}


}