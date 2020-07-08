import java.io.*;

public class cube
{
public static void main(String args[])throws IOException
{

FileOutputStream fout=new FileOutputStream("F:\\rv.txt");

try{
fout.write('b');
System.out.println("success");
}
catch(Exception e)
{System.out.println(e);}
}



}