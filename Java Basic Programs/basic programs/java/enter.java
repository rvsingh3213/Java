import java.util.Scanner;

public class enter
{

public static void main(String arg[])
{
 Scanner sc=new Scanner(System.in);


System.out.println("Enter roll no.:"); 
int a=sc.nextInt();
System.out.println("Enter name:");
String name=sc.next();
System.out.println("Entrer Fee.:");
Double d=sc.nextDouble();


System.out.println(a);
System.out.println(name);
System.out.println(d);
sc.close();



}


}