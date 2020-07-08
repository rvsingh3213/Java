import java.util.Scanner;

public class arm
{

public static void main(String arg[])
{
 Scanner sc=new Scanner(System.in);


System.out.println("Number"); 
int a=sc.nextInt();

int r,s=0;

while(a)
{ r=a%10;
  s=s+r^3;
  a=a/10;

};

if(a==s)
System.out.println("Yes Armstrong number");
else
System.out.println("Not Armstrong number");

sc.close();



}


}