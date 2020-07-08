/* 
Java BufferedInputStream class used to read information from File stream.
It internally uses buffer to make the performance fast

*/
import java.io.*;

public class cube
{
public static void main(String args[])throws IOException
{
FileInputStream fis=new FileInputStream("F:\\rv.txt");
BufferedInputStream bis=new BufferedInputStream(fis);
int i=0;
while((i=bis.read())!=-1)
try{

System.out.print((char)i	);
    }
catch(Exception e)
{System.out.println(e);}



}


}