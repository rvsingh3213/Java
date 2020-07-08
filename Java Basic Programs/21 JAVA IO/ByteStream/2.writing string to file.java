import java.io.*;
import java.util.Scanner;


public class cube
{
public static void main(String args[])throws IOException
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter String:");

FileOutputStream fout=new FileOutputStream("F:\\rv.txt");
String s=sc.next();
byte b[]=s.getBytes();
try{
fout.write(b);
System.out.println("success");

}
catch(Exception e)
{System.out.println(e);}
}



}