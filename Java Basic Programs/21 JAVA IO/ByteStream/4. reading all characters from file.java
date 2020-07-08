//reading single character from file
import java.io.*;

public class cube
{
public static void main(String args[])throws IOException
{

try{
FileInputStream fis=new FileInputStream("F:\\rv.txt");

int i=0;
while((i=fis.read())!=-1)
	{
	  
	  System.out.print((char)i);
	}
  fis.close();
}
catch(Exception e)
{System.out.println(e);}
}



}