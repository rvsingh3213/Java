//reading single character from file
import java.io.*;

public class cube
{
public static void main(String args[])throws IOException
{

FileInputStream fis=new FileInputStream("F:\\rv.txt");


try{
int i=fis.read();
System.out.println((char)i);

}
catch(Exception e)
{System.out.println(e);}
}



}