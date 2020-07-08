// A program to read only single Character

//there is not function called -->nextChar();
import java.util.Scanner;
//import java.lang.String;

import java.lang.*;


public class cube
{

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char c;
c=sc.next().charAt(0);
c=Character.toUpperCase(c);
System.out.println(c);
}


}